package soru4;

public class KareCevreHesaplama {
	double kenar;
	
	
	public KareCevreHesaplama(double kenar) {
		super();
		this.kenar = kenar;
	}


	public double cevre() {
		double cevre = kenar*4;
		return cevre;
	}
	
}
