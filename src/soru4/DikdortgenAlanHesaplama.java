package soru4;

public class DikdortgenAlanHesaplama {
	double kisaKenar;
	double uzunKenar;
	
	
	
	public DikdortgenAlanHesaplama(double kisaKenar, double uzunKenar) {
		super();
		this.kisaKenar = kisaKenar;
		this.uzunKenar = uzunKenar;
	}



	public double alan() {
		double alan = kisaKenar * uzunKenar;
		return alan;
	}
}
