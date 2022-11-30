package Soru3;

public class Yilan extends Surungen {
	
	public Yilan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		// TODO Auto-generated constructor stub
		this.tehlikemi = true;
	}

	@Override
	public	String surun() {
		return ad + " sürünüyor...";	
	}

	@Override
	public String sesCikar() {
		return ad + " tıslama sesi çıkarıyor...";	
	}

}
