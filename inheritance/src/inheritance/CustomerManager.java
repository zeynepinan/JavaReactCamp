package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.customerNumber+" kaydedildi.");
	}
	//bulk insert
	//�oklu m��teri ekleme
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer:customers) {
			add(customer);
		}
	}
}

//SOLID-Open Closed Principle- koda yeni bir �ey eklendi�inde mevcut kodlar�n de�i�memesi gerekir.
