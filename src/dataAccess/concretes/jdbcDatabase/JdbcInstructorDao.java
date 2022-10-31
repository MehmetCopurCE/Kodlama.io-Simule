package dataAccess.concretes.jdbcDatabase;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class JdbcInstructorDao  implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor Jdbc ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Instructor Jdbc ile veritabanından silindi.");		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Instructor Jdbc ile güncellendi");		
	}
}
