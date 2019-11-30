/*****************************************************************************
* Created by: Impetus Technologies, Inc.
*
* Copyright: 2019 Impetus Technologies, Inc.
* This is a copyrighted work. This program and the information contained in it
* is confidential and proprietary to Impetus Technologies, Inc. and may not be
* used, copied, or reproduced without the prior written permission of
* Impetus Technologies, Inc.
*
* ****************************************************************************
* Revision History
* ****************************************************************************
* Date                   Author         Version        BugID   Description
* ****************************************************************************
******************************************************************************/
package com.impetus.idw.datastage.dsx.parser.node;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class DatastageScriptNode.
 */
public class DatastageScriptNode extends DatastageAbstractNode {
  
  
  /** The header. */
  private DatastageHeaderNode header;
  
  /** The table def. */
  private DatastageTableDefNode tableDef;
  
  /** The jobs. */
  private List<DatastageJobNode> jobs;
  
  /** The exec jobs. */
  private List<DatastageExecJobNode> execJobs;
  
  /** The routines. */
  private DatastageRoutinesNode routines;
  
  /** The data connections. */
  private DatastageDataConnectionsNode dataConnections;
  
  /** The parameters. */
  private DatastageParameterSet parameters;
  
  /**
   * Adds the header.
   *
   * @param header
   *          the header
   */
  public void addHeader(DatastageHeaderNode header) {
    this.header = header;
  }
  
  /**
   * Adds the job.
   *
   * @param job
   *          the job
   */
  public void addJob(DatastageJobNode job) {
    this.jobs.add(job);
  }
  
  /**
   * Adds the exec job.
   *
   * @param job
   *          the job
   */
  public void addExecJob(DatastageExecJobNode job) {
    this.execJobs.add(job);
  }
  
  /**
   * Adds the table def.
   *
   * @param tableDef
   *          the table def
   */
  public void addTableDef(DatastageTableDefNode tableDef) {
    this.tableDef = tableDef;
  }
  
  /**
   * Adds the routines.
   *
   * @param routines
   *          the routines
   */
  public void addRoutines(DatastageRoutinesNode routines) {
    this.routines = routines;
  }
  
  /**
   * Adds the data connections.
   *
   * @param dataConnections
   *          the data connections
   */
  public void addDataConnections(DatastageDataConnectionsNode dataConnections) {
    this.dataConnections = dataConnections;
  }
  
  /**
   * Adds the parameter sets.
   *
   * @param parameters
   *          the parameters
   */
  public void addParameterSets(DatastageParameterSet parameters) {
    this.parameters = parameters;
  }
  
  /**
   * Instantiates a new datastage script node.
   */
  public DatastageScriptNode() {
    jobs = new ArrayList<>();
    execJobs = new ArrayList<>();
  }
  
  /**
   * Gets the header.
   *
   * @return the header
   */
  public DatastageHeaderNode getHeader() {
    return header;
  }
  
  /**
   * Sets the header.
   *
   * @param header
   *          the new header
   */
  public void setHeader(DatastageHeaderNode header) {
    this.header = header;
  }
  
  /**
   * Gets the table def.
   *
   * @return the table def
   */
  public DatastageTableDefNode getTableDef() {
    return tableDef;
  }
  
  /**
   * Sets the table def.
   *
   * @param tableDef
   *          the new table def
   */
  public void setTableDef(DatastageTableDefNode tableDef) {
    this.tableDef = tableDef;
  }
  
  /**
   * Gets the jobs.
   *
   * @return the jobs
   */
  public List<DatastageJobNode> getJobs() {
    return jobs;
  }
  
  /**
   * Sets the jobs.
   *
   * @param jobs
   *          the new jobs
   */
  public void setJobs(List<DatastageJobNode> jobs) {
    this.jobs = jobs;
  }
  
  /**
   * Gets the exec jobs.
   *
   * @return the exec jobs
   */
  public List<DatastageExecJobNode> getExecJobs() {
    return execJobs;
  }
  
  /**
   * Sets the exec jobs.
   *
   * @param execJobs
   *          the new exec jobs
   */
  public void setExecJobs(List<DatastageExecJobNode> execJobs) {
    this.execJobs = execJobs;
  }
  
  /**
   * Gets the routines.
   *
   * @return the routines
   */
  public DatastageRoutinesNode getRoutines() {
    return routines;
  }
  
  /**
   * Sets the routines.
   *
   * @param routines
   *          the new routines
   */
  public void setRoutines(DatastageRoutinesNode routines) {
    this.routines = routines;
  }
  
  /**
   * Gets the data connections.
   *
   * @return the data connections
   */
  public DatastageDataConnectionsNode getDataConnections() {
    return dataConnections;
  }
  
  /**
   * Sets the data connections.
   *
   * @param dataConnections
   *          the new data connections
   */
  public void setDataConnections(DatastageDataConnectionsNode dataConnections) {
    this.dataConnections = dataConnections;
  }
  
  /**
   * Gets the parameters.
   *
   * @return the parameters
   */
  public DatastageParameterSet getParameters() {
    return parameters;
  }
  
  /**
   * Sets the parameters.
   *
   * @param parameters
   *          the new parameters
   */
  public void setParameters(DatastageParameterSet parameters) {
    this.parameters = parameters;
  }
  
  /**
   * Count.
   *
   * @return the string
   */
  public String count() {
    return "Job count: " + jobs.size() + " | Exec job count: " + execJobs.size();
  }
}
