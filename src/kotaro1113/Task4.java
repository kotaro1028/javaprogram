package kotaro1113;

public class Task4 {
	public static void main(String[] args) {
		int[] num = {7,9,12,3,5,8,4};
		int temp = 0;
		for(int a = 0;a<=6;a++) {
			for(int b = a+1;b<=6;b++ )
				if(num[a]<num[b]) {
					temp=num[a];
					num[a]=num[b];
					num[b]=temp;
					
				}	
		}
		
		for(int c=0; c<=6; c++) {
			System.out.println(num[c]);
		}
//		System.out.println();
	}
}
