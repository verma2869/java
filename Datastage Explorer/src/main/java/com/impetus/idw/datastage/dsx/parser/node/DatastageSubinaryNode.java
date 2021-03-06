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

import java.util.HashMap;
import java.util.Map;

/**
 * The Class DatastageSubinaryNode.
 */
public class DatastageSubinaryNode extends DatastageAbstractNode {
  
  
  /** The properties. */
  private Map<String, String> properties;
  
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
   * Instantiates a new datastage subinary node.
   */
  public DatastageSubinaryNode() {
    properties = new HashMap<>();
  }
}
