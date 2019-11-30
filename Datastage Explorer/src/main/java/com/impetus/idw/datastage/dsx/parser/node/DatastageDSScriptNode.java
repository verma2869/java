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
 * The Class DatastageDSScriptNode.
 */
public class DatastageDSScriptNode extends DatastageAbstractNode {
  
  
  /** The properties. */
  private Map<String, String> properties;
  
  /** The records. */
  private List<DatastageRecordNode> records;
  
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
   * Instantiates a new datastage DS script node.
   */
  public DatastageDSScriptNode() {
    properties = new HashMap<>();
    records = new ArrayList<>();
  }
  
}
