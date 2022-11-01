package core.rules.abstracts;

import core.exceptions.BusinessRuleException;
import entities.Category;

public interface CategoryRules {

	void categoryAlreadyExists(String name) throws BusinessRuleException;
	void categoryCannotBeNull (Category category) throws BusinessRuleException;
}
