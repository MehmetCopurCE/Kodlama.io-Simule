package core.validator.abstracts;

import core.exceptions.ValidatorException;
import entities.Instructor;

public interface InstructorValid {

	void isValid(Instructor instructor) throws ValidatorException;
}
