package inheritance;

public class Main {

	public static void main(String[] args) {
		//inheritance=miras
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.customerNumber="12345";

		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.customerNumber="67890";
	
	    CustomerManager customerManager=new CustomerManager();
	    customerManager.add(individualCustomer );
	    customerManager.add(corporateCustomer);
	    
	    //polymorphism' e örnek
	    //çoklu müþteri ekleme
	    Customer[] customers= {individualCustomer,corporateCustomer};
	    
	    customerManager.addMultiple(customers);
	}

}
