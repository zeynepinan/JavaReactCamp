package OOPIntro;

public class Product {

	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	//Product class � tek i� yapar.�zellik tutar.
	//CONSTRUCTOR BLO�U
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
