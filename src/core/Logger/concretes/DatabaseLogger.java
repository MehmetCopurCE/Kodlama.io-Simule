package core.Logger.concretes;

import core.Logger.abstracts.Logger;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı : " + data);
		
	}

}
