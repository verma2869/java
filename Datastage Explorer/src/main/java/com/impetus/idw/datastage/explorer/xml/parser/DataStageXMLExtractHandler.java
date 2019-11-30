package com.impetus.idw.datastage.explorer.xml.parser;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.impetus.idw.datastage.dsx.parser.node.DatastageCollectionNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageJobNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageRecordNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageScriptNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageSubRecordNode;

/**
 * The Class DataStageXMLExtractHandler.
 */
public class DataStageXMLExtractHandler extends DefaultHandler {

	/** The Constant TYPE. */
	private static final String TYPE = "Type";

	/** The Constant NAME. */
	private static final String NAME = "Name";

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(DataStageXMLExtractHandler.class);

	/** The Constant JOB. */
	private static final String JOB = "job";

	/** The Constant RECORD. */
	private static final String RECORD = "record";

	/** The Constant COLLECTION. */
	private static final String COLLECTION = "collection";

	/** The Constant SUBRECORD. */
	private static final String SUBRECORD = "subrecord";

	/** The Constant PROPERTY. */
	private static final String PROPERTY = "property";

	/** The script. */
	private DatastageScriptNode script = new DatastageScriptNode();

	/** The file name. */
	private String fileName;

	/** The job node. */
	private DatastageJobNode jobNode;

	/** The record node. */
	private DatastageRecordNode recordNode;

	/** The collection node. */
	private DatastageCollectionNode collectionNode;

	/** The sub record node. */
	private DatastageSubRecordNode subRecordNode;

	/** The current node. */
	private String currentNode;

	/** The property name. */
	private String propertyName;

	/** The data. */
	private String data = "";

	/**
	 * Instantiates a new data stage XML extract handler.
	 *
	 * @param fileName
	 *            the file name
	 */
	public DataStageXMLExtractHandler(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Gets the script.
	 *
	 * @return the script
	 */
	public DatastageScriptNode getScript() {
		return script;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#startDocument()
	 */
	@Override
	public void startDocument() throws SAXException {
		LOGGER.info(String.format("Exraction started for file: %s", fileName));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#endDocument()
	 */
	@Override
	public void endDocument() throws SAXException {
		LOGGER.info(String.format("Exraction completed for file: %s", fileName));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
	 * java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase(JOB)) {
			this.extractJobs(attributes, qName);
		}
		if (qName.equalsIgnoreCase(RECORD)) {
			this.extractRecord(attributes, qName);
		}
		if (qName.equalsIgnoreCase(COLLECTION)) {
			this.extractCollection(attributes, qName);
		}
		if (qName.equalsIgnoreCase(SUBRECORD)) {
			this.extractSubRecord(attributes, qName);
		}
		if (qName.equalsIgnoreCase(PROPERTY)) {
			propertyName = attributes.getValue(0);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase(JOB)) {
			script.addJob(jobNode);
			jobNode = null;
		}
		if (qName.equalsIgnoreCase(RECORD) && jobNode != null) {
			jobNode.addRecord(recordNode);
			recordNode = null;
			currentNode = JOB;
		}
		if (qName.equalsIgnoreCase(COLLECTION) && recordNode != null) {
			recordNode.addCollection(collectionNode);
			collectionNode = null;
			currentNode = RECORD;
		}
		if (qName.equalsIgnoreCase(SUBRECORD) && collectionNode != null) {
			collectionNode.addSubRecord(subRecordNode);
			subRecordNode = null;
		}
		if (qName.equalsIgnoreCase(PROPERTY)) {
			this.extractProperty();
		}
	}

	/**
	 * Extract property.
	 */
	protected void extractProperty() {
		if (StringUtils.isNotEmpty(currentNode) && currentNode.equalsIgnoreCase(JOB) && jobNode != null) {
			jobNode.addProperty(propertyName, data.trim());
			data = "";
		} else if (StringUtils.isNotEmpty(currentNode) && currentNode.equalsIgnoreCase(RECORD) && recordNode != null) {
			recordNode.addProperty(propertyName, data.trim());
			data = "";
		}

		else if (StringUtils.isNotEmpty(currentNode) && currentNode.equalsIgnoreCase(SUBRECORD)
				&& subRecordNode != null) {
			subRecordNode.addProperty(propertyName, data.trim());
			data = "";
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String tmpValue = new String(ch, start, length);
		data = data + tmpValue;
	}

	/**
	 * Extract jobs.
	 *
	 * @param attributes
	 *            the attributes
	 * @param qName
	 *            the q name
	 */
	private void extractJobs(Attributes attributes, String qName) {
		currentNode = qName;
		jobNode = new DatastageJobNode();
		for (int i = 0; i < attributes.getLength(); i++) {
			jobNode.addProperty(attributes.getQName(i), attributes.getValue(i));
		}
	}

	/**
	 * Extract record.
	 *
	 * @param attributes
	 *            the attributes
	 * @param qName
	 *            the q name
	 */
	private void extractRecord(Attributes attributes, String qName) {
		currentNode = qName;
		recordNode = new DatastageRecordNode();
		for (int i = 0; i < attributes.getLength(); i++) {
			recordNode.addProperty(attributes.getQName(i), attributes.getValue(i));
		}
	}

	/**
	 * Extract collection.
	 *
	 * @param attributes
	 *            the attributes
	 * @param qName
	 *            the q name
	 */
	private void extractCollection(Attributes attributes, String qName) {
		currentNode = qName;
		collectionNode = new DatastageCollectionNode();
		for (int i = 0; i < attributes.getLength(); i++) {
			if (attributes.getQName(i).equalsIgnoreCase(NAME)) {
				collectionNode.setCollectionName(attributes.getValue(i));
			} else if (attributes.getQName(i).equalsIgnoreCase(TYPE)) {
				collectionNode.setCollectionType(attributes.getValue(i));
			}
		}
	}

	/**
	 * Extract sub record.
	 *
	 * @param attributes
	 *            the attributes
	 * @param qName
	 *            the q name
	 */
	private void extractSubRecord(Attributes attributes, String qName) {
		currentNode = qName;
		subRecordNode = new DatastageSubRecordNode();
		for (int i = 0; i < attributes.getLength(); i++) {
			subRecordNode.addProperty(attributes.getQName(i), attributes.getValue(i));
		}
	}
}
