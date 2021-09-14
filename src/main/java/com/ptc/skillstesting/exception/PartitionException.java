package com.ptc.skillstesting.exception;

/**
 * The PartitionException wraps the partition custom RuntimeException. The
 * objective is to render custom message for errors.
 * 
 * @author Mohamed EL-ADAMI
 * @version 0.0.1
 * @since 14-09-2021
 */
public class PartitionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8303211407429856870L;

	/**
	 * Constructs a new exception with the specified detail message.
	 * 
	 * @param errorMessage the detail message.
	 * 
	 */
	public PartitionException(String errorMessage) {
		super(errorMessage);
	}

	/**
	 * Constructs a new exception with the specified detail message and error stack.
	 * 
	 * @param errorMessage the detail message.
	 * @param err          the error StackTrace.
	 */
	public PartitionException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}

}
