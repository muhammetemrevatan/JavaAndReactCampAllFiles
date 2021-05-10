package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager dataDatabaseManager;
	
	public void getCustomers() {
		dataDatabaseManager.getData();
	}
}
