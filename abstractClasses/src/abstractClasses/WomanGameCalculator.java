package abstractClasses;

public class WomanGameCalculator extends GameCalculator{
	
	@Override
	public void hesapla() { // extends ettiðimiz class'taki methodu burada tekrar kullanarak farklý bir iþlem yaptýk buna == OVERRÝDE diyoruz..
		System.out.println("Puanýnýz : 95");
	}
}
