package kotaro1116;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teach t = new Teach();
		t.print();

	}

}

class Stu {
	 static int a = 10;
	 void print() {
		System.out.println(a);
	}
}

class Teach extends Stu{
	int a = 20;
	
	void print() {
		super.print();
		System.out.println(a);
	}
}