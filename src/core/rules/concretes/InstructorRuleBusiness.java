package core.rules.concretes;

import core.exceptions.BusinessRuleException;
import core.rules.abstracts.InstructorRules;
import core.rules.concretes.constants.InstructorRulesMessages;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class InstructorRuleBusiness implements InstructorRules{

	private InstructorDao instructorDao;

	public InstructorRuleBusiness(InstructorDao instructorDao) {
		
		this.instructorDao = instructorDao;
	}

	@Override
	public void educatorCannotBeNull(Instructor instructor) throws BusinessRuleException {
		if (instructor == null) {
			throw new BusinessRuleException(InstructorRulesMessages.INSTRUCTOR_CANNOT_BE_NULL);
		}
		
	}

	@Override
	public void emailAlreadyExists(String email) throws BusinessRuleException {

		if (instructorDao.get(c -> c.getMail().equals(email)) != null) {
			throw new BusinessRuleException(InstructorRulesMessages.ALREADY_MAİL_EXİSTS);
		}
	}
	
	
	
}
