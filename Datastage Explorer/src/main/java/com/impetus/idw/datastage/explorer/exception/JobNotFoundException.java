package com.impetus.idw.datastage.explorer.exception;

public class JobNotFoundException extends Exception implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void run() {
		/*
		 * 
		 */
	}

	public JobNotFoundException(String s) {
		super(s);
	}
}
