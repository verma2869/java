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
 * The Class DatastageRecordNode.
 */
public class DatastageRecordNode extends DatastageAbstractNode {
  
  
  /** The properties. */
  private Map<String, String> properties;
  
  /** The collections. */
  private List<DatastageCollectionNode> collections;
  
  /**
   * Adds the property.
   *
   * @param property
   *          the property
   * @param value
   *          the value
   */
  public void addProperty(String property, String value) {
    this.properties.put(property, value);
  }
  
  /**
   * Adds the collection.
   *
   * @param collection
   *          the collection
   */
  public void addCollection(DatastageCollectionNode collection) {
    this.collections.add(collection);
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
   * Gets the sub records.
   *
   * @return the sub records
   */
  public List<DatastageCollectionNode> getCollections() {
    return collections;
  }
  
  /**
   * Sets the sub records.
   *
   * @param collections
   *          the new sub records
   */
  public void setCollections(List<DatastageCollectionNode> collections) {
    this.collections = collections;
  }
  
  /**
   * Instantiates a new datastage record node.
   */
  public DatastageRecordNode() {
    properties = new HashMap<>();
    collections = new ArrayList<>();
  }
  
}
