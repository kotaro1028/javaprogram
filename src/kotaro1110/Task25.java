package kotaro1110;

public class Task25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int x =1; x<=4;x ++) {
			for(int b =3;b>=x;b --) {
			System.out.print(" ");
			}
			for(int c =1;c<=x && c<=4;c++) {
			System.out.print(c);
			}
			for(int d =x-1;d>0;d--) {
			System.out.print(d);
			}
//			for(int e =3;e>a;e--) {
//				System.out.print(" ");
//				}
			System.out.println();
			}
			for(int y=3; y>=1; y--) {
			for(int f =3;f>=y;f --) {
			System.out.print(" ");
			}
			for(int g =1;g<=y ;g++) {
			System.out.print(g);
			}
			for(int h =y-1;h>=1;h--) {
			System.out.print(h);
			}
			System.out.println();
			}
		}
	
}
