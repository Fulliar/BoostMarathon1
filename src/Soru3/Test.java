package Soru3;

public class Test {

	public static void main(String[] args) {

		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		Aslan aslan = new Aslan("Leo",120,140);
		Yilan yilan = new Yilan("Terminator",40,225);

		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo",120,140));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko",45,50));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra",35,200));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Kermit",2,35));
		
		
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		
		
		
		System.out.println("------------------------------------------------");
		
		hayvanatBahcesi.hayvaniHareketEttir("Leo");
		hayvanatBahcesi.hayvaniHareketEttir("Cobra");
		
		System.out.println("------------------------------------------------");
		
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Leo");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Zeo");

		
		System.out.println("------------------------------------------------");
		
		hayvanatBahcesi.hayvaninCinsiniBul("Çiko");
		hayvanatBahcesi.hayvaninCinsiniBul("Cobra");
		hayvanatBahcesi.hayvaninCinsiniBul("MAÇO");
		
		
		System.out.println("------------------------------------------------");
		
		System.out.println(hayvanatBahcesi.toString());
	}

}
