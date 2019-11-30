package com.impetus.idw.datastage.explorer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Graph.
 */
public class Graph {

	/** The name. */
	private String name;

	/** The nodes. */
	private List<Node> nodes;

	/** The links. */
	private List<Link> links;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the nodes.
	 *
	 * @return the nodes
	 */
	public List<Node> getNodes() {
		return nodes;
	}

	/**
	 * Gets the links.
	 *
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * Instantiates a new graph.
	 *
	 * @param name
	 *            the name
	 */
	public Graph(String name) {
		super();
		this.name = name;
		nodes = new ArrayList<>();
		links = new ArrayList<>();
	}
}
