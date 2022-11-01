package core.rules.concretes;

import core.exceptions.BusinessRuleException;
import core.rules.abstracts.CourseRules;
import core.rules.concretes.constants.CourseRulesMessages;
import dataAccess.abstracts.CourseDao;
import entities.Course;

public class CourseRuleBusiness implements CourseRules {

	private CourseDao courseDao;

	public CourseRuleBusiness(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	@Override
	public void courseAlreadyExists(String name) throws BusinessRuleException {
		if (this.courseDao.get(c -> c.getName().equals(name)) != null) {
			throw new BusinessRuleException(CourseRulesMessages.COURSE_ALREADY_EXİSTS);
		}
		
	}

	@Override
	public void courseCannotBeNull(Course course) throws BusinessRuleException {

		if (course == null) {
			throw new BusinessRuleException(CourseRulesMessages.COURSE_CANNOT_BE_NULL);
		}
	}
	
	
	
}
