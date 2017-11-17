package kotaro1114;

public class Task3 {
	public static void main(String[] args) {
		Cat aa = new Cat();
		aa.Name="たま";
		aa.Age= 2;
		aa.ShowProfile();
		aa.sleep();
		aa.Speak();
		Dog gg = new Dog();
		gg.Name="ぽち";
		gg.Age= 4;
		gg.ShowProfile();
		gg.run();
		gg.Speak();
		
	}
}
class Animal
{
    public String Name;
    public int Age;

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }
    public void Speak()
    {
        System.out.println( "...." );
    }
}
class Cat extends Animal{
	public void sleep(){
		System.out.println("スースー");
	}
	 public void Speak()
	    {
	        System.out.println( "ニャーニャー" );
	    }
}
class Dog extends Animal{
	public void run() {
		System.out.println("トコトコ");
	}
	 public void Speak()
	    {
	        System.out.println( "ワンワン" );
	    }
}
