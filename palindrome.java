import java.util.Scanner;

public class palindrome2 {
	public static void main(String args[]) {
		// Initialises scanner for input and a string variable for input
		Scanner in = new Scanner(System.in);
		String word;

		// Prints statement requesting user input then allows user input
		System.out.print("Please enter word: ");
		word = in.next(); // Allows user input

		// Prints out return statement check method after reversing user input
		// and checking if it is a palindrome
		System.out.println(check(word));

		// Closes scanner input
		in.close();
	}

	public static String check(String a) {
		// Initialises integer variable for length of word
		int len = a.length();

		// For loop is set up to go through each character of the word from the
		// start and compares the character at same position from the end of the
		// word
		for (int i = 0; i < (a.length() / 2); i++) {
			// If statement checks if the statement of two characters equals each other is false
			if (a.charAt(i) != a.charAt(len - 1 - i)){
				// Returns a '[word] is not a palindrome' statement if neither character are the same
				return a + " is not a palindrome";
			}
		}

		// If there no problems arise in the for loop, a '[word] is a palindrome' statement is returned
		return a + " is a palindrome";
	}
}
