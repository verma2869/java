package com.impetus.idw.datastage.explorer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.impetus.idw.datastage.explorer.service.DatastageExplorerService;

/**
 * The Class DatastageExplorerController.
 */
@RestController
public class DatastageExplorerController {

	/** The explorer service. */
	@Autowired
	public DatastageExplorerService explorerService;

	/** The file path. */
	private String filePath;

	/**
	 * Gets the jobs.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param filePath
	 *            the file path
	 * @return the jobs
	 */
	@GetMapping(value = "/getJobs")
	public String getJobs(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("filePath") String filePath) {
		this.filePath = filePath;
		return explorerService.getJobs(filePath);
	}

	/**
	 * Gets the stages for job.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @return the stages for job
	 */
	@GetMapping(value = "/getStagesForJob")
	public String getStagesForJob(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("filePath") String filePath, @ModelAttribute("jobName") String jobName) {
		return explorerService.getStagesForJob(filePath, jobName);
	}

	/**
	 * Gets the inputs for stage.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @param stageName
	 *            the stage name
	 * @return the inputs for stage
	 */
	@GetMapping(value = "/getInputsForStage")
	public String getInputsForStage(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("filePath") String filePath, @ModelAttribute("jobName") String jobName,
			@ModelAttribute("stageName") String stageName) {
		return explorerService.getInputsForStage(filePath, jobName, stageName);
	}

	/**
	 * Gets the input properties.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @param inputId
	 *            the input id
	 * @return the input properties
	 */
	@GetMapping(value = "/getInputProperties")
	public String getInputProperties(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("filePath") String filePath, @ModelAttribute("jobName") String jobName,
			@ModelAttribute("inputId") String inputId) {
		return explorerService.getInputProperties(filePath, jobName, inputId);
	}

	/**
	 * Gets the outputs for stage.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @param stageName
	 *            the stage name
	 * @return the outputs for stage
	 */
	@GetMapping(value = "/getOutputsForStage")
	public String getOutputsForStage(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("filePath") String filePath, @ModelAttribute("jobName") String jobName,
			@ModelAttribute("stageName") String stageName) {
		return explorerService.getOutputsForStage(filePath, jobName, stageName);
	}

	/**
	 * Gets the output properties.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @param outputId
	 *            the output id
	 * @return the output properties
	 */
	@GetMapping(value = "/getOutputProperties")
	public String getOutputProperties(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("filePath") String filePath, @ModelAttribute("jobName") String jobName,
			@ModelAttribute("outputId") String outputId) {
		return explorerService.getOutputProperties(filePath, jobName, outputId);
	}

	/**
	 * Gets the properties for stage.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @param stageName
	 *            the stage name
	 * @return the properties for stage
	 */
	@GetMapping(value = "/getPropertiesForStage")
	public String getPropertiesForStage(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("filePath") String filePath, @ModelAttribute("jobName") String jobName,
			@ModelAttribute("stageName") String stageName) {
		return explorerService.getPropertiesForStage(filePath, jobName, stageName);
	}

	/**
	 * Gets the properties for job.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param filePath
	 *            the file path
	 * @param jobName
	 *            the job name
	 * @return the properties for job
	 */
	@GetMapping(value = "/getPropertiesForJob")
	public String getPropertiesForJob(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("filePath") String filePath, @ModelAttribute("jobName") String jobName) {
		return explorerService.getPropertiesForJob(filePath, jobName);
	}

	/**
	 * Gets the graph for job.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param jobName
	 *            the job name
	 * @return the graph for job
	 */
	@GetMapping(value = "/getGraphForJob")
	public String getGraphForJob(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("jobName") String jobName) {
		return explorerService.getGraphForJob(filePath, jobName);
	}
}
