package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() +" adlý oyun sisteme eklendi");
	}
	public void delete(Game game) {
		System.out.println(game.getGameName()+" adlý oyun sistemden silindi");
	}
	public void update(Game game) {
		System.out.println(game.getGameName()+" adlý oyunun bilgileri güncellendi");
	}
}
