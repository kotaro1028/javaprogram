package kotaro1116;

public class Protect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile();
		m1.displayinfo();
		Mobile2 m2 = new Mobile2();
		m2.displayinformation();
	
	}

}

class Mobile{
	protected String companyname = "Samsung";
	protected String modelname = "Note 8";
	
	public void displayinfo() {
		System.out.println(this.companyname);
	}

}

class Mobile2 extends Mobile{
	
	public void displayinformation() {
		System.out.println(this.companyname);
	}
}
