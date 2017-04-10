package example;

import example.stream.Stream;

public class FirstVowelAfterFirstConsonantWithAncestorVowel {

	/**
	 * 
	 * @param a {@link Stream}
	 * @return stream The first char after the first consonant preceded by a vowel.
	 */
	public static char firstChar(Stream stream) {

		char theVowel = 0;
		char current = 0;
		char previous = 0;
		char ancestor = 0;
		int[] foundChars = new int[123];

		while (stream.hasNext()) {
			current = stream.getNext();
			foundChars[current]++;

			boolean isVowel = Alphabet.isVowel(current);
			boolean isPreviousConsonant = false;
			boolean hasVowelBefore = false;
			boolean hasConsonantBefore = false;
			boolean isAncestorVowel = false;
			
			if (isVowel) {
				isPreviousConsonant = Alphabet.isConsonant(previous);

				if (isPreviousConsonant) {
					hasVowelBefore = hasBefore(current, foundChars);
					hasConsonantBefore = hasBefore(previous, foundChars);

					if (hasVowelBefore == false && hasConsonantBefore == false) {
						isAncestorVowel = Alphabet.isVowel(ancestor);

						if (isAncestorVowel) {
							theVowel = current;
							break;
						}
					}
				}
			}

			ancestor = previous;
			previous = current;

		}

		return theVowel;
	}

	private static boolean hasBefore(char previous, int[] counter) {
		return counter[previous] > 1;
	}

}
