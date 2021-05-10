package Entities;

public class Campaign {
	private int campaignId;
	private String campaignName;
	private double campaignDiscount;
	
	public Campaign(int campaignId, String campaignName, double campaignDiscount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public double getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
	
	
	
	
	
	
}
