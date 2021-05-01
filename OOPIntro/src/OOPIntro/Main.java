package OOPIntro;

public class Main {

	public static void main(String[] args) {
	
		Product product1=new Product(1,"Lenovo v5",15000,"16 gb ram",7.8);
		
		Product product2=new Product(2,"Lenovo v14",10000,"8 gb ram",10);
		// product1 ve product2 2.cunstructoru çalýþtýrýyor.
		//product 3 ise ilk yazdýðýmýz "Ben çalýþtým" cunstructorunu çalýþtýrýr.
		
		Product product3=new Product();
		product3.setId(3);
		product3.setName("HP 5");
		product3.setDetail("32 gb ram");
		product3.setDiscount(10);
		product3.setUnitPrice(16000);
		
		System.out.println(product3.getUnitPriceAfterDiscount());
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Ýçecek");

		Category category2=new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
	}

}
