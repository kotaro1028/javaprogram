package kotaro1115;

public class Kotaro1 {
 public static void main(String[] args) {
	 Message me = new Nomal();
	 me.send();
//	 me.hello();
 }
}
abstract class Message{
//	Message(){
//		System.out.println("message constructor");
//	}
	abstract public void send();
}

class Nomal extends Message{

	public void owner() {
		System.out.println("hello world in normal class");
	}

	@Override
	public void send() {
		System.out.println("Normal class message");
		
	}
	
}

class Nomal2 extends Message{
	Nomal2(){
		System.out.println("Normal2 constructor");
	}

	@Override
	public void send() {
		System.out.println("Normal2 class message");
		
	}
	
}