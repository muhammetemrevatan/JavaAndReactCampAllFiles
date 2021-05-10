package Concrete;

import Abstract.ICustomerService;
import Entities.Customer;

public class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Oyuncu kaydedildi : " + customer.getFirstname());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Oyuncu güncellendi : " + customer.getFirstname());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Oyuncu silindi : " + customer.getFirstname());
		
	}

}
