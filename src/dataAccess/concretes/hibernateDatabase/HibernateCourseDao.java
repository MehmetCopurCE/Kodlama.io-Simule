package dataAccess.concretes.hibernateDatabase;

import dataAccess.abstracts.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Course Hibernate ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course Hibernate ile veritabanından silindi.");		
	}

	@Override
	public void update(Course course) {
		System.out.println("Course Hibernate ile veritabanında güncellendi");		
	}

}
