package kotaro1110;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("plese input two number and oprate like + - * / %");
		int	first = s.nextInt();
		int second = s.nextInt();
		char op = s.next().charAt(0);
		
		
		if(op == '+') {
			int c = first + second;
			System.out.println(c);
		}
		else if(op == '-') {
			int c =first - second;
			System.out.println(c);
		}
		else if(op == '*') {
			int c =first * second;
			System.out.println(c);
		}
		else if(op =='/') {
			int c =first / second;
			System.out.println(c);
		}
		else if(op == '%') {
			int c =first % second;
			System.out.println(c);
		}
		
			
	}

}
