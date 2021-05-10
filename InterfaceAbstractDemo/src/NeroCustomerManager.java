
public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to neroDatabase : " + customer.FirstName);
	}
	

}
