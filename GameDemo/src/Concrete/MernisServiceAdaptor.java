package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdaptor implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
