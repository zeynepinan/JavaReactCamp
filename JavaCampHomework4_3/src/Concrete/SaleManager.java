package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{
	
	@Override
	public void sale(Gamer gamer,Game game) {
		System.out.println(gamer.getFirstName()+" adl� oyuncu "+ game.getGameName()+" adl� oyunu sat�n ald�.");
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" adl� oyuncu "+ game.getGameName()+" adl� oyunu "+campaign.getCampaingName()+" kampanyas� kapsam�nda %"+campaign.getCampaignRate()+" indirimle "+ campaign.getUnitPriceAfterDiscount()+" fiyata sat�n ald�.");
		
	}

}
