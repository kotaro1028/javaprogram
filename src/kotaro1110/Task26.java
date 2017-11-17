package kotaro1110;

public class Task26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int y=1; y<=4; y++) {
		for(int a= 4;a>=y;a--) {
		System.out.print('*');
		}
		for(int b= 1;b<y ;b++) {
		System.out.print(' ');
		}
		for(int c= 1;c<y-1 ;c++) {
			System.out.print(' ');
			}
		for(int d=4;d>=y && d>1;d--) {
			System.out.print('*');
		}
		
		System.out.println();
		}
		for(int z=5; z<=7; z++) {
		for(int e= 3;e<z;e++) {
			System.out.print('*');
			}
		for(int f= 7;f>z;f--) {
			System.out.print(' ');
			}
		for(int g= 6; g>z ;g--) {
				System.out.print(' ');
				}
		for(int h=3;h<z && h<=5;h++) {
				System.out.print('*');
			}
			System.out.println();
		}
		}
	
}

