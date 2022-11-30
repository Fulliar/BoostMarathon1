package soru4;

public class DikdortgenCevreHesaplama {
	double kisaKenar;
	double uzunKenar;
	
	
	
	public DikdortgenCevreHesaplama(double kisaKenar, double uzunKenar) {
		super();
		this.kisaKenar = kisaKenar;
		this.uzunKenar = uzunKenar;
	}



	public double cevre() {
		double cevre = 2*(uzunKenar+kisaKenar);
		return cevre;
	}
	
}
