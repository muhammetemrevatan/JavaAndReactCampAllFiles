package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla(); // kim inherite ediyorsa hesaplayý içermek zorunda
	// yani override etmek zorunda. yeni bir hesapla fonksiyonu yazmak zorunda
	// yani ben hesapla diye bir imza oldugunu belirtiyorum..
	// buna abstract operasyonu diyebiliriz.
	
	public final void gameOver() { // final demek bu metodu override edemezsin hiç bir 
		//zaman deðiþmez bu þekilde kullanmak zorundasýn...
		//buna tamamlanmýþ operasyon diyebiliriz.
		System.out.println("Oyun bitti..");
	}

}
