package business.concretes;

import java.util.List;

import core.Logger.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;

	
	public CategoryManager() {
		
	}


	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	

	public void add(Category category) {
		for(Category categories : categories) {
			
		}
	}

}
