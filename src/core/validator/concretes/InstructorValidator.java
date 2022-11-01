package core.validator.concretes;

import core.exceptions.ValidatorException;
import core.validator.abstracts.InstructorValid;
import core.validator.concretes.constant.InstructorValidatorMessages;
import entities.Instructor;

public class InstructorValidator implements InstructorValid{

	@Override
	public void isValid(Instructor instructor) throws ValidatorException {
		if (instructor.getMail().isEmpty()) {
			throw new ValidatorException(InstructorValidatorMessages.EMAİL_CANNOT_BE_EMPTY);
		}
		if (instructor.getFirstName().isEmpty()) {
			throw new ValidatorException(InstructorValidatorMessages.FIRSTNAME_CANNOT_BE_EMPTY);
		}
		if (instructor.getLastName().isEmpty()) {
			throw new ValidatorException(InstructorValidatorMessages.LASTNAME_CANNOT_BE_EMPTY);
		}
		
	}

}
