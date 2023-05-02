package String;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Rambabu";
		/*for(int i=str.length()-1; i>0; i--) {
			 System.out.print(str.charAt(i));
		}
		*/
		  char ch[] =str.toCharArray();
		  for(int i=ch.length-1; i>0; i--) {
			  System.out.print(ch[i]);
			  
		  }

	}

}
