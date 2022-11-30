package soru2;

public class Test {

	public static void main(String[] args) {
		
		int sayiDizisi[] = { 0, 1, 5, 3 };
		
		tekrarEdenBul(sayiDizisi);

	}
	
	public static void tekrarEdenBul(int sayiDizisi[]) {
		int count = 0;
		int sayi = 0;
		for(int i = 0; i<sayiDizisi.length ; i++) 
		{
			if(count!=0) {
				continue;
			} else {
			for(int y = i+1; y<sayiDizisi.length ; y++) {	
				if(sayiDizisi[i]==sayiDizisi[y]) {
					count++;
					sayi = sayiDizisi[i];
				}
			}
			}
		}
		
		if(count==0) {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		} else{
			count++;
			System.out.println(sayi + " sayisi " + count + " kez tekrar ediyor.");
		}
		
		
	}



}
