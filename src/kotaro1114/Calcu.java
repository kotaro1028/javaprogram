package kotaro1114;

import java.util.Scanner;

public class Calcu {
	public static void main(String[] ars) {
		Scanner s = new Scanner(System.in);
		int	first = s.nextInt();
		int second = s.nextInt();
		int third = s.nextInt();
		C result = new C();
//		int[] a = {1,4,7,9,2,56,78};
//		int[] a1 = {1,54,79,99,20,56,278,6678,8,9,6};
//		String[] b = {"aa","bb","cc","dd"};
//		result.printArray(a);
//		result.printArray(a1);
//		result.printArray(b);
//		result.add(first,second,third);
		int d = result.subtract(first,second);
		result.multiply(first,second);
		int e = result.devide(first,second);
		System.out.println(d);
		System.out.println(e);
		
	}
}
class C{
	
//	public void printArray(int[] aa) {
//		for(int c = 0; c<aa.length; c++) {
//			System.out.println(aa[c]);
//		}
//	}
//	
//	public void printArray(String[] aa) {
//		for(int c = 0; c<aa.length; c++) {
//			System.out.println(aa[c]);
//		}
//	}
	public void add(int a, int b) 
	{
		
		int c = a + b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int d) {
		int c = a + b +d;
		System.out.println(c);
	}
	
	
	
	public int subtract(int a, int b) {
		
		int c = a-b;
		return c;
	}
	public void multiply(int a, int b) 
	{
		
		int c = a*b;
		System.out.println(c);
	}
	public int devide(int a, int b) {
		
		int c = a/b;
		return c;
	}
}

