package kotaro1110;

public class Task24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 4; a>=1; a --){
			for(int b =3;b>=a;b --) {
			System.out.print(" ");
			}
			for(int c =1;c<=a;c++) {
				System.out.print(c);
				}
			for(int d =a-1;d>=1;d--) {
				System.out.print(d);
				}
//			for(int e =3;e>a;e--) {
//				System.out.print(" ");
//				}
			System.out.println();
		}
	}
}
