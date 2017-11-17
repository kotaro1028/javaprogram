package kotaro1115;

public class Task2 {
	public static void main(String[] args) {
		Bank ba = new UfJ();
		ba.interest();
//		ba.hello();
	}
}
abstract class Bank{
	abstract public void interest();
}
class UfJ extends Bank{

	@Override
	public void interest() {
		System.out.println(7.4);
		
	}
	public void hello() {
		System.out.println("hello");
	}
	
}
class MIZOHO extends Bank{

	@Override
	public void interest() {
		System.out.println(2.4);
		
	}
	public void hello() {
		System.out.println("hello");
	}
	
}
class SUMITOMO extends Bank{

	@Override
	public void interest() {
		System.out.println(3.4);
		
	}
	public void hello() {
		System.out.println("hello");
	}
	
}
