package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaingName() +" adl� kampanya sisteme eklendi");
	}
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaingName()+" adl� kampanya sistemden silindi");
	}
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaingName()+" adl� kampanyan�n bilgileri g�ncellendi");
	}
}
