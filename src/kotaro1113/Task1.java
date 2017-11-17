package kotaro1113;

public class Task1 {

	public static void main(String[] args) {
		
		Teacher1 te1 = new Teacher1(); 
		
		System.out.println();
		te1.printinfo();
		te1.printinfo1();
		


	}

}
class School1{
	String schoolname = "MISAO";
	String schooladd = "Gurgaon";
	String schoolowner = "Kota";
	String schoolprincipal = "Takeru";
}
class Student1 extends School1{
	String stname = "kotaro";
	String stadd = "Tokyo";
	String stphone = "1111";
	
	public void printinfo() {
		System.out.println(stname);
		System.out.println(stadd);
		System.out.println(stphone);
		System.out.println(schoolname);
		System.out.println(schooladd);
		System.out.println(schoolowner);
		System.out.println(schoolprincipal);
	}
}
class Teacher1 extends Student1{
	String tename = "Sonu";
	String teadd = "Delhi";
	String tephone = "2222";
	
	public void printinfo1() {
		System.out.println(tename);
		System.out.println(teadd);
		System.out.println(tephone);
		System.out.println(schoolname);
		System.out.println(schooladd);
		System.out.println(schoolowner);
		System.out.println(schoolprincipal);
	}
}
