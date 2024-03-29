package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheck;
	

	public CustomerManager(ICustomerCheckService customerCheck) {
		this.customerCheck = customerCheck;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheck.CheckIfRealPerson(customer)) {
			System.out.println("Marnis dogruland� kay�t ba�ar�l�..");
			super.save(customer);
		}else {
			System.out.println("Mernis onaylanmad� kay�t ba�ar�s�z...");
		}
	}

	@Override
	public void update(Customer customer) {
		super.update(customer);
	}

	@Override
	public void delete(Customer customer) {
		super.delete(customer);
	}
	
	 
	
}
