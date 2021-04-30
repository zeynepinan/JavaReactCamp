package OOPIntro;

public class Product {

	
	public Product() {
		System.out.println("Ben çalýþtým");
	}
	
	//Product class ý tek iþ yapar.Özellik tutar.
	//CONSTRUCTOR BLOÐU
	public Product(int id,String name,double unitPrice,String detail) {
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
}
