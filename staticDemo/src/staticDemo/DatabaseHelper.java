package staticDemo;

public class DatabaseHelper {
	
	//inner class'lara �rnek yapt�k fakat bu kullan�m �nerilmez...
	// ��nk� crud i�in yeni bir class ve connection i�in yeni bir class
	// olu�turmak daha kullan��l�d�r. sekt�rde �ok yayg�n de�il art�k.
	// g�n�m�zde inner classlar pek kullan�lmaz g�zel g�zel classlara ay�r�l�r.
	
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
