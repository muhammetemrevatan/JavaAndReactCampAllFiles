package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla(); // kim inherite ediyorsa hesaplay� i�ermek zorunda
	// yani override etmek zorunda. yeni bir hesapla fonksiyonu yazmak zorunda
	// yani ben hesapla diye bir imza oldugunu belirtiyorum..
	// buna abstract operasyonu diyebiliriz.
	
	public final void gameOver() { // final demek bu metodu override edemezsin hi� bir 
		//zaman de�i�mez bu �ekilde kullanmak zorundas�n...
		//buna tamamlanm�� operasyon diyebiliriz.
		System.out.println("Oyun bitti..");
	}

}
