package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaingName() +" adlý kampanya sisteme eklendi");
	}
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaingName()+" adlý kampanya sistemden silindi");
	}
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaingName()+" adlý kampanyanýn bilgileri güncellendi");
	}
}
