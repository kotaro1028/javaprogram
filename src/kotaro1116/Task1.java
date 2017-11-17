package kotaro1116;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String	name = s.next();
		int phonenumber =s.nextInt();
		int password = s.nextInt();
		String city = s.next();
		Print p = new Print(name,phonenumber,password,city);
		p.printout();
	}
	
}
class Print{
	String	name  ;
	int phonenumber ;
	int password ;
	String city ;
	
	Print(){
		
	}
	
	Print(String name,int phonenumber, int password, String city){
		this.name = name;
		this.phonenumber = phonenumber;
		this.password = password;
		this.city = city;
	}
	public void printout() {
		System.out.println(name+", "+phonenumber+", "+password+" , "+city);
		
		this.display();
		
	}
	
	public void display() {
		System.out.println("this is display function");
	}
}