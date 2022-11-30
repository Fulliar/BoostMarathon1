package soru4;

public class KareAlanHesaplama {

	double kenar;
	
	public KareAlanHesaplama(double kenar) {
		super();
		this.kenar = kenar;
	}
	
	public double alan() {
		 double alan = kenar * kenar;
		 return alan;
	}
	
}
