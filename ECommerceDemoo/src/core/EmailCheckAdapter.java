package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entities.concretes.User;

public class EmailCheckAdapter implements EmailCheckService{
	
	private String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

	@Override
	public boolean emailCheck(User user) {
		Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(user.getEmail());
		return matcher.find();
	}

}
