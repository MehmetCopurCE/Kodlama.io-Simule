package business.concretes;

import java.util.List;

import business.abstracts.InstructorService;
import business.concretes.constant.InstructorManagerMessages;
import core.Logger.abstracts.Logger;
import core.exceptions.BusinessRuleException;
import core.exceptions.ValidatorException;
import core.rules.abstracts.InstructorRules;
import core.validator.abstracts.InstructorValid;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class InstructorManager implements InstructorService{

	private InstructorDao instructorDao;
	private InstructorRules instructorRules;
	private InstructorValid instructorValid;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, InstructorRules instructorRules,
			InstructorValid instructorValid, Logger[] loggers) {

		this.instructorDao = instructorDao;
		this.instructorRules = instructorRules;
		this.instructorValid = instructorValid;
		this.loggers = loggers;
	}

	@Override
	public void add(Instructor instructor) throws BusinessRuleException, ValidatorException {
		this.addBusinessCheck(instructor);
		this.instructorDao.add(instructor);
		this.log("Veritabanına eklendi: " + instructor.getFirstName());
	}

	@Override
	public void update(Instructor instructor) throws BusinessRuleException, ValidatorException {

		this.updateBusinessCheck(instructor);
		this.instructorDao.update(instructor);
		this.log("Veritabanına güncellendi: " + instructor.getFirstName());
	}

	@Override
	public void delete(Instructor instructor) {
		this.instructorDao.remove(instructor);
		this.log("Veritabanında güncellendi: " + instructor.getFirstName());
	}

	@Override
	public List<Instructor> getAll() {
		return this.instructorDao.getAll();
	}

	@Override
	public Instructor getById(int id) throws Exception {
		Instructor instructor = this.instructorDao.get(c -> c.getId() == id);
		if (instructor == null) {
			throw new Exception(InstructorManagerMessages.INSTRUCTOR_NOT_FOUND);
		}
		return instructor;
	}

	@Override
	public List<Instructor> getAllByName(String name) {
		return this.instructorDao.getAll(c -> c.getFirstName().equals(name));
	}

	 private void log(String data) {
	        for (Logger logger : this.loggers) {
	            logger.log(data);
	        }
	    }

	    private void addBusinessCheck(Instructor instructor) throws BusinessRuleException, ValidatorException {
	        this.instructorRules.educatorCannotBeNull(instructor);
	        this.instructorValid.isValid(instructor);
	        this.instructorRules.emailAlreadyExists(instructor.getMail());
	    }

	    private void updateBusinessCheck(Instructor instructor) throws BusinessRuleException, ValidatorException {
	        this.instructorRules.educatorCannotBeNull(instructor);
	        this.instructorValid.isValid(instructor);
	        this.instructorRules.emailAlreadyExists(instructor.getMail());
	    }
}
