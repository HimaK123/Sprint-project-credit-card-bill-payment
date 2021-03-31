package com.cg.creditcardbillpayment.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcardbillpayment.dao.StatementRepository;
import com.cg.creditcardbillpayment.entities.Statement;
import com.cg.creditcardbillpayment.exceptions.StatementServiceException;

/*********************************************************************************************************************************
 * @author           K.Hima Susmitha 
 * Description       It is a service class that provides the
 *                   services to add a statement,remove a Statement,update a Statement and view Statement
 * Version           1.0 
 * Created Date      24-03-2021
 *********************************************************************************************************************************/

@Service
public class StatementServiceImpl implements StatementService {

	@Autowired
	private StatementRepository statementRepository;

/******************************************************************************************************************************
	 * Method:                                  : addStatment
     *Description:                              : To add statements to the database
	 * @param statement                         - statement to be added to the Database
	 * @returns Statement                       - returns newStatement
	 * @throws StatementServiceException        - It is raised when statement already exits in the Database
     *Created By                                - K.Hima Susmitha
     *Created Date                              - 23-03-2021                           
	 
******************************************************************************************************************************/

	@Override
	public Statement addStatement(Statement statement) {
		// TODO Auto-generated method stub
		Statement newStatement;
		Optional<Statement> statement1 = statementRepository.findById(statement.getStatementId());
		if (statement1.isEmpty()) {
			newStatement = statementRepository.saveAndFlush(statement);
		} else {
			throw new StatementServiceException("Statement already exits");
		}
		return newStatement;

	}
	/*******************************************************************************************************************************
	 * Method:                                  : removeStatment
     *Description:                              : To remove statements from database
	 * @param id                                - statement id to be deleted
	 * @returns void                            - returns void
	 * @throws StatementServiceException        - It is raised when id does not exits in the Database
     *Created By                                - K.Hima Susmitha
     *Created Date                              - 23-03-2021                           
	 
	 ********************************************************************************************************************************/


	@Override
	public void removeStatement(long id) {
		// TODO Auto-generated method stub
		Optional<Statement> statement = statementRepository.findById(id);
		if (statement.isEmpty())
			throw new StatementServiceException("Id does not exit to delete");

		else
			statementRepository.delete(statement.get());

	}
	/*********************************************************************************************************************************
	 * Method:                                  : updateStatment
     *Description:                              : To update statements to the database
	 * @param id                                - statement  to be updated in the database
	 * @returns void                            - returns statement
	 * @throws StatementServiceException        - It is raised when statement was not found in the Database
     *Created By                                - K.Hima Susmitha
     *Created Date                              - 23-03-2021                           
	 
	 **********************************************************************************************************************************/
	

	@Override
	public Statement updateStatement(long id, Statement statement) {
		// TODO Auto-generated method stub
		Optional<Statement> statement1 = statementRepository.findById(id);
		if (statement1.isEmpty()) {
			throw new StatementServiceException("Statement not found");
		}
		statementRepository.save(statement);
		return statement;
	}
	/**********************************************************************************************************************************
	 * Method:                                  : getStatment
     *Description:                              : To fetch the statements from the database
	 * @param id                                - id of the statement to be fetched
	 * @returns statement                       - returns statement
	 * @throws StatementServiceException        - It is raised when the id does not exit in the Database
     *Created By                                - K.Hima Susmitha
     *Created Date                              - 23-03-2021                           
	 
	 ***********************************************************************************************************************************/

	@Override
	public Statement getStatement(long id) {
		// TODO Auto-generated method stub
		Optional<Statement> statement = statementRepository.findById(id);
		if (statement.isEmpty()) {
			throw new StatementServiceException("Given id does not exit");
		}

		return statement.get();

	}
	/************************************************************************************************************************************
	 * Method:                                  : getAllStatments
     *Description:                              : To fetch all the statements from the database
	 * @returns statement                       - returns statement
	 * @throws StatementServiceException        - It is raised when the statements were not found in Database
     *Created By                                - K.Hima Susmitha
     *Created Date                              - 23-03-2021                           
	 
	 *************************************************************************************************************************************/

	@Override
	public List<Statement> getAllStatements() {
		// TODO Auto-generated method stub
		List<Statement> statement = statementRepository.findAll();
		if (statement.isEmpty()) {
			throw new StatementServiceException("Statements not found ");
		}
		return statement;
	}
	/*************************************************************************************************************************************
	 * Method:                                  : getBilledStatmen
     *Description:                              : To fetch the BilledStatements from the database
	 * @returns statement                       - returns BilledStatement
     *Created By                                - K.Hima Susmitha
     *Created Date                              - 23-03-2021                           
	 
	 *************************************************************************************************************************************/

	@Override
	public List<Statement> getBilledStatement() {
		// TODO Auto-generated method stub
		return statementRepository.getBilledStatement();
	}
	/*************************************************************************************************************************************
	 * Method:                                  : getUnbilledStatmen
     *Description:                              : To fetch the UnbilledStatements from the database
	 * @returns statement                       - returns UnbilledStatement
     *Created By                                - K.Hima Susmitha
     *Created Date                              - 23-03-2021                           
	 
	 **************************************************************************************************************************************/

	@Override
	public List<Statement> getUnbilledStatement() {
		// TODO Auto-generated method stub
		return statementRepository.getUnBilledStatement();
	}

}
