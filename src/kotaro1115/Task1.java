package kotaro1115;

import java.util.Scanner;

import kotaro1114.Task3;
import kotaro1113.Creatclass;
import kotaro1113.Task2constracta;



public class Task1  {
	public static void main(String[] args) { 
		Task3 dd =new Task3();
		Creatclass av = new Creatclass();
		Task2constracta b = new Task2constracta();
		Scanner s = new Scanner(System.in);
		int	first = s.nextInt();
		int second = s.nextInt();
		Calculate result = new User2();
		int d = result.add(first,second);
		int e = result.subtract(first,second);
		int f = result.multiply(first,second);
		int g = result.devide(first,second);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}
}
interface Calculate{
	public static int a = 10;
	
	public int add(int a, int b);
	
	 public int subtract(int a, int b);
	
	 public int multiply(int a, int b);
	
	 public int devide(int a, int b);

}

interface  A{
	
}

interface  B{
	
}
class User1 implements Calculate  {

	@Override
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	@Override
	public int subtract(int a, int b) {
		int c = a - b;
		return c;
	}

	@Override
	public int multiply(int a, int b) {
		int c = a * b;
		return c;
	}

	@Override
	public int devide(int a, int b) {
		int c = a / b;
		return c;
	}
	
	public void hello(){ 
		System.out.println("hello");
	}
	public void profile(){ 
		System.out.println("tokyo my card's id is 1234567");
	}
	
}
class User2 implements Calculate{

	@Override
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	@Override
	public int subtract(int a, int b) {
		int c = a + b;
		return c;
	}

	@Override
	public int multiply(int a, int b) {
		int c = a * b;
		return c;
	}

	@Override
	public int devide(int a, int b) {
		int c = a / b;
		return c;
	}
	public void hello(){ 
		System.out.println("hello");
	}
	public void profile(){ 
		System.out.println("tokyo my card's id is 87667");
		
	}
}


