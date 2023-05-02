package String;

public class FibonacciSeries {
   // 0 1 2 3 4  5 6 7  8 9 10
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		System.out.println(n1+" "+n2);
        for(int i=0; i<10; i++) {
        	n3=n1+n2;
        	System.out.print(" "+n3);
        	n1=n2;
        	n2=n3;
        }
	}

}
