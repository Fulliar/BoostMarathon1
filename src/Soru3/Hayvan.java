package Soru3;

public abstract class Hayvan {
	
	String ad;
	int kilosu;
	int uzunlugu;
	boolean tehlikemi;
	
	public Hayvan(String ad, int kilosu, int uzunlugu) {
		
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
		
	}
	
	public abstract String sesCikar();

	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikemi=" + tehlikemi + "]";
	}
	
	
	
	
}
