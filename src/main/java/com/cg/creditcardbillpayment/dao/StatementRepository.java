package com.cg.creditcardbillpayment.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.creditcardbillpayment.entities.Statement;

/************************************************************************************************
 *          @author          K.Hima Susmitha
 *          Description      StatementRepository is an interface which extends JPA repository.
 *          				 This class belongs to DAO layer. It is used to perform CRUD operations
 *          				 with our entities by defining JPA repositories for automatic 
 *          				 and intelligent implementations.                     					  
 *         Version             1.0
 *         Created Date    22-MAR-2021
 **************************************************************************************************/

public interface StatementRepository extends JpaRepository<Statement,Long>{
	// to fetch the billed and UnBilled statement from the database
	
	@Query("select statement from Statement statement where statement.dueAmount=0")
	public List<Statement> getBilledStatement();
	@Query("select statement from Statement statement where statement.dueAmount!=0")
	public List<Statement> getUnBilledStatement();

}
