package business.abstracts;

import java.util.List;

import core.exceptions.BusinessRuleException;
import core.exceptions.ValidatorException;
import entities.Course;

public interface CourseService {

	void add(Course course) throws BusinessRuleException,ValidatorException;
	
	void update(Course course) throws BusinessRuleException,ValidatorException;
	
	void delete(Course course);
	
	List<Course> getAll();
	
	Course getById(int id) throws Exception;
	
	Course getAllByName(String name) throws Exception;
}
