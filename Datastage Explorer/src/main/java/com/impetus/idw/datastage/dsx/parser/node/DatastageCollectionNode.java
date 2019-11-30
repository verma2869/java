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
 * The Class DatastageCollectionNode.
 */
public class DatastageCollectionNode extends DatastageAbstractNode {
  
  
  /** The collection name. */
  private String collectionName;
  
  /** The collection type. */
  private String collectionType;
  
  /** The subrecords. */
  private List<DatastageSubRecordNode> subrecords;
  
  /**
   * Gets the collection name.
   *
   * @return the collection name
   */
  public String getCollectionName() {
    return collectionName;
  }
  
  /**
   * Sets the collection name.
   *
   * @param collectionName
   *          the new collection name
   */
  public void setCollectionName(String collectionName) {
    this.collectionName = collectionName;
  }
  
  /**
   * Gets the collection type.
   *
   * @return the collection type
   */
  public String getCollectionType() {
    return collectionType;
  }
  
  /**
   * Sets the collection type.
   *
   * @param collectionType
   *          the new collection type
   */
  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }
  
  /**
   * Gets the subrecords.
   *
   * @return the subrecords
   */
  public List<DatastageSubRecordNode> getSubrecords() {
    return subrecords;
  }
  
  /**
   * Sets the subrecords.
   *
   * @param subrecords
   *          the new subrecords
   */
  public void setSubrecords(List<DatastageSubRecordNode> subrecords) {
    this.subrecords = subrecords;
  }
  
  /**
   * Adds the sub record.
   *
   * @param subRecord
   *          the sub record
   */
  public void addSubRecord(DatastageSubRecordNode subRecord) {
    this.subrecords.add(subRecord);
  }
  
  /**
   * Instantiates a new datastage collection node.
   */
  public DatastageCollectionNode() {
    subrecords = new ArrayList<>();
  }
  
}
