package dataAccess.concretes.jdbcDatabase;

import dataAccess.abstracts.CourseDao;
import entities.Course;

public class JdbcCourseDao  implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Course Jdbc ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course Jdbc ile veritabanından silindi.");		
	}

	@Override
	public void update(Course course) {
		System.out.println("Course Jdbc ile güncellendi");		
	}
}
