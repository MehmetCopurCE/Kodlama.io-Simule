package business.concretes;

import java.util.List;

import business.abstracts.CourseService;
import business.concretes.constant.CourseManagerMessages;
import core.Logger.abstracts.Logger;
import core.exceptions.BusinessRuleException;
import core.exceptions.ValidatorException;
import core.rules.abstracts.CourseRules;
import core.validator.abstracts.CourseValid;
import dataAccess.abstracts.CourseDao;
import entities.Course;

public class CourseManager implements CourseService {

	private CourseDao courseDao;
	private CourseRules courseRules;
	private CourseValid courseValid;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, CourseRules courseRules, CourseValid courseValid, Logger[] loggers) {

		this.courseDao = courseDao;
		this.courseRules = courseRules;
		this.courseValid = courseValid;
		this.loggers = loggers;
	}

	@Override
	public void add(Course course) throws BusinessRuleException, ValidatorException {
		this.addBusinessCheck(course);
		this.courseDao.add(course);
		this.log("Kurs veritabanına eklendi: " + course.getName());
	}

	@Override
	public void update(Course course) throws BusinessRuleException, ValidatorException {
		this.updateBusinessCheck(course);
		this.courseDao.update(course);
		this.log("Kurs veritabanında güncellendi: " + course.getName());
	}

	@Override
	public void delete(Course course) {
		this.courseDao.remove(course);
		this.log("Kurs veritabanından silindi: " + course.getName());
	}

	@Override
	public List<Course> getAll() {
		return this.courseDao.getAll();
	}

	@Override
	public Course getById(int id) throws Exception {
		Course course = this.courseDao.get(c -> c.getId() == id);
		if (course == null)
			throw new Exception(CourseManagerMessages.COURSE_NOT_FOUND);
		return course;
	}

	@Override
	public Course getAllByName(String name) {
		return  this.courseDao.get(c -> c.getName().equals(name));
	}

	private void log(String data) {
		for (Logger logger : this.loggers) {
			logger.log(data);
		}
	}

	private void addBusinessCheck(Course course) throws BusinessRuleException, ValidatorException {
		this.courseRules.courseCannotBeNull(course);
		this.courseValid.isValid(course);
		this.courseRules.courseAlreadyExists(course.getName());
	}

	private void updateBusinessCheck(Course course) throws BusinessRuleException, ValidatorException {
		this.courseRules.courseCannotBeNull(course);
		this.courseValid.isValid(course);
		this.courseRules.courseAlreadyExists(course.getName());
	}
}
