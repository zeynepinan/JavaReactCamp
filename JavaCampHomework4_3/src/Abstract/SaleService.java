package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {

	void sale(Gamer gamer, Game game);
	void campaignSale(Gamer gamer,Game game,Campaign campaign);
}
