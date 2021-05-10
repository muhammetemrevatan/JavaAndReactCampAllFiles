package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Sales;

public class CampaignServiceManager implements ICampaignService{
	private double newPrice;
	
	public CampaignServiceManager() {
		
	}

	public double getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(int newPrice) {
		this.newPrice = newPrice;
	}

	

	@Override
	public void controlGameId(Campaign campaign,Sales sale) {
		
		if(campaign.getCampaignDiscount() != 0) {
			this.newPrice = (sale.getPrice() - sale.getPrice() * campaign.getCampaignDiscount() / 100);
			sale.setPrice((int) this.newPrice);
		}else {
			System.out.println("Herhangi bir indirim uygulanmadı..");
		}
		
	}

}
