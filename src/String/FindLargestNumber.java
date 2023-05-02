package String;

import java.util.Scanner;

public class FindLargestNumber {
     public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a first number");
		int a = scan.nextInt();
		System.out.println("Enter a second number");
		int b = scan.nextInt();
		System.out.println("Enter a third number");
		int c = scan.nextInt();
		
		if(a>b&&a>c) {
			System.out.println("A is largest number");
		}
		else if(b>c&&b>a) {
			System.out.println("b is largest number");
			
		}
		else  {
			System.out.println("c is largest nnumber");
		}
	}
}
