package String;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String str = "@!$%j*&a@v!$a";
		String str1 =str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str1);

	}

}
