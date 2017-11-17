package kotaro1116;

public class Kotaro1 {
	public static void main(String[] args) {
		A a = new A(7);
		a.printnumber();
	}
}
class A {
	int number;
	A(){
		System.out.println("null constructor");
	}
	A(int n){
		number = n;
	}
	
	public void printnumber() {
		System.out.println(number);
		
	}

	
}
