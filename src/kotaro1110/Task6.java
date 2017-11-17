package kotaro1110;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("plese input an any number");
		Scanner n =new Scanner(System.in);
		int a = n.nextInt();
		for(int i = 1; i <=10; i ++){
			int b =i*a;
			System.out.println(b);
		}
	}
}
