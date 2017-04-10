package example;

public class Alphabet {

	public static boolean isVowel(char character) {

		switch (character) {
		case 97:
		case 101:
		case 105:
		case 111:
		case 117:
		case 65:
		case 69:
		case 73:
		case 79:
		case 85:
			return true;
		default:
			return false;
		}
	}

	public static boolean isConsonant(char character) {
		boolean isConsonant = false;
		
		if (Alphabet.isVowel(character)) {
			return false;
		} else if (character >= 65 && character <= 90 || character >= 97 && character <= 122) {
			isConsonant = true;
		}

		return isConsonant;
	}
}
