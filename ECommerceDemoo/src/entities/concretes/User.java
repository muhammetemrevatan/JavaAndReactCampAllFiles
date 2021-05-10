package entities.concretes;

public class User {
	private String firstname;
	private String lastname;
	private String email;
	private String parola;
	
	public User() {
		
	}
	
	public User(String firstname, String lastname, String email, String parola) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.parola = parola;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getParola() {
		return parola;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
}