package com.cg.creditcardbillpayment.exceptions;

/************************************************************************************
 *          @author          K.Hima Susmitha
 *          Description      StatementServiceException is an exception class which is used to
 *          				 throw user defined exception at run time. It extends Runtime
 *          				 Exception class.                    					  
 *         Version             1.0
 *         Created Date      22-MAR-2021
 ************************************************************************************/
public class StatementServiceException extends RuntimeException {
	
	public  StatementServiceException (String msg) {
		super(msg);
	}
}
