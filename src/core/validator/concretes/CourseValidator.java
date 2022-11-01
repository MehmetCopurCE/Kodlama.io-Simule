package core.validator.concretes;

import core.exceptions.ValidatorException;
import core.rules.concretes.constants.CourseRulesMessages;
import core.validator.abstracts.CourseValid;
import entities.Course;

public class CourseValidator implements CourseValid{

	@Override
	public void isValid(Course course) throws ValidatorException {
		if (course.getName().isEmpty()) {
			throw new ValidatorException(CourseRulesMessages.COURSE_CANNOT_BE_NULL);
		}
		
	}

}
