package com.impetus.idw.datastage.explorer.exception;

public class StageNotFoundException extends Exception implements Runnable {

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

	public StageNotFoundException(String s) {
		super(s);
	}
}
