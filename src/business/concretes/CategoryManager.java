package business.concretes;
import java.util.List;

import business.abstracts.CategoryService;
import business.concretes.constant.CategoryManagerMessages;
import core.Logger.abstracts.Logger;
import core.exceptions.BusinessRuleException;
import core.exceptions.ValidatorException;
import core.rules.abstracts.CategoryRules;
import core.validator.abstracts.CategoryValid;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class CategoryManager implements CategoryService{

	private CategoryDao categoryDao;
	private CategoryRules categoryRules;
	private CategoryValid categoryValid;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao, CategoryRules categoryRules, CategoryValid categoryValid,
			Logger[] loggers) {
		
		this.categoryDao = categoryDao;
		this.categoryRules = categoryRules;
		this.categoryValid = categoryValid;
		this.loggers = loggers;
	}


	@Override
	public void add(Category category) throws BusinessRuleException, ValidatorException {
		this.addBusinessCheck(category);
		this.categoryDao.add(category);
		this.log("Kategori veritabanına eklendi: " + category.getName());
		
	}


	@Override
	public void update(Category category) throws BusinessRuleException, ValidatorException {
		this.updateBusinessCheck(category);
		this.categoryDao.update(category);
		this.log("Kategori veritabanına güncellendi: " + category.getName());
		
	}


	@Override
	public void delete(Category category) {
		this.categoryDao.remove(category);
		this.log("Kategori veritabanından silindi: " + category.getName());		
	}


	@Override
	public List<Category> getAll() {
		return this.categoryDao.getAll();
	}


	@Override
	public Category getById(int id) throws Exception {
		Category category = this.categoryDao.get(c -> c.getId() == id);
		if (category == null) {
			throw new Exception(CategoryManagerMessages.CATEGORY_NOT_FOUND);
		}
		return category;
	}


	@Override
	public List<Category> getAllByName(String name) {
		return this.categoryDao.getAll(c -> c.getName().equals(name));
	}
	
	private void log(String data) {
		for (Logger logger : this.loggers) {
			logger.log(data);
		}
	}
	
	private void addBusinessCheck(Category category) throws BusinessRuleException,ValidatorException{
		this.categoryRules.categoryCannotBeNull(category);
		this.categoryValid.isValid(category);
		this.categoryRules.categoryAlreadyExists(category.getName());
	}
	
	private void updateBusinessCheck(Category category) throws BusinessRuleException, ValidatorException{
		this.categoryRules.categoryCannotBeNull(category);
		this.categoryValid.isValid(category);
		this.categoryRules.categoryAlreadyExists(category.getName());
	}
	
	

}
