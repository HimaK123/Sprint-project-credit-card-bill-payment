package com.cg.creditcardbillpayment.services;

import java.util.List;


import com.cg.creditcardbillpayment.entities.Statement;

/**************************************************************************************************
 *          @author          K.Hima Susmitha
 *          Description      StatementService is an interface which is used to define 
 *          				 necessary business logics whose implementation is defined
 *          				 in StatementServiceImpl class. Here, necessary methods such as addStatement,
 *          				 removeStatement, updateStatement, getStatement, getAllStatements are
 *          			     used to perform CRUD operations in service layer.              					  
 *         Version             1.0
 *         Created Date      22-03-2021
 **************************************************************************************************/

public interface StatementService {
	public Statement addStatement(Statement statement);

	public void removeStatement(long id);

	public Statement updateStatement(long id, Statement statement);

	public Statement getStatement(long id);

	public List<Statement> getAllStatements();

	public List<Statement>  getBilledStatement();

	public List<Statement> getUnbilledStatement();
}
