package String;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number:" + " ");
		int num=scan.nextInt();
		/* logic1  
		  int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		*/
		
		/*
		 logic2 using stringbuffer
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse Number is :"+ rev);
		*/
		
		/*logic 3 by using stringbuilder
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		System.out.println("Reverse number is :" + rev);
		*/
	}


	
}
