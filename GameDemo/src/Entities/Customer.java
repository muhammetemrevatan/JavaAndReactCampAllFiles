package Entities;

public class Customer {
	private int playerid;
	private String playernick;
	private String firstname;
	private String lastname;
	private String date;
	private String identification;
	
	public Customer(int playerid, String playernick, String firstname, String lastname, String date,
			String identification) {
		super();
		this.playerid = playerid;
		this.playernick = playernick;
		this.firstname = firstname;
		this.lastname = lastname;
		this.date = date;
		this.identification = identification;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getPlayernick() {
		return playernick;
	}

	public void setPlayernick(String playernick) {
		this.playernick = playernick;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}
}
