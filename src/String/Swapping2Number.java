package String;

public class Swapping2Number {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		System.out.println("before swapping number.." +a+" "+b);
	
	/*logic1 using 3rd variable 
		int temp;
		temp=a;
		a=b;
		b=temp;*/
		
	/*logic2 without using 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;*/
	
	//logic3 using bitwise operator XOR
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swapping number.." +a+" "+b);	
	}

}
