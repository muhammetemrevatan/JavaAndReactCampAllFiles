package Concrete;

import Abstract.ISalesCustomer;
import Entities.Customer;
import Entities.Sales;

public class SalesManager implements ISalesCustomer{

	@Override
	public void sale(Sales sale, Customer customer) {
		
		System.out.println(customer.getFirstname() + " isimli m��teri " 
							+ sale.getGamename() + " isimli oyunu "
							+ sale.getPrice() + "'liraya sat�n ald�.");
		
	}
	
}
