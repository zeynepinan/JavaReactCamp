package inheritance2;

public class CustomerManager {

	public void add(Logger logger ) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi.");
		
		//Yanl�� kullan�m--DatabaseLogger dtLogger=new DatabaseLogger();
		//�� yapan bir s�n�f ba�ka bir i� s�n�f�n� kullanacaksa 
		//asla ve asla somut s�n�ftan gidilmez.
		
		//Somut s�n�flar new'lenmez.
		
		
		logger.log();
	}
}
