package core.Logger;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Mail gşöderildi " + data);
	}

	
}
