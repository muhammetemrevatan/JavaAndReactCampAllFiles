
public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("saved to starbucksDatabase : " + customer.FirstName);
		}else {
			System.out.println("Not a valid person");
		}
		
	}

}
