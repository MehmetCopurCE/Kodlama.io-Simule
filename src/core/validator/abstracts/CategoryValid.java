package core.validator.abstracts;

import core.exceptions.ValidatorException;
import entities.Category;

public interface CategoryValid {

	void isValid(Category category) throws ValidatorException;
}
