package Entities;

public class Sales {
	private int gameid;
	private int price;
	private String gamename;
	
	public Sales(int gameid, int price, String gamename) {
		super();
		this.gameid = gameid;
		this.price = price;
		this.gamename = gamename;
	}

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	
	
}
