package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() +" adl� oyun sisteme eklendi");
	}
	public void delete(Game game) {
		System.out.println(game.getGameName()+" adl� oyun sistemden silindi");
	}
	public void update(Game game) {
		System.out.println(game.getGameName()+" adl� oyunun bilgileri g�ncellendi");
	}
}
