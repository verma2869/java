package com.impetus.idw.datastage.explorer.model;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class Node.
 */
public class Node {

	/** The id. */
	private String id;

	/** The value. */
	private Map<String, Object> values;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public Map<String, Object> getValue() {
		return values;
	}

	/**
	 * Instantiates a new node.
	 *
	 * @param id
	 *            the id
	 */
	public Node(String id) {
		super();
		this.id = id;
		this.values = new HashMap<>();
	}
}
