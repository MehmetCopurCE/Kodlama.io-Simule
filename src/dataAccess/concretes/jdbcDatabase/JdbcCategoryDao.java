package dataAccess.concretes.jdbcDatabase;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category Jdbc ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category Jdbc ile veritabanından silindi.");		
	}

	@Override
	public void update(Category category) {
		System.out.println("Category Jdbc ile güncellendi");		
	}
	
	
}
