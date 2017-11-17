package kotaro1110;

import java.util.Scanner;

public class Second {

	public static void main(String[] day) {
		// TODO Auto-generated method stub
		Scanner bbb = new Scanner (System.in);
		int b = bbb.nextInt();
		if(b == 1) {
			System.out.println("sunday");
		}
		else if(b == 2) {
			System.out.println("monday");
		}
		else if(b == 3) {
			System.out.println("tuseday");
		}
		else if(b == 4) {
			System.out.println("wednesday");
		}
		else if(b == 5) {
			System.out.println("thursday");
		}
		else if(b == 6) {
			System.out.println("friday");
		}
		else if(b == 7) {
			System.out.println("saturday");
		}
		else{
			System.out.println("weekend");
		}
	
	}

}
