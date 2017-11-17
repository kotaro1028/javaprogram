package kotaro1113;

public class Creatclass {
	public static void main(String[] args) {
		Student st1 = new Student(); 
		Teacher st2 = new Teacher(); 
		st1.printinfo();
		System.out.println(st2.schoolname);
		
	}
}

class School{
	 String schoolname = "MISAO";
	 String schooladdress = "guraon";
}

 class Student extends School{
	String name = "kotaro";
	String phonenm = "111";
	String subject = "ME";
	
	public void printinfo() {
		System.out.println(name);
		System.out.println(phonenm);
		System.out.println(subject);
		System.out.println(schoolname);
	}
	
}
 
 class Teacher extends School{
	 String name = "sonu";
	 String phonenm = "121";
	 String subject = "IT";
 }
