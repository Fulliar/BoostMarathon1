package soru1;

public class Test {

	public static void main(String[] args) {
		
		dongu();

	}
	
	public static void dongu() {
		
		
		for(int i = 10;i>0;i--) {
			if(i>=7) {
				 System.out.println("*******");
			} else if(i==6) {
				System.out.println("******");
			} else if(i==5 ) {
				System.out.println("*****");
			} else if(i==4) {
				System.out.println("****");
			} else if(i==3) {
				System.out.println("***");
			} else if(i==2) {
				System.out.println("**");
			} else if(i==1) {
				System.out.println("*");
			} else {
				break;
			}
		}
		
	}
	
}
