package kotaro1116;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int count = 0;
		int userAns = 0;
		System.out.println("put into any number! between 1 to 100");
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int answer = r.nextInt(100);
		
		while(count < 10) {
		System.out.printf("%d> ", count + 1);
		userAns = s.nextInt();
		System.out.printf("\t%d ..... ", userAns);
		if (answer == userAns) {
			System.out.println("right！");
			break;
	        } 
		else if (answer < userAns) {
	        System.out.println("is bigger than answer");
	       	} 
		else {
	        System.out.println("is smaller than ansewr");
	        }
	       	count++;
	       }
		 if (answer != userAns) {
	            System.out.println("Game Over! The answer is " + answer + " !! ");
	        }
	    }
		
	}
