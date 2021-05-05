package Entities;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;

public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer(1,"Zeynep","Ýnan","zey@gmail.com","zeyy","100000000",1998);
		
		GamerManager gamerManager=new GamerManager();
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		
		Campaign campaign1=new Campaign(1,"Büyük Ocak Ýndirimi",0.4,15000);
		System.out.println(campaign1.getCampaingName() +"  "+campaign1.getUnitPriceAfterDiscount());
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);

		
		Game game1=new Game(1,"PubG",15);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.delete(game1);
		gameManager.update(game1);
		
	}

}
