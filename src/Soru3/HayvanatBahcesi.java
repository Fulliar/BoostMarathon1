package Soru3;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {

		//Önceden belirtilmeyen sayıda Hayvan tipinden nesneler bulunabilecektir.
		
		
		private List<Hayvan> hayvanatBahcesiList = new ArrayList<Hayvan>();
		
		
		public void bahceyeMemeliHayvanEkle(MemeliHayvan memeliHayvan) {
			
			int count = 0;
			
			for(Hayvan hayvan : hayvanatBahcesiList) {
				if(hayvan.ad != memeliHayvan.ad && count == 0) {
					count++;
				} else if(count>=1) {
					System.out.println("Bu isimde bir hayvan zaten var.");
				}
			}	
				if(count>0) {
					hayvanatBahcesiList.add(memeliHayvan);
				}
		
		}
			
		public void bahceyeSurungenEkle(Surungen surungen) {
			
		
			
				hayvanatBahcesiList.add(surungen);
			
		}


		public void hayvanSesCikarsin(Hayvan hayvan) {
			System.out.println(hayvan.sesCikar());		
		}
		
		
		public void hayvaninCinsiniBul(String hayvanAdi) {
			int count = 0;
			for(Hayvan hayvan : hayvanatBahcesiList) {
				
				if(hayvan.ad.equals(hayvanAdi)) {
					count++;
					if(hayvan instanceof MemeliHayvan) 
					{
						System.out.println(hayvan.ad + " bir Memeli Hayvandır.");
						
					} else if(hayvan instanceof Surungen){
						System.out.println(hayvan.ad + " bir Surungen Hayvandır." );
						
					}
				}
			}
			if(count==0) {
				System.out.println( hayvanAdi + " isimli bir hayvan hayvanat bahcesinde yok.");
			}
		}
		
		
		
		
		public void hayvaninBilgileriniYazdir(String hayvanAdi) {
			int count = 0;
			for(Hayvan hayvan: hayvanatBahcesiList) 
			{
				if(hayvan.ad.equals(hayvanAdi)) 
				{
					count++;
					System.out.println(hayvan.toString());
					
				} 
				
			}
			
			if(count == 0) {
				System.out.println(hayvanAdi + " isimli bir hayvan bulunmamaktadır.");
			}
		}
		
		
		public void hayvaniHareketEttir(String hayvanAdi) {	
			for(Hayvan hayvan : hayvanatBahcesiList) {
				
				if(hayvan.ad.equals(hayvanAdi) && hayvan instanceof MemeliHayvan) {
					MemeliHayvan memeliHayvan = (MemeliHayvan) hayvan;
					System.out.println(memeliHayvan.yuru());
				}else if(hayvan.ad.equals(hayvanAdi) && hayvan instanceof Surungen){
					Surungen surungen = (Surungen) hayvan;
					System.out.println(surungen.surun());
					break;
				}
					
			}
		}

		
		@Override
		public String toString() {
			return "HayvanatBahcesi [hayvanatBahcesiList=" + hayvanatBahcesiList + "]";
		}
		

	

}
