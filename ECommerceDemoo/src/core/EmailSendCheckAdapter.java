package core;

public class EmailSendCheckAdapter implements EmailSendCheckService {

	@Override
	public boolean sendCheck() {
		System.out.println("Doðrulama linkine týklandý. Sistem onay verdi.");
		return true;
	}

}
