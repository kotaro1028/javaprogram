package kotaro1116;

import java.util.Random;

public class Aaaaaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a = r.nextInt(3);
		int b =  r.nextInt(3);
		
		if( a == b ) {
			System.out.println("same");
		}
		else if (a > b) {
			switch(b){
			case 2: 
				System.out.println("winner b!");
				break;
			case 3: 
				System.out.println("winner a!");
				break;
				
			}
			
		}
		else if (a == 2) {
			switch(b){
			case 1: 
				System.out.println("winner a!");
				break;
			case 3: 
				System.out.println("winner b!");
				break;
				
			}
	}
		else if (a == 3) {
			switch(b){
			case 1: 
				System.out.println("winner a!");
				break;
			case 2: 
				System.out.println("winner b!");
				break;
				
			}
	}
	}

}
