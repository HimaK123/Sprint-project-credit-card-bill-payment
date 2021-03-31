package com.cg.creditcardbillpayment.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcardbillpayment.entities.Statement;
import com.cg.creditcardbillpayment.exceptions.StatementServiceException;
import com.cg.creditcardbillpayment.services.StatementService;

import io.swagger.annotations.Api;
/*********************************************************************************************************************************
 * @author           K.Hima Susmitha 
 * Description       It is a service class that provides the
 *                   services to add a statement,remove a statement,update a statement and view statement 
 * Version           1.0 
 * Created Date      24-03-2021
 *********************************************************************************************************************************/


@Api(value="CreditCardBillPayment")
@RestController
@RequestMapping("/")
public class StatementController {

	@Autowired
	private StatementService statementService;
	/*********************************************************************************************
	* Method                : addStatement
	*Description            : To add the statement to the Database
	* @param Statement      - Statement to be added to the Database
	* @param RequestBody    - It maps the HttpRequest body to a transfer or domain object,
	                          enabling automatic deserialization of the inbound HttpRequest body
	                           onto a Java object.
	* @returns Statement    - returns statement
	* @throws StatementServiceException - It is raised when statement already exists in the Database
	*Created By - K.Hima Susmitha
	*Created Date - 24-03-2021

	********************************************************************************************/

	@PostMapping("/addstatement")
	public ResponseEntity<Statement> addStatement(@RequestBody Statement statement) {
		Statement statement1 = statementService.addStatement(statement);
		return new ResponseEntity<Statement>(statement1, HttpStatus.OK);

	}
	/************************************************************************************
	* Method                : getStatement
	*Description            : To fetch the statement from the Database
	* @param Statement      - Statement to be fetched to the Database
	* @param PathVariable   - It maps the HttpRequest body to a transfer or domain object,
	                           enabling automatic deserialization of the inbound
	                            HttpRequest body onto a Java object.
	* @returns Statement    - returns statement
	* @throws StatementServiceException - It is raised when statement already exists in the Database
	*Created By - K.Hima Susmitha
	*Created Date - 24-03-2021

	*******************************************************************************************************************************************************************************************/


	@GetMapping("/getstatement/{id}")
	public ResponseEntity<Statement> getStatement(@PathVariable Long id)  {
		Statement statement = statementService.getStatement(id);
		return new ResponseEntity<Statement>(statement, HttpStatus.OK);
	}
	/************************************************************************************
	* Method :              updateStatement
	*Description :          To update the statement stored in the Database
	* @param creditcard -   statement to be updated to the Database
	* @param RequestBody -  It maps the HttpRequest body to a transfer or domain object,
	                          enabling automatic deserialization of the inbound HttpRequest body
	                           onto a Java object.
	* @returns Statement -  returns statement
	* @throws StatementServiceException - It is raised when statement already exists in the Database
	*Created By -           K.Hima Susmitha
	*Created Date -         24-03-2021

	*******************************************************************************************************************************************************************************************/


	@PutMapping("/updatestatement")
	public ResponseEntity<Statement> updateStatement(@RequestBody Statement statement) {
		Statement statement1 = statementService.updateStatement(statement.getStatementId(), statement);
		return new ResponseEntity<Statement>(statement1, HttpStatus.OK);

	}
	/************************************************************************************
	* Method :                 deleteCreditCard
	*Description :             To delete the statement from the Database
	* @param statement -       statement to be delete from Database
	* @param PathVariable -    It maps the HttpRequest body to a transfer or domain object,
	                           enabling automatic deserialization of the inbound HttpRequest 
	                           body onto a Java object.
	* @returns statement -     returns statement
	* @throws StatementServiceException - It is raised when statement already exists in the Database
	*Created By -              K.Hima Susmitha
	*Created Date -            24-03-2021
	************************************************************************************/

	

	@DeleteMapping("/deletestatement/{id}")
	public void deleteStatement(@PathVariable Long id) {
		statementService.removeStatement(id);
		
	}
	/************************************************************************************
	* Method :              getallStatement
	*Description :          To fetchAll the statement from the Database
	* @param creditcard -   statement to be fetched to the Database
	* @param RequestBody -  It maps the HttpRequest body to a transfer or domain object,
	                        enabling automatic deserialization of the inbound HttpRequest body
	                         onto a Java object.
	* @returns Statement-   returns statement
	* @throws StatementServiceException - It is raised when statement already exists in the Database
	*Created By -           K.Hima Susmitha
	*Created Date -         24-03-2021

	*******************************************************************************************************************************************************************************************/

	

	@GetMapping("/getallstatement")
	public ResponseEntity<List<Statement>> getAllStatements() {
		List<Statement> statement = statementService.getAllStatements();
		return new ResponseEntity<List<Statement>>(statement, HttpStatus.OK);
	}
	/************************************************************************************
	* Method  :              getbilledStatement
	*Description :           To fetch the billedStatement from the Database
	* @param creditcard -    billedStatement to be fetched to the Database
	* @param RequestBody -   It maps the HttpRequest body to a transfer or domain object,
	                         enabling automatic deserialization of the inbound HttpRequest 
	                         body onto a Java object.
	* @returns Statement-    returns statement
	* @throws StatementServiceException - It is raised when statement already exists in the Database
	*Created By -            K.Hima Susmitha
	*Created Date -          24-03-2021

	**************************************************************************************/

	@GetMapping("/getbilledstatement")
	public ResponseEntity<List<Statement>> getBilledStatement() {
		 List<Statement>statement2 = statementService.getBilledStatement();
		return new ResponseEntity<List<Statement>>(statement2, HttpStatus.OK);
	}
	/************************************************************************************
	* Method:              getUnbilledStatement
	*Description :         To fetch the UnbilledStatement from the Database
	* @param creditcard -  unbilledStatement to be fetched to the Database
	* @param RequestBody - It maps the HttpRequest body to a transfer or domain object,
	                       enabling automatic deserialization of the inbound HttpRequest
	                        body onto a Java object.
	* @returns Statement - returns statement
	*Created By -          K.Hima Susmitha
	*Created Date -        24-03-2021

	**************************************************************************************/


	@GetMapping("/getunbilledstatement")
	public ResponseEntity<List<Statement>> getUnbilledStatement() {
		List<Statement>statement2 = statementService.getUnbilledStatement();
		return new ResponseEntity<List<Statement>>(statement2, HttpStatus.OK);
	}

}