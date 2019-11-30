package com.impetus.idw.datastage.explorer.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.impetus.idw.datastage.dsx.parser.antlr.lexerparser.Datastage_DSXLexer;
import com.impetus.idw.datastage.dsx.parser.antlr.lexerparser.Datastage_DSXParser;
import com.impetus.idw.datastage.dsx.parser.antlr.lexerparser.Datastage_DSXParser.datastage_dsx_script_return;
import com.impetus.idw.datastage.dsx.parser.antlr.walker.Datastage_DSXWalker;
import com.impetus.idw.datastage.dsx.parser.node.DatastageAbstractNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageJobNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageRecordNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageScriptNode;
import com.impetus.idw.datastage.explorer.exception.JobNotFoundException;
import com.impetus.idw.datastage.explorer.exception.RecordNotFoundException;
import com.impetus.idw.datastage.explorer.exception.StageNotFoundException;
import com.impetus.idw.datastage.explorer.model.Graph;
import com.impetus.idw.datastage.explorer.model.Link;
import com.impetus.idw.datastage.explorer.model.Node;
import com.impetus.idw.datastage.explorer.service.DatastageExplorerService;
import com.impetus.idw.datastage.explorer.utils.DatastageExplorerUtilities;
import com.impetus.idw.datastage.explorer.utils.OptionalConsumer;
import com.impetus.idw.datastage.explorer.xml.parser.DataStageXMLExtractHandler;

/**
 * The Class DatastageExplorerServiceImpl.
 */
public class DatastageExplorerServiceImpl implements DatastageExplorerService {

	/** The Constant CONTAINER_VIEW. */
	private static final String CONTAINER_VIEW = "ContainerView";

	/** The Constant TYPE. */
	private static final String TYPE = "Type";

	/** The Constant LABEL. */
	private static final String LABEL = "label";

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(DatastageExplorerServiceImpl.class);

	/** The Constant IDENTIFIER. */
	private static final String IDENTIFIER = "Identifier";

	/** The Constant NAME. */
	private static final String NAME = "Name";

	/** The Constant OLETYPE. */
	private static final String OLETYPE = "OLEType";

	/** The Constant CCONTAINERVIEW. */
	private static final String CCONTAINERVIEW = "CContainerView";

	/** The Constant STAGENAMES. */
	private static final String STAGENAMES = "StageNames";

	/** The Constant INPUTPINS. */
	private static final String INPUTPINS = "InputPins";

	/** The Constant OUTPUTPINS. */
	private static final String OUTPUTPINS = "OutputPins";

	/** The Constant SPLIT_BY_PIIPE. */
	private static final String SPLIT_BY_PIPE = "\\|";

	/** The Constant JOB_NOT_FOUND. */
	private static final String JOB_NOT_FOUND = "No job found with selected name '%s'.";

	/** The Constant STAGE_NOT_FOUND. */
	private static final String STAGE_NOT_FOUND = "No stage found for selected job '%s'.";

	/** The Constant INPUT_NAME_TEMPLATE. */
	private static final String INPUT_NAME_TEMPLATE = "<li onclick=\"activeInputPropertiesTable('%s')\">%s</li>";

	/** The Constant OUTPUT_NAME_TEMPLATE. */
	private static final String OUTPUT_NAME_TEMPLATE = "<li onclick=\"activeOutputPropertiesTable('%s')\">%s</li>";

	/** The Constant PROPERTY_ROW_TEMPLATE. */
	private static final String PROPERTY_ROW_TEMPLATE = "%n<tr><td>%s</td><td>%s</td></tr>";
	/** The Constant PROPERTY_TABLE_TEMPLATE. */
	private static final String PROPERTY_TABLE_TEMPLATE = "<table border=\"1\"><tr><th>Name</th>"
			+ "<th>Value</th></tr>%s</table>";
	/** The Constant JOB_LIST_ITEM_TEMPLATE. */
	private static final String JOB_LIST_ITEM_TEMPLATE = "%n<li onclick=\"activeSubList('%s')\" id=\"%s\">%s"
			+ "<ul hidden=\"true\"><li onclick=\"activeStageList('%s')\">Stage List</li>"
			+ "<li onclick=\"activeJobPropertiesTable('%s')\">Properties</li>"
			+ "<li onclick=\"showGraph('%s')\">Graph</li></ul></li>";

