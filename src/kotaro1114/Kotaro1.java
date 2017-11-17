package kotaro1114;

public class Kotaro1 {
	public static void main(String[] args) {
		Calculator result = new Calculator();
		result.add(10,12);
		result.add(23, 78);
		result.add(100, 200);
		int d = result.subtract(10,4);
		int e = result.subtract(50,20);
		System.out.println(d);
		System.out.println(e);
	}
}

class Calculator{
	public void add(int a, int b) 
	{
		
		int c = a + b;
		System.out.println(c);
	}
	
	public int subtract(int a, int b) {
		
		int c = a-b;
		return c;
	}
}
