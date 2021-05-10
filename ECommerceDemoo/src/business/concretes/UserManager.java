package business.concretes;

import java.util.Scanner;

import business.abstracts.UserService;
import core.EmailCheckService;
import core.EmailSendCheckService;
import core.EmailSendService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	private EmailCheckService emailCheckService;
	private UserDao userDao;
	private EmailSendService emailSendService;
	private EmailSendCheckService emailSendCheckService;

	
	public UserManager(EmailCheckService emailCheckService, UserDao userDao, EmailSendService emailSendService
			,EmailSendCheckService emailSendCheckService) {
		super();
		this.emailCheckService = emailCheckService;
		this.userDao = userDao;
		this.emailSendService = emailSendService;
		this.emailSendCheckService = emailSendCheckService;
	}
	
	
	
	Scanner input = new Scanner(System.in);
	
	@Override
	public void register(User user) {
		if(user.getParola().length() >= 6) {
			if(user.getFirstname().length() >= 2) {
				if(user.getLastname().length() >= 2) {
					if(emailCheckService.emailCheck(user) == true) {
						if(emailIsItUsed(user.getEmail()) == true) {
							emailSendService.sendCheckMail();
							if(emailSendCheckService.sendCheck() == true) {
								System.out.println("Ba�ar� ile kay�t olundu..");
								this.userDao.add(user);
								this.userDao.addEmail(user);
							}
						}else {
							System.out.println("Kay�t ba�ar�s�z. Bu eposta daha �nce al�nm��..");
						}
					}else {
						System.out.println("Email kurallara uygun girilmelidir.");
					}
				}else {
					System.out.println("(Soyisim 2 karakterden daha fazla olmal�d�r.)");
				}
			}else {
				System.out.println("(�sim 2 karakterden daha fazla olmal�d�r.)");
			}
		}else {
			System.out.println("(Parola 6 karakterden daha fazla olmal�d�r.)");
		}
	}


	@Override
	public boolean emailIsItUsed(String email) {
		boolean result = false;
		if (userDao.getEmail().contains(email)) {
			result = false;
		}else {
			result = true;
		}
		return result;
	}

	@Override
	public void login(User user) {
		System.out.print("E-Posta Giriniz : ");
		String id = input.next();
		System.out.print("�ifre Giriniz : ");
		String password = input.next();
		
		
		boolean result = false;
		for(String i : userDao.getEmail()) {
			if(i.equals(id)) {
				System.out.println("Kullan�c� sistemde kay�tl�..");
				result=true;
			}else {
				System.out.println("Kullan�c� sistemde kay�tl� de�il. Giri� ba�ar�s�z.");
			}
		}
		if(result) {
			if(user.getEmail().equals(id) && user.getParola().equals(password)) {
				System.out.println("Giri� Ba�ar�l�...");
			}else {
				System.out.println("Giri� Ba�ar�s�z...");
			}
		}
			
	}

	
}
