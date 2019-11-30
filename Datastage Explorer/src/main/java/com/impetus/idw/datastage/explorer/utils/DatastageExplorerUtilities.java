package com.impetus.idw.datastage.explorer.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.apache.log4j.Logger;

import com.impetus.idw.datastage.explorer.exception.TemplateLoadingException;

/**
 * The Class DatastageExplorerUtilities.
 */
public class DatastageExplorerUtilities {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(DatastageExplorerUtilities.class);

	/** The template file. */
	private static File templatePath = null;

	/** The skip values. */
	private static List<String> skipValues = Arrays.asList("\\(20)");

	static {
		templatePath = getDataStageTemplatePath();
	}

	/**
	 * Gets the data stage template path.
	 *
	 * @return the data stage template path
	 */
	public static File getDataStageTemplatePath() {
		ClassLoader resource = DatastageExplorerUtilities.class.getClassLoader();
		return new File(resource.getResource("html-template.stg").getFile());
	}

	/**
	 * Gets the property vaule.
	 *
	 * @param properties
	 *            the properties
	 * @param key
	 *            the key
	 * @return the property vaule
	 */
	public static String getPropertyVaule(Map<String, String> properties, String key) {
		Optional<Entry<String, String>> consumer = properties.entrySet().stream()
				.filter(property -> property.getKey().equalsIgnoreCase(key)).findFirst();
		return consumer.isPresent() ? consumer.get().getValue() : null;
	}

	/**
	 * Match property.
	 *
	 * @param matchValue
	 *            the match value
	 * @param propertyKey
	 *            the property key
	 * @param properites
	 *            the properites
	 * @return true, if successful
	 */
	public static boolean matchProperty(String matchValue, String propertyKey, Map<String, String> properites) {
		String propertyValue = DatastageExplorerUtilities.getPropertyVaule(properites, propertyKey);
		return propertyValue != null && propertyValue.equalsIgnoreCase(matchValue);
	}

	/**
	 * Extract from template.
	 *
	 * @param templateName
	 *            the template name
	 * @param attributes
	 *            the attributes
	 * @return the string
	 */
	public static String extractFromTemplate(String templateName, Map<String, Object> attributes) {
		final StringTemplateReader stringTemplateReader = new StringTemplateReader(templatePath.getParent(),
				"html-template");
		try {
			return stringTemplateReader.extract(templateName, attributes);
		} catch (TemplateLoadingException e) {
			LOGGER.error("Error while template extraction.", e);
			return "";
		}
	}

	/**
	 * Gets the list from string.
	 *
	 * @param inputString
	 *            the input string
	 * @param delimiter
	 *            the delimiter
	 * @return the list from string
	 */
	public static List<String> getListFromString(String inputString, String delimiter) {
		List<String> list = new ArrayList<>();
		String[] split = inputString.split(delimiter);
		for (String string : split) {
			if (!string.trim().isEmpty() && !skipValues.contains(string.trim()))
				list.add(string);
		}
		return list;
	}

	/**
	 * Instantiates a new datastage explorer utilities.
	 */
	private DatastageExplorerUtilities() {

	}
}
