package kotaro1113;

public class Task2constracta {
	public static void main(String[] args) {
		
//		int[] a = {1,2,3,4};
//		String[] b = {}
//		System.out.println(a[3]);
//		
	Student2 st2 = new Student2("kotaro","2111","tokyo","it");
	Student2 st3 = new Student2("hdfhd","hjdf","hfjds","hfh");
	st2.printinfo3();
	st3.printinfo3();
	

	}
 
}
class Student2 {
	String name ;
	String phonenumber ;
	String city ;
	String subject ;
	
	public Student2(String n, String p, String c, String s) {
		name = n;
		phonenumber = p;
		city = c;
		subject = s;
	}
	
	public void printinfo3() {
		System.out.println(name);
		System.out.println(phonenumber);
		System.out.println(city);
		System.out.println(subject);
		System.out.println(" ");
	}
}
