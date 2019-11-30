package com.impetus.idw.datastage.explorer.model;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class Link.
 */
public class Link {

	/** The u. */
	private String u;

	/** The v. */
	private String v;

	/** The value. */
	private Map<String, Object> value;

	/**
	 * Gets the u.
	 *
	 * @return the u
	 */
	public String getU() {
		return u;
	}

	/**
	 * Gets the v.
	 *
	 * @return the v
	 */
	public String getV() {
		return v;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public Map<String, Object> getValue() {
		return value;
	}

	/**
	 * Instantiates a new link.
	 *
	 * @param u
	 *            the u
	 * @param v
	 *            the v
	 */
	public Link(String u, String v) {
		super();
		this.u = u;
		this.v = v;
		this.value = new HashMap<>();
	}

}
