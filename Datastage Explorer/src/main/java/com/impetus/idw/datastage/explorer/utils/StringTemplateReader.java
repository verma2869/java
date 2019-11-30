package com.impetus.idw.datastage.explorer.utils;

import java.io.File;
import java.util.Map;

import org.antlr.stringtemplate.PathGroupLoader;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplateGroupLoader;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
import org.apache.log4j.Logger;

import com.impetus.idw.datastage.explorer.exception.TemplateLoadingException;

public class StringTemplateReader {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(StringTemplateReader.class);

	/** The Constant BASE_STRING_TEMPLATE_NOT_LOADED_CORRECTLY. */
	private static final String BASE_STRING_TEMPLATE_NOT_LOADED_CORRECTLY = "Base string template not loaded correctly";

	/** The group. */
	private StringTemplateGroup group;

	/**
	 * Instantiates a new string template reader.
	 *
	 * @param templateDirectory
	 *            the template directory
	 * @param superTemplate
	 *            the super template
	 * @param templateGroup
	 *            the template group
	 */
	public StringTemplateReader(String templateDirectory, String templateGroup) {
		try {
			File templateDir = new File(templateDirectory);
			if (templateDir.exists() && templateDir.isDirectory()) {
				StringTemplateGroupLoader stringTemplateGroupLoader = new PathGroupLoader(templateDirectory, null);
				group = stringTemplateGroupLoader.loadGroup(templateGroup, DefaultTemplateLexer.class, null);
			} else {
				throw new TemplateLoadingException("Not able to locate template directory : " + templateDirectory);
			}
		} catch (Exception e) {
			LOGGER.error("Not able to to load base string template file", e);
		}

	}

	/**
	 * Extract.
	 *
	 * @param templateName
	 *            the template name
	 * @param attributes
	 *            the attributes
	 * @return the string
	 * @throws TemplateLoadingException
	 *             the template loading exception
	 */
	public String extract(String templateName, Map<String, Object> attributes) throws TemplateLoadingException {
		StringTemplate sqlScripttemplate = null;
		LOGGER.debug("template : " + templateName + "  attributes :: " + attributes);
		if (group != null) {

			sqlScripttemplate = group.getInstanceOf(templateName);
			for (String attribute : attributes.keySet()) {
				if (sqlScripttemplate.getFormalArguments().containsKey(attribute)) {
					sqlScripttemplate.setAttribute(attribute, attributes.get(attribute));
				}
			}
		} else {
			throw new TemplateLoadingException(BASE_STRING_TEMPLATE_NOT_LOADED_CORRECTLY);
		}
		return sqlScripttemplate.toString();
	}
}