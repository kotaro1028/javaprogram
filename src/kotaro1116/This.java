package kotaro1116;

public class This {
	public static void main(String[] args) {
		
		new Abhi("Abhi");
	}
}


class Abhi{
	
	private void method(){
		System.out.println("hello!!!!");
	}
	Abhi(){
		System.out.println("hello");
		
	}
	
	Abhi(String s){
		this();
		this.method();
		System.out.println("Hi "+ s );
	}
	
}

