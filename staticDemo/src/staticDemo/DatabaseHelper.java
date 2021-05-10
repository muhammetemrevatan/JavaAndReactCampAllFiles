package staticDemo;

public class DatabaseHelper {
	
	//inner class'lara örnek yaptýk fakat bu kullaným önerilmez...
	// çünkü crud için yeni bir class ve connection için yeni bir class
	// oluþturmak daha kullanýþlýdýr. sektörde çok yaygýn deðil artýk.
	// günümüzde inner classlar pek kullanýlmaz güzel güzel classlara ayýrýlýr.
	
	public static class Crud { // crud = create read update delete
		public static void Delete() {
			
		}
		public static void Update() {
			
		}
	}
	
	public static class Connection { 
		public static void createConnection() { 
			
		} 
	} 
}
