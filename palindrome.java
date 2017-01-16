import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String word;
		System.out.print("Please enter word: ");
		word = in.next();
		System.out.println(check(word, reverse(word)));
		in.close();
	}

	public static String reverse(String a) {
		String reverse = "";
		for (int i = (a.length() - 1); i >= 0; i--) {
			reverse += a.charAt(i);
		}
		return reverse;
	}

	public static String check(String a, String b) {
		for (int i = 0; i < (a.length() / 2);) {
			if (!(a.charAt(i) == b.charAt(i)))
				return a + " is not a palindrome";
			break;
		}
		return a + " is a palindrome";
	}
}