package business.abstracts;

import java.util.List;

import core.exceptions.BusinessRuleException;
import core.exceptions.ValidatorException;
import entities.Category;

public interface CategoryService {

	void add(Category category) throws BusinessRuleException,ValidatorException;
	
	void update(Category category) throws BusinessRuleException,ValidatorException;
	
	void delete(Category category);
	
	List<Category> getAll();
	
	Category getById(int id) throws Exception;
	
	List<Category> getAllByName(String name);
	
}
