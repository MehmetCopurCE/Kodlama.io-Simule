package business.abstracts;

import java.util.List;

import core.exceptions.BusinessRuleException;
import core.exceptions.ValidatorException;
import entities.Instructor;

public interface InstructorService {

void add(Instructor instructor ) throws BusinessRuleException,ValidatorException;
	
	void update(Instructor instructor) throws BusinessRuleException,ValidatorException;
	
	void delete(Instructor instructor);
	
	List<Instructor> getAll();
	
	Instructor getById(int id) throws Exception;
	
	List<Instructor> getAllByName(String name);
}
