package simple.interview.questions;

public class ReverseString {

	public static void main(String[] args) {
		String MyName = "Malith";
		String reversedStr ="";
		
		for(int i = MyName.length()-1;i>=0;i--) {
			
			reversedStr = reversedStr + MyName.charAt(i);
			// charAt (), It allows us to access individual characters in a string based on their index
		}
		System.out.println("Reverse " + reversedStr);

	}

}