	/** The Constant STAGE_LIST_ITEM_TEMPLATE. */
	private static final String STAGE_LIST_ITEM_TEMPLATE = "%n<li onclick=\"activeSubList('%s')\" id=\"%s\">%s"
			+ "<ul hidden=\"true\"><li onclick=\"activeInputList('%s')\">Input Nodes</li>"
			+ "<li onclick=\"activeOutputList('%s')\">Output Nodes</li>"
			+ "<li onclick=\"activeStagePropertiesTable('%s')\">Properties</li></ul></li>";

	/** The Constant COLLECTION_TABLE_TEMPLATE. */
	private static final String COLLECTION_TABLE_TEMPLATE = "<tr><table border=\"1\"><tr colspan=\"2\">"
			+ "<th>%s</th></tr>%s</table></tr>";

	/** The Constant SUBRECORD_TABLE_TEMPLATE. */
	private static final String SUBRECORD_TABLE_TEMPLATE = "<tr><table border=\"1\"><tr>"
			+ "<th colspan=\"2\">Subrecord => %s</th></tr>%s</table></tr>";

	/** The Constant PARTNER. */
	private static final String PARTNER = "Partner";

	/** The jobs. */
	private List<DatastageJobNode> jobs = new ArrayList<>();

	/** The is DSX. */
	private boolean isDSX;

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		DatastageExplorerServiceImpl desi = new DatastageExplorerServiceImpl();
		desi.getGraphForJob("D:/IDW-WM/datastage/NewFolder/G70PRODFA.xml", "sj1000Fatca_Ld");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.impetus.idw.datastage.explorer.service.DatastageExplorerService#
	 * getJobs(java.lang.String)
	 */
	@Override
	public String getJobs(String filePath) {
		this.extractJobs(filePath);
		List<String> jobNames = new ArrayList<>();
		jobs.forEach(job -> job.getProperties().entrySet().forEach(property -> {
			if (property.getKey().equalsIgnoreCase(IDENTIFIER)) {
				jobNames.add(property.getValue());
			}
		}));
		return jobNames.stream().map(
				jobName -> String.format(JOB_LIST_ITEM_TEMPLATE, jobName, jobName, jobName, jobName, jobName, jobName))
				.collect(Collectors.joining());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.impetus.idw.datastage.explorer.service.DatastageExplorerService#
	 * getStagesForJob(java.lang.String)
	 */

	@Override
	public String getStagesForJob(String filePath, String jobName) {
		if (jobs.isEmpty()) {
			this.extractJobs(filePath);
		}
		List<String> stages = new ArrayList<>();
		OptionalConsumer<DatastageJobNode> job = this.getJobByName(filePath, jobName);
		job.ifPresent(jobConsumer -> OptionalConsumer
				.of(jobConsumer.getRecords().stream()
						.filter(recordConsumer -> recordConsumer.getProperties().get(isDSX ? OLETYPE : TYPE)
								.equalsIgnoreCase(isDSX ? CCONTAINERVIEW : CONTAINER_VIEW))
						.findFirst())
				.ifPresent(containerConsumer -> stages.addAll(DatastageExplorerUtilities
						.getListFromString(containerConsumer.getProperties().get(STAGENAMES), SPLIT_BY_PIPE)))
				.ifNotPresent(new StageNotFoundException(String.format(STAGE_NOT_FOUND, jobName))))
				.ifNotPresent(new JobNotFoundException(String.format(JOB_NOT_FOUND, jobName)));
		return stages.stream().map(stageName -> String.format(STAGE_LIST_ITEM_TEMPLATE, stageName, stageName, stageName,
				stageName, stageName, stageName)).collect(Collectors.joining());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.impetus.idw.datastage.explorer.service.DatastageExplorerService#
	 * getInputsForStage(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String getInputsForStage(String filePath, String jobName, String stageName) {
		if (jobs.isEmpty()) {
			this.extractJobs(filePath);
		}
		Map<String, String> inputNames = new HashMap<>();
		List<String> inputPins = new ArrayList<>();
		OptionalConsumer<DatastageJobNode> job = this.getJobByName(filePath, jobName);
		job.ifPresent(consumer -> {
			OptionalConsumer<DatastageRecordNode> stageRecord = OptionalConsumer.of(consumer.getRecords().stream()
					.filter(record -> DatastageExplorerUtilities.matchProperty(stageName, NAME, record.getProperties()))
					.findFirst());
			stageRecord.ifPresent(stageConsumer -> {
				String inputPinString = stageConsumer.getProperties().get(INPUTPINS);
				if (inputPinString != null) {
					inputPins.addAll(Arrays.asList(inputPinString.split(SPLIT_BY_PIPE)));
				}
			}).ifNotPresent(new RecordNotFoundException(
					String.format("No input Record found for selected stage '%s' in job '%s'.", stageName, jobName)));
		}).ifNotPresent(new JobNotFoundException(String.format(JOB_NOT_FOUND, jobName)));
		job.ifPresent(consumer -> inputPins.forEach(inputPin -> {
			OptionalConsumer<DatastageRecordNode> inputRecord = OptionalConsumer.of(consumer.getRecords().stream()
					.filter(record -> record.getProperties().get(IDENTIFIER).equalsIgnoreCase(inputPin)).findFirst());
			inputRecord
					.ifPresent(recordConsumer -> inputNames.put(recordConsumer.getProperties().get(IDENTIFIER),
							recordConsumer.getProperties().get(NAME)))
					.ifNotPresent(new RecordNotFoundException(
							String.format("No record found for identifier '%s' in job '%s'", inputPin, jobName)));
		})).ifNotPresent(new JobNotFoundException(String.format(JOB_NOT_FOUND, jobName)));
		return inputNames.entrySet().stream()
				.map(entry -> String.format(INPUT_NAME_TEMPLATE, entry.getKey(), entry.getValue()))
				.collect(Collectors.joining());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.impetus.idw.datastage.explorer.service.DatastageExplorerService#
	 * getInputProperties(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String getInputProperties(String filePath, String jobName, String inputId) {
		if (jobs.isEmpty()) {
			this.extractJobs(filePath);
		}
		OptionalConsumer<DatastageJobNode> job = this.getJobByName(filePath, jobName);
		OptionalConsumer<DatastageRecordNode> stageRecord = OptionalConsumer.of(Optional.empty());
		job.ifPresent(
				consumer -> stageRecord.set(consumer.getRecords().stream()
						.filter(record -> DatastageExplorerUtilities.matchProperty(inputId, IDENTIFIER,
								record.getProperties()))
						.findFirst()))
				.ifNotPresent(new JobNotFoundException(String.format(JOB_NOT_FOUND, jobName)));
		return stageRecord
				.isPresent()
						? String.format(PROPERTY_TABLE_TEMPLATE,
								stageRecord.get().getProperties().entrySet().stream()
										.map(entry -> String.format(PROPERTY_ROW_TEMPLATE, entry.getKey(),
												entry.getValue()))
										.collect(Collectors.joining())
										+ this.getCollectionProperties(stageRecord.get()))
						: "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.impetus.idw.datastage.explorer.service.DatastageExplorerService#
	 * getOutputsForStage(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String getOutputsForStage(String filePath, String jobName, String stageName) {
		if (jobs.isEmpty()) {
			this.extractJobs(filePath);
		}
		Map<String, String> outputNames = new HashMap<>();
		List<String> outputPins = new ArrayList<>();
		OptionalConsumer<DatastageJobNode> job = this.getJobByName(filePath, jobName);
		job.ifPresent(consumer -> {
			OptionalConsumer<DatastageRecordNode> stageRecord = OptionalConsumer.of(consumer.getRecords().stream()
					.filter(record -> DatastageExplorerUtilities.matchProperty(stageName, NAME, record.getProperties()))
					.findFirst());
			stageRecord.ifPresent(stageConsumer -> {
				String outputPinString = stageConsumer.getProperties().get(OUTPUTPINS);
				if (outputPinString != null) {
					outputPins.addAll(Arrays.asList(outputPinString.split(SPLIT_BY_PIPE)));
				}
			}).ifNotPresent(new RecordNotFoundException(
					String.format("No output Record found for selected stage '%s' in job '%s'.", stageName, jobName)));
		}).ifNotPresent(new JobNotFoundException(String.format(JOB_NOT_FOUND, jobName)));
		job.ifPresent(consumer -> outputPins.forEach(outputPin -> {
			OptionalConsumer<DatastageRecordNode> inputRecord = OptionalConsumer.of(consumer.getRecords().stream()
					.filter(record -> record.getProperties().get(IDENTIFIER).equalsIgnoreCase(outputPin)).findFirst());
			inputRecord
					.ifPresent(recordConsumer -> outputNames.put(recordConsumer.getProperties().get(IDENTIFIER),
							recordConsumer.getProperties().get(NAME)))
					.ifNotPresent(new RecordNotFoundException(
							String.format("No record found for identifier '%s' in job '%s'", outputPin, jobName)));
		})).ifNotPresent(new JobNotFoundException(String.format(JOB_NOT_FOUND, jobName)));
		return outputNames.entrySet().stream()
				.map(entry -> String.format(OUTPUT_NAME_TEMPLATE, entry.getKey(), entry.getValue()))
				.collect(Collectors.joining());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.impetus.idw.datastage.explorer.service.DatastageExplorerService#
	 * getOutputProperties(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String getOutputProperties(String filePath, String jobName, String outputId) {
		if (jobs.isEmpty()) {
			this.extractJobs(filePath);
		}
		OptionalConsumer<DatastageJobNode> job = this.getJobByName(filePath, jobName);
		OptionalConsumer<DatastageRecordNode> stageRecord = OptionalConsumer.of(Optional.empty());
		job.ifPresent(consumer -> stageRecord.set(consumer.getRecords().stream()
				.filter(record -> DatastageExplorerUtilities.matchProperty(outputId, IDENTIFIER,
						record.getProperties()))
				.findFirst())).ifNotPresent(new JobNotFoundException(String.format(JOB_NOT_FOUND, jobName)));
		return stageRecord
				.isPresent()
						? String.format(PROPERTY_TABLE_TEMPLATE,
								stageRecord.get().getProperties().entrySet().stream()
										.map(entry -> String.format(PROPERTY_ROW_TEMPLATE, entry.getKey(),
												entry.getValue()))
										.collect(Collectors.joining())
										+ this.getCollectionProperties(stageRecord.get()))
						: "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.impetus.idw.datastage.explorer.service.DatastageExplorerService#
	 * getPropertiesForStage(java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String getPropertiesForStage(String filePath, String jobName, String stageName) {
		if (jobs.isEmpty()) {
			this.extractJobs(filePath);
		}
		Map<String, String> properties = new HashMap<>();
		StringBuilder collectionProperties = new StringBuilder();
		OptionalConsumer<DatastageJobNode> job = this.getJobByName(filePath, jobName);
		job.ifPresent(consumer -> {
			OptionalConsumer<DatastageRecordNode> stageRecord = OptionalConsumer.of(consumer.getRecords().stream()
					.filter(record -> DatastageExplorerUtilities.matchProperty(stageName, NAME, record.getProperties()))
					.findFirst());
			stageRecord.ifPresent(stageConsumer -> {
				properties.putAll(stageConsumer.getProperties());
				collectionProperties.append(this.getCollectionProperties(stageConsumer));
			}).ifNotPresent(new StageNotFoundException(String.format(STAGE_NOT_FOUND, jobName)));
		}).ifNotPresent(new JobNotFoundException(String.format(JOB_NOT_FOUND, jobName)));
		return String.format(PROPERTY_TABLE_TEMPLATE,
				properties.entrySet().stream()
						.map(entry -> String.format(PROPERTY_ROW_TEMPLATE, entry.getKey(), entry.getValue()))
						.collect(Collectors.joining()) + collectionProperties);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.impetus.idw.datastage.explorer.service.DatastageExplorerService#
	 * getPropertiesForJob(java.lang.String, java.lang.String)
	 */
	@Override
	public String getPropertiesForJob(String filePath, String jobName) {
		if (jobs.isEmpty()) {
			this.extractJobs(filePath);
		}
		OptionalConsumer<DatastageJobNode> job = this.getJobByName(filePath, jobName);
		return job
				.isPresent()
						? String.format(PROPERTY_TABLE_TEMPLATE,
								job.get()
										.getProperties().entrySet().stream().map(entry -> String
												.format(PROPERTY_ROW_TEMPLATE, entry.getKey(), entry.getValue()))
										.collect(Collectors.joining()))
						: "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.impetus.idw.datastage.explorer.service.DatastageExplorerService#
	 * getGraphForJob(java.lang.String, java.lang.String)
	 */
	@Override
	public String getGraphForJob(String fileName, String jobName) {
		List<Graph> graphs = new ArrayList<>();
		Graph jobGraph = new Graph(jobName);
		graphs.add(jobGraph);
		OptionalConsumer<DatastageJobNode> job = this.getJobByName(fileName, jobName);
		job.ifPresent(jobConsumer -> OptionalConsumer
				.of(jobConsumer.getRecords().stream()
						.filter(recordConsumer -> recordConsumer.getProperties().get(isDSX ? OLETYPE : TYPE)
								.equalsIgnoreCase(isDSX ? CCONTAINERVIEW : CONTAINER_VIEW))
						.findFirst())
				.ifPresent(containerConsumer -> DatastageExplorerUtilities
						.getListFromString(containerConsumer.getProperties().get(STAGENAMES), SPLIT_BY_PIPE)
						.forEach(stage -> {
							Node stageNode = new Node(stage);
							stageNode.getValue().put(LABEL, stage);
							jobGraph.getNodes().add(stageNode);
							this.createLinkForNode(jobConsumer, jobGraph, stage);
						}))
				.ifNotPresent(new StageNotFoundException(String.format(STAGE_NOT_FOUND, jobName))))
				.ifNotPresent(new JobNotFoundException(String.format(JOB_NOT_FOUND, jobName)));
		try {
			return new ObjectMapper().writeValueAsString(graphs);
		} catch (JsonProcessingException e) {
			return "[{ \"name\" :\"" + jobName
					+ "\", \"nodes\": [{\"id\":\"node1\", \"value\" : {\"label\" : \"node1\"}},{\"id\" : \"node2\", \"value\" : {\"label\":\"node2\"}},{\"id\" : \"node3\", \"value\" : {\"label\":\"node3\"}},{\"id\" : \"node4\", \"value\" : {\"label\":\"node4\"}},{\"id\" : \"node5\", \"value\" : {\"label\":\"node5\"}},{\"id\" : \"node6\", \"value\" : {\"label\":\"node6\"}}], \"links\" : [{\"u\":\"node1\",\"v\":\"node2\",\"value\": {\"label\" : \"\"}}, {\"u\":\"node3\",\"v\":\"node4\",\"value\": {\"label\" : \"\"}}, {\"u\":\"node2\",\"v\":\"node5\",\"value\": {\"label\" : \"\"}}, {\"u\":\"node4\",\"v\":\"node5\",\"value\": {\"label\" : \"\"}}, {\"u\":\"node5\",\"v\":\"node6\",\"value\": {\"label\" : \"\"}}]}]";
		}
	}

	/**
	 * Gets the links between stages.
	 *
	 * @param job
	 *            the job
	 * @param jobGraph
	 *            the job graph
	 * @param stageName
	 *            the stage name
	 * @return the links between stages
	 */
	private void createLinkForNode(DatastageJobNode job, Graph jobGraph, String stageName) {
		OptionalConsumer<DatastageRecordNode> stageRecord = OptionalConsumer.of(job.getRecords().stream()
				.filter(record -> DatastageExplorerUtilities.matchProperty(stageName, NAME, record.getProperties()))
				.findFirst());
		stageRecord.ifPresent(stageConsumer -> {
			String outputPinString = stageConsumer.getProperties().get(OUTPUTPINS);
			if (outputPinString != null) {
				Arrays.asList(outputPinString.split(SPLIT_BY_PIPE)).forEach(outputPin -> {
					OptionalConsumer<DatastageRecordNode> outputRecord = OptionalConsumer
							.of(job.getRecords().stream().filter(record -> DatastageExplorerUtilities
									.matchProperty(outputPin, IDENTIFIER, record.getProperties())).findFirst());
					outputRecord.ifPresent(outputConsumer -> {
						String partnerPin = outputConsumer.getProperties().get(PARTNER);
						String partnerStagePin = partnerPin.split(SPLIT_BY_PIPE)[0];
						String linkName = outputConsumer.getProperties().get(NAME);
						OptionalConsumer<DatastageRecordNode> outputPartnerRecord = OptionalConsumer.of(job
								.getRecords().stream().filter(record -> DatastageExplorerUtilities
										.matchProperty(partnerStagePin, IDENTIFIER, record.getProperties()))
								.findFirst());
						outputPartnerRecord.ifPresent(outputPartnerConsumer -> {
							String outputPartnerRecordName = outputPartnerConsumer.getProperties().get(NAME);
							Link link = new Link(stageName, outputPartnerRecordName);
							link.getValue().put(LABEL, linkName);
							jobGraph.getLinks().add(link);
						});
					});
				});
			}
		});
	}

	/**
	 * Gets the collection properties.
	 *
	 * @param record
	 *            the record
	 * @return the collection properties
	 */
	private String getCollectionProperties(DatastageRecordNode record) {
		return record.getCollections().stream().map(collection -> String.format(COLLECTION_TABLE_TEMPLATE,
				collection.getCollectionName(),
				collection.getSubrecords().stream()
						.map(subRecord -> String.format(SUBRECORD_TABLE_TEMPLATE, collection.getCollectionName(),
								subRecord.getProperties().entrySet().stream()
										.map(entry -> String.format(PROPERTY_ROW_TEMPLATE, entry.getKey(),
												entry.getValue()))
										.collect(Collectors.joining())))
						.collect(Collectors.joining())))
				.collect(Collectors.joining());
	}

	/**
	 * Extract DSX nodes.
	 *
	 * @param filePath
	 *            the file path
	 * @return the datastage script node
	 */
	private DatastageScriptNode extractDSXNodes(String filePath) {
		DatastageAbstractNode dsxTransformResponse = null;
		LOGGER.info("Reading DSX file: ".concat(filePath));
		String content = "";
		try {
			content = FileUtils.readFileToString(new File(filePath), Charset.defaultCharset());
		} catch (IOException e) {
			LOGGER.error("Error while reading dsx file.", e);
		}
		dsxTransformResponse = this.walkAndTransformDSX(content);
		return (DatastageScriptNode) dsxTransformResponse;
	}

	/**
	 * Extract jobs.
	 *
	 * @param file
	 *            the file
	 */
	private void extractJobs(String file) {
		jobs = new ArrayList<>();
		if (file.toLowerCase().endsWith(".dsx")) {
			isDSX = true;
			DatastageScriptNode scriptBean = this.extractDSXNodes(file);
			jobs.addAll(scriptBean.getJobs());
		} else if (file.toLowerCase().endsWith(".xml")) {
			DatastageScriptNode scriptBean = this.extractFromXML(file);
			jobs.addAll(scriptBean.getJobs());
		} else {
			LOGGER.error("Invaild file type.");
		}

	}

	/**
	 * Gets the job by name.
	 *
	 * @param fileName
	 *            the file name
	 * @param jobName
	 *            the job name
	 * @return the job by name
	 */
	private OptionalConsumer<DatastageJobNode> getJobByName(String fileName, String jobName) {
		if (jobs.isEmpty()) {
			this.extractJobs(fileName);
		}
		return OptionalConsumer.of(jobs.stream()
				.filter(job -> DatastageExplorerUtilities.matchProperty(jobName, IDENTIFIER, job.getProperties()))
				.findFirst());
	}

	/**
	 * Parses the DSX.
	 *
	 * @param input
	 *            the input
	 * @return the datastage dsx script return
	 */
	private datastage_dsx_script_return parseDSX(String input) {
		CharStream stream = new ANTLRStringStream(input);
		Datastage_DSXLexer lexer = new Datastage_DSXLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Datastage_DSXParser parser = new Datastage_DSXParser(tokenStream);
		datastage_dsx_script_return parserResponse = null;
		try {
			parserResponse = parser.datastage_dsx_script();
		} catch (RecognitionException e) {
			LOGGER.error("Error while parsing DSX script: ", e);
		}
		return parserResponse;
	}

	/**
	 * Walk and transform DSX.
	 *
	 * @param fileContent
	 *            the file content
	 * @return the datastage abstract node
	 */
	private DatastageAbstractNode walkAndTransformDSX(String fileContent) {
		datastage_dsx_script_return parserResponse = this.parseDSX(fileContent);
		CommonTreeNodeStream tns = new CommonTreeNodeStream(parserResponse.getTree());
		Datastage_DSXWalker walker = new Datastage_DSXWalker(tns);
		DatastageAbstractNode walkerResponse = null;
		try {
			walkerResponse = walker.datastage_dsx_script();
		} catch (RecognitionException e) {
			LOGGER.error("Error while DSX transformation: ", e);
		}
		return walkerResponse;
	}

	/**
	 * Extract from XML.
	 *
	 * @param filePath
	 *            the file path
	 * @return the list
	 */
	private DatastageScriptNode extractFromXML(String filePath) {

		LOGGER.info("Extract From XML  ... ");
		File file = new File(filePath);
		SAXParserFactory factory = SAXParserFactory.newInstance();
		DataStageXMLExtractHandler handler = new DataStageXMLExtractHandler(file.getName());
		try {
			SAXParser saxParser = factory.newSAXParser();
			saxParser.parse(file, handler);
			return handler.getScript();
		} catch (IOException | ParserConfigurationException | SAXException e) {
			LOGGER.error("Exception occured while XML extraction: ", e);
			return null;
		}
	}
}
