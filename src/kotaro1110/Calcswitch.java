package kotaro1110;

import java.util.Scanner;

public class Calcswitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("plese input two number and oprate like + - * / %");
		int	first = s.nextInt();
		int second = s.nextInt();
		char op = s.next().charAt(0);
		switch(op)
		{
		case '+': System.out.println(first + second);break;
		case '-': System.out.println(first - second);break;
		case '*': System.out.println(first * second);break;
		case '/': System.out.println(first / second);break;
		default : System.out.println(first % second);
		}
	}
	
}
