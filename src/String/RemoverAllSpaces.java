package String;

public class RemoverAllSpaces {

	public static void main(String[] args) {
		
		String str = "j  a  v  a";
		String str1=  str.replaceAll("\\s","");
		System.out.println(str1);
	}

}
