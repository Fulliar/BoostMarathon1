package soru4;

public class DaireCevreHesaplama {
	
	double yariCap;
	
	
	public DaireCevreHesaplama(double yariCap) {
		super();
		this.yariCap = yariCap;
	}


	public double cevre() {
		double alan = 2*Math.PI*yariCap;
		return alan;
	}
	
	
}
