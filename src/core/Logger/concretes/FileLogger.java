package core.Logger.concretes;

import core.Logger.abstracts.Logger;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı : " + data);
		
	}

}
