import java.util.Scanner;

public class PigLatin {
	static boolean restarted = false;

	public static void main(String[] args) {
		String english;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Welcome to the Pig Latin Translator!");
			System.out.println("\nEnter a word to be translated:");
			verifyVowel(english = (input.next()));
			restarted = start("N");
		} while (restarted);
		input.close();
	}

	public static void verifyVowel(String english) {
		english = english.toLowerCase();
		if (english.charAt(0) == 'a' || english.charAt(0) == 'e' || english.charAt(0) == 'i' || english.charAt(0) == 'o'
				|| english.charAt(0) == 'u') {
			System.out.println(english + "way");
		} else {
			findVowel(english);
		}
	}

	public static void findVowel(String english) {
		int index = 0;

		while (english.charAt(index) != 'a' && english.charAt(index) != 'e' && english.charAt(index) != 'i'
				&& english.charAt(index) != 'o' && english.charAt(index) != 'u') {
			index++;
		}
		System.out.println(english.substring(index, english.length()) + english.substring(0, index) + "ay");
	}

	public static boolean start(String n) {
		System.out.println("Do you want to try again?(Y/N)");
		Scanner input = new Scanner(System.in);
		String restart = (input.nextLine());
		boolean result = false;
		input.close();
		if (restart.equalsIgnoreCase("Y")) {
			result = true;
		}
		
		return result;
	}
}
