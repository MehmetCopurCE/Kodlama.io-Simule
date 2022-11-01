package core.validator.abstracts;

import core.exceptions.ValidatorException;
import entities.Course;

public interface CourseValid{

	void isValid(Course course) throws ValidatorException;
}
