package abstractClasses;

public class ManGameCalculator extends GameCalculator{
	
	@Override
	public void hesapla() { // extends etti�imiz class'taki methodu burada tekrar kullanarak farkl� bir i�lem yapt�k buna == OVERR�DE diyoruz..
		System.out.println("Puan�n�z : 90");
	}

}
