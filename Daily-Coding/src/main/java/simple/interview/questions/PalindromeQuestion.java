package simple.interview.questions;

public class PalindromeQuestion {

	static boolean isPalindrome(String str) {
		{
			int a = 0, b = str.length() - 1;

			while (a < b) {

				if (str.charAt(a) != str.charAt(b))
					return false;
				a++;
				b--;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "car";

		str = str.toLowerCase();

		if (isPalindrome(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
