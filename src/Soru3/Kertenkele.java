package Soru3;

public class Kertenkele extends Surungen {

	public Kertenkele(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public	String surun() {
		return ad + " sürünüyor...";
	}

	@Override
	public String sesCikar() {
		
		return ad + " kertenkele sesi çıkarıyor...";
		
		
	}

}
