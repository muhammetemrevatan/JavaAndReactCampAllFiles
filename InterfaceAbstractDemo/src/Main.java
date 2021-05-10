
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer();
		customer1.id = 1;
		customer1.FirstName = "Emre";
		customer1.LastName = "Vatan";
		customer1.DateOfBirt = "28-05-1990";
		customer1.NationalityId = "15498751256";
		
		
		customerManager.Save(customer1);
		
	}

}
