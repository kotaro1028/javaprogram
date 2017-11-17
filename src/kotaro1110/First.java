package kotaro1110;

import java.util.Scanner;

public class First {
	public static void main (String[] fff) {
		System.out.println("plese wirte your age");
		Scanner aaa = new Scanner(System.in);
		int a = aaa.nextInt();
//		String b = aaa.next(); 
//		System.out.println(a);
//		System.out.println(b);
		if (a <18) {
			System.out.print("you can't get driver license");
		}else {
			System.out.print("you can get driver license");
		}
	}

}
