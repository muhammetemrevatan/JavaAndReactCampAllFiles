package Abstract;

import Entities.Customer;

public interface ICustomerService {
	void save(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
