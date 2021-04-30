package OOPIntro;

public class Main {

	public static void main(String[] args) {
	
		Product product1=new Product(1,"Lenovo v5",15000,"16 gb ram");
		
		Product product2=new Product(2,"Lenovo v14",10000,"8 gb ram");
		// product1 ve product2 2.cunstructoru çalýþtýrýyor.
		//product 3 ise ilk yazdýðýmýz "Ben çalýþtým" cunstructorunu çalýþtýrýr.
		Product product3=new Product();
		product3.id=3;
		product3.name="HP 5";
		product3.unitPrice=20000;
		product3.detail="32 gb ram";
		
		Product []products= {product1,product2,product3};
		
		System.out.println(products.length);
		for(Product product:products) {
			System.out.println(product.name);
		}
		
		Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2=new Category();
		category2.id=1;
		category2.name="Ev/Bahçe";
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
	}

}
