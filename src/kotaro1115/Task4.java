package kotaro1115;
import kotaro1116.Protect;

public class Task4 {
	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
	}
}
class Hero{
	public Hero() {
		System.out.println("aaaa");
	}
}
class SuperHero extends Hero{
	public SuperHero() {
		super();
		System.out.println("bbbbb");
	}
}
