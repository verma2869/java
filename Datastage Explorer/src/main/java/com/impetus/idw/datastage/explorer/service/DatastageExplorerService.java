package com.impetus.idw.datastage.explorer.service;

/**
 * The Interface DatastageExplorerService.
 */
public interface DatastageExplorerService {

	/**
	 * Gets the jobs.
	 *
	 * @param filePath
	 *            the file path
	 * @return the jobs
	 */
	abstract String getJobs(String filePath);

	/**
	 * Gets the stages for job.
	 *
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @return the stages for job
	 */
	abstract String getStagesForJob(String filePath, String jobName);

	/**
	 * Gets the inputs for stage.
	 *
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @param stageName
	 *            the stage name
	 * @return the inputs for stage
	 */
	abstract String getInputsForStage(String filePath, String jobName, String stageName);

	/**
	 * Gets the input properties.
	 *
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @param inputId
	 *            the input id
	 * @return the input properties
	 */
	abstract String getInputProperties(String filePath, String jobName, String inputId);

	/**
	 * Gets the outputs for stage.
	 *
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @param stageName
	 *            the stage name
	 * @return the outputs for stage
	 */
	abstract String getOutputsForStage(String filePath, String jobName, String stageName);

	/**
	 * Gets the output properties.
	 *
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @param outputId
	 *            the output id
	 * @return the output properties
	 */
	abstract String getOutputProperties(String filePath, String jobName, String outputId);

	/**
	 * Gets the properties for stage.
	 *
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @param stageName
	 *            the stage name
	 * @return the properties for stage
	 */
	abstract String getPropertiesForStage(String filePath, String jobName, String stageName);

	/**
	 * Gets the properties for job.
	 *
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @return the properties for job
	 */
	abstract String getPropertiesForJob(String filePath, String jobName);

	/**
	 * Gets the graph for job.
	 * 
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @return the graph for job
	 */
	abstract String getGraphForJob(String filePath, String jobName);
}
