package core.rules.concretes;

import core.exceptions.BusinessRuleException;
import core.rules.abstracts.CategoryRules;
import core.rules.concretes.constants.CategoryRulesMessages;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class CategoryRuleBusiness implements CategoryRules{

	private CategoryDao categoryDao;

	public CategoryRuleBusiness(CategoryDao categoryDao) {
		
		this.categoryDao = categoryDao;
	}

	@Override
	public void categoryAlreadyExists(String name) throws BusinessRuleException {
		if (this.categoryDao.get(c -> c.getName().equals(name)) != null) {
			throw new BusinessRuleException(CategoryRulesMessages.ALREADY_CATEGORY_EXİSTS);
		}
		
	}

	@Override
	public void categoryCannotBeNull(Category category) throws BusinessRuleException {
		if (category == null) {
			throw new BusinessRuleException(CategoryRulesMessages.CATEGORY_CANNOT_BE_NULL);
		}
		
	}

}
