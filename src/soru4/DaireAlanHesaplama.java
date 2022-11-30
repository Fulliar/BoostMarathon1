package soru4;

public class DaireAlanHesaplama {
	double yaricap;
	
	
	
	public DaireAlanHesaplama(double yaricap) {
		super();
		this.yaricap = yaricap;
	}



	public double alan() {
		double alan = Math.PI*yaricap*yaricap;
		return alan;
	}
}
