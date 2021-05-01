package inheritance2;

public class CustomerManager {

	public void add(Logger logger ) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi.");
		
		//Yanlýþ kullaným--DatabaseLogger dtLogger=new DatabaseLogger();
		//Ýþ yapan bir sýnýf baþka bir iþ sýnýfýný kullanacaksa 
		//asla ve asla somut sýnýftan gidilmez.
		
		//Somut sýnýflar new'lenmez.
		
		
		logger.log();
	}
}
