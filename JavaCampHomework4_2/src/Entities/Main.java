package Entities;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1,"Zeynep","Ýnan",1998,"100000000");
	    
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());  
	    
		Customer customer1=new Customer(1,"Zeynep","Ýnan",1998,"100000000");
	    
		customerManager.Save(customer);
		customerManager.Save(customer1);
	
	}

}
