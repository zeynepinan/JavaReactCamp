package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{
	
	@Override
	public void sale(Gamer gamer,Game game) {
		System.out.println(gamer.getFirstName()+" adlý oyuncu "+ game.getGameName()+" adlý oyunu satýn aldý.");
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" adlý oyuncu "+ game.getGameName()+" adlý oyunu "+campaign.getCampaingName()+" kampanyasý kapsamýnda %"+campaign.getCampaignRate()+" indirimle "+ campaign.getUnitPriceAfterDiscount()+" fiyata satýn aldý.");
		
	}

}
