package dataAccess.concretes.hibernateDatabase;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor Hibernate ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Instructor Hibernate ile veritabanından silindi.");		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Instructor Hibernate ile güncellendi");		
	}

}
