package dataAccess.concretes.hibernateDatabase;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category Hibernate ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category Hibernate ile veritabanından silindi.");		
	}

	@Override
	public void update(Category category) {
		System.out.println("Category Hibernate ile güncellendi");		
	}


}
