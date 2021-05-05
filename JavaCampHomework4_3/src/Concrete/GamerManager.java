package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" "+ gamer.getLastName()+" adlý oyuncu eklendi");
	}
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" "+ gamer.getLastName()+" adlý oyuncu silindi");
	}
	public void update(Gamer gamer) {
		System.out.println(gamer.firstName +" "+ gamer.getLastName()+" adlý oyuncunun bilgileri güncellendi");
	}
}
