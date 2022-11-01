package core.rules.abstracts;

import core.exceptions.BusinessRuleException;
import entities.Course;

public interface CourseRules {

	void courseAlreadyExists(String name) throws BusinessRuleException;
	void courseCannotBeNull(Course course) throws BusinessRuleException;
}
