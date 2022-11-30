package Soru3;

public class Maymun extends MemeliHayvan {

	public Maymun(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}

	@Override
	public String yuru() {
		
		return ad + " yürüyor";
		
		
	}

	@Override
	public String sesCikar() {

		return ad + " maymun sesi çıkarıyor";
		
	}

}
