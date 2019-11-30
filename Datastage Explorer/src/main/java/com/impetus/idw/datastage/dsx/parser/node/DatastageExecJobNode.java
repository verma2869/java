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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Class DatastageExecJobNode.
 */
public class DatastageExecJobNode extends DatastageAbstractNode {
  
  
  /** The properties. */
  private Map<String, String> properties;
  
  /** The records. */
  private List<DatastageRecordNode> records;
  
  /** The sources. */
  private List<DatastageBPSourceNode> sources;
  
  /** The binaries. */
  private List<DatastageBPBinaryNode> binaries;
  
  /** The scripts. */
  private List<DatastageDSScriptNode> scripts;
  
  /**
   * Adds the property.
   *
   * @param property
   *          the property
   * @param value
   *          the value
   */
  public void addProperty(String property, String value) {
    this.properties.put(property, value.replace("\"", ""));
  }
  
  /**
   * Adds the record.
   *
   * @param record
   *          the record
   */
  public void addRecord(DatastageRecordNode record) {
    this.records.add(record);
  }
  
  /**
   * Adds the source.
   *
   * @param source
   *          the source
   */
  public void addSource(DatastageBPSourceNode source) {
    this.sources.add(source);
  }
  
  /**
   * Adds the binary.
   *
   * @param record
   *          the record
   */
  public void addBinary(DatastageBPBinaryNode record) {
    this.binaries.add(record);
  }
  
  /**
   * Adds the script.
   *
   * @param script
   *          the script
   */
  public void addScript(DatastageDSScriptNode script) {
    this.scripts.add(script);
  }
  
  /**
   * Gets the properties.
   *
   * @return the properties
   */
  public Map<String, String> getProperties() {
    return properties;
  }
  
  /**
   * Sets the properties.
   *
   * @param properties
   *          the properties
   */
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }
  
  /**
   * Gets the records.
   *
   * @return the records
   */
  public List<DatastageRecordNode> getRecords() {
    return records;
  }
  
  /**
   * Sets the records.
   *
   * @param records
   *          the new records
   */
  public void setRecords(List<DatastageRecordNode> records) {
    this.records = records;
  }
  
  /**
   * Gets the sources.
   *
   * @return the sources
   */
  public List<DatastageBPSourceNode> getSources() {
    return sources;
  }
  
  /**
   * Sets the sources.
   *
   * @param sources
   *          the new sources
   */
  public void setSources(List<DatastageBPSourceNode> sources) {
    this.sources = sources;
  }
  
  /**
   * Gets the binaries.
   *
   * @return the binaries
   */
  public List<DatastageBPBinaryNode> getBinaries() {
    return binaries;
  }
  
  /**
   * Sets the binaries.
   *
   * @param binaries
   *          the new binaries
   */
  public void setBinaries(List<DatastageBPBinaryNode> binaries) {
    this.binaries = binaries;
  }
  
  /**
   * Gets the scripts.
   *
   * @return the scripts
   */
  public List<DatastageDSScriptNode> getScripts() {
    return scripts;
  }
  
  /**
   * Sets the scripts.
   *
   * @param scripts
   *          the new scripts
   */
  public void setScripts(List<DatastageDSScriptNode> scripts) {
    this.scripts = scripts;
  }
  
  /**
   * Instantiates a new datastage exec job node.
   */
  public DatastageExecJobNode() {
    properties = new HashMap<>();
    records = new ArrayList<>();
    sources = new ArrayList<>();
    binaries = new ArrayList<>();
    scripts = new ArrayList<>();
  }
}
