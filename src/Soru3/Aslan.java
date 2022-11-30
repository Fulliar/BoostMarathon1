package Soru3;

public class Aslan extends MemeliHayvan {
	
	
	
	public Aslan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		// TODO Auto-generated constructor stub
		this.tehlikemi = true;
	}

	@Override
	public String yuru() {
		
		return ad + " yürüyor";
		
	}

	@Override
	public String sesCikar() {
		
		return ad + " kükrüyor...";
		
	}

}
