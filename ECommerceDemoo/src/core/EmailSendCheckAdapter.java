package core;

public class EmailSendCheckAdapter implements EmailSendCheckService {

	@Override
	public boolean sendCheck() {
		System.out.println("Do�rulama linkine t�kland�. Sistem onay verdi.");
		return true;
	}

}
