package com.cg.creditcardbillpayment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.creditcardbillpayment.entities.Customer;
import com.cg.creditcardbillpayment.entities.Statement;
import com.cg.creditcardbillpayment.exceptions.StatementServiceException;
import com.cg.creditcardbillpayment.services.StatementService;

/************************************************************************************
* @author         K.Hima Susmitha
* Description     It is a test class that provides the TestCases to test the
*                          StatementService class
* Version         1.0
* Created Date    22-03-2021
************************************************************************************/


@SpringBootTest
public class StatementServiceTest { 
	
	@Autowired
	private StatementService statementservice;
	
	Customer customer=new Customer();
	
	Statement statement=new Statement(1L,543.78,LocalDate.parse("2007-03-04"),LocalDate.parse("2023-04-06"),customer);
	Statement statement1=new Statement(2L,89.0,LocalDate.parse("2007-04-12"),LocalDate.parse("2023-03-11"),customer);
	
	
	@Test
	void AddTest() {
		
		assertThrows(StatementServiceException.class,()->{
			statementservice.addStatement(statementservice.getStatement(89));
		});
	}
	@Test
	void AddTest1() {
	
		assertEquals(0.0,statementservice.getStatement(89).getDueAmount());
		
	
	}
	@Test
	void getTest(){
		
		assertEquals(67.8,statementservice.getStatement(77).getDueAmount());
	}
	@Test
	void getTest1(){
		
        assertEquals(LocalDate.parse("2023-09-07"),statementservice.getStatement(89).getBillingDate());
	}
	@Test
	void getTest2(){
	
		assertEquals(LocalDate.parse("2045-11-09"),statementservice.getStatement(8).getDueDate());
	}
	@Test
	void getTest3(){

		assertEquals(0.0,statementservice.getStatement(89).getDueAmount());
			
	}
	
	@Test
	void updateTest1(){
		
	assertEquals(0.0,statementservice.getStatement(89).getDueAmount());
	}
	

}
