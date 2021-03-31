package com.cg.creditcardbillpayment.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.creditcardbillpayment.exceptions.StatementServiceException;

/************************************************************************************
 *@author          K.Hima Susmitha
 *Description      StatementControllerAdvice is a RestControllerAdvice class. 
 *          				This class help us to handle Exception with RestfulApi by a 
 *          				cross-cutting concern solution: StatementServiceException. 
 *          				                     					  
 *Version             1.0
 *Created Date     22-03-2021
 ************************************************************************************/

@RestControllerAdvice
public class StatementControllerAdvice {
	
	/************************************************************************************
	 * Method:           FoundStatementException
     * Description:      To handle exceptions at runtime, using @ExceptionHandler.
	 * @returns String-  returns error message
     * Created By-       K.Hima Susmitha
     * Created Date-     22-03-2021                          
	 
	 ************************************************************************************/
	
	@ExceptionHandler(StatementServiceException.class)
	public ResponseEntity<String>  FoundStatetementException(Exception exception){
		
		 return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}

}
