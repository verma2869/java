package com.impetus.idw.datastage.explorer.exception;

public class RecordNotFoundException extends Exception implements Runnable {

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

	public RecordNotFoundException(String s) {
		super(s);
	}
}
