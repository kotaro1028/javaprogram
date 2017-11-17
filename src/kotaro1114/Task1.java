package kotaro1114;

public class Task1 {

	public static void main(String[] args) {
	Intro aa = new Intro();
	aa.introduceOneself();
	}
}
class Intro{
	public void introduceOneself()
	{
		String name = "kotaro";
		int age = 22;
		double height = 170.000;
		char sex = 'm';
		System.out.println("私は " + name +"です。年齢は "+ age + "歳です。身長は、"+ height +"です。そんで、"+ sex +"です。");
	}
}
