package kotaro1116;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentnew st1 = new Studentnew("kotaro",12,"tokyo");
		Studentnew st2 = new Studentnew("taiki",23,"tokyo",2000);
		Studentnew st3 = new Studentnew("taiki",23,"tokyo",2000,556);
		st1.studentdisplay();
		st3.studentdisplay();
	}

}

class Studentnew{
	String name;
	int rollno;
	String city;
	int fees;
	int id;
	
	Studentnew(String name, int rollno, String city){
		this.name = name;
		this.rollno = rollno;
		this.city = city;
	}
	
	Studentnew(String name, int rollno, String city, int fees){
		this(name,rollno,city);
		this.fees = fees;
	}
	Studentnew(String name, int rollno, String city, int fees, int id){
		this(name,rollno,city,fees);
		this.id = id;
	}
	
	
	public void studentdisplay() {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(city);
		System.out.println(fees);
		System.out.println(id);
	}
	
	
}
