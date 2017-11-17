package kotaro1114;

public class Kotaro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		B bb = new B();
		aa.print();
		bb.print();
	}

}
class A{
	public void print(){
		System.out.println("Hello");
	}
}
class B extends A{
	public void print(){
		System.out.println("Bye");
	}
}