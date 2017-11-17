package kotaro1110;

public class Task16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 1; a<=3; a ++){
			for(int b =2;b>=a;b --) {
			System.out.print(" ");
			}
			for(int c =a;c>=1;c --) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
