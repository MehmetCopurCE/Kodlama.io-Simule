package core.rules.abstracts;

import core.exceptions.BusinessRuleException;
import entities.Instructor;

public interface InstructorRules {
	 void educatorCannotBeNull(Instructor instructor) throws BusinessRuleException;
	 void emailAlreadyExists(String email) throws BusinessRuleException;

}
