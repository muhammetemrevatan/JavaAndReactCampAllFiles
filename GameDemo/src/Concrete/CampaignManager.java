package Concrete;

import Entities.Campaign;

public class CampaignManager {
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi.. : " + campaign.getCampaignName());
	}
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi.. : " + campaign.getCampaignName());
	}
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi.. : " + campaign.getCampaignName());
	}
	
}
