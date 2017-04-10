package example;

import org.junit.Assert;
import org.junit.Test;

public class AlphabetTest {

	@Test
	public void aeiouAreVowel() {

		Assert.assertTrue(Alphabet.isVowel('A'));
		Assert.assertTrue(Alphabet.isVowel('E'));
		Assert.assertTrue(Alphabet.isVowel('I'));
		Assert.assertTrue(Alphabet.isVowel('O'));
		Assert.assertTrue(Alphabet.isVowel('U'));
		Assert.assertTrue(Alphabet.isVowel('a'));
		Assert.assertTrue(Alphabet.isVowel('e'));
		Assert.assertTrue(Alphabet.isVowel('i'));
		Assert.assertTrue(Alphabet.isVowel('o'));
		Assert.assertTrue(Alphabet.isVowel('u'));
	}

	@Test
	public void aeiouAreNotConsonants() {

		Assert.assertFalse(Alphabet.isConsonant('A'));
		Assert.assertFalse(Alphabet.isConsonant('E'));
		Assert.assertFalse(Alphabet.isConsonant('I'));
		Assert.assertFalse(Alphabet.isConsonant('O'));
		Assert.assertFalse(Alphabet.isConsonant('U'));
		Assert.assertFalse(Alphabet.isConsonant('a'));
		Assert.assertFalse(Alphabet.isConsonant('e'));
		Assert.assertFalse(Alphabet.isConsonant('i'));
		Assert.assertFalse(Alphabet.isConsonant('o'));
		Assert.assertFalse(Alphabet.isConsonant('u'));
	}

	@Test
	public void consonantsAreConsonants() {

		Assert.assertTrue(Alphabet.isConsonant('B'));
		Assert.assertTrue(Alphabet.isConsonant('b'));
		Assert.assertTrue(Alphabet.isConsonant('C'));
		Assert.assertTrue(Alphabet.isConsonant('c'));
		Assert.assertTrue(Alphabet.isConsonant('D'));
		Assert.assertTrue(Alphabet.isConsonant('d'));
		Assert.assertTrue(Alphabet.isConsonant('F'));
		Assert.assertTrue(Alphabet.isConsonant('f'));
		Assert.assertTrue(Alphabet.isConsonant('G'));
		Assert.assertTrue(Alphabet.isConsonant('g'));
		Assert.assertTrue(Alphabet.isConsonant('H'));
		Assert.assertTrue(Alphabet.isConsonant('h'));
		Assert.assertTrue(Alphabet.isConsonant('J'));
		Assert.assertTrue(Alphabet.isConsonant('j'));
		Assert.assertTrue(Alphabet.isConsonant('K'));
		Assert.assertTrue(Alphabet.isConsonant('k'));
		Assert.assertTrue(Alphabet.isConsonant('L'));
		Assert.assertTrue(Alphabet.isConsonant('l'));
		Assert.assertTrue(Alphabet.isConsonant('M'));
		Assert.assertTrue(Alphabet.isConsonant('m'));
		Assert.assertTrue(Alphabet.isConsonant('N'));
		Assert.assertTrue(Alphabet.isConsonant('n'));
		Assert.assertTrue(Alphabet.isConsonant('P'));
		Assert.assertTrue(Alphabet.isConsonant('p'));
		Assert.assertTrue(Alphabet.isConsonant('Q'));
		Assert.assertTrue(Alphabet.isConsonant('q'));
		Assert.assertTrue(Alphabet.isConsonant('R'));
		Assert.assertTrue(Alphabet.isConsonant('r'));
		Assert.assertTrue(Alphabet.isConsonant('S'));
		Assert.assertTrue(Alphabet.isConsonant('s'));
		Assert.assertTrue(Alphabet.isConsonant('T'));
		Assert.assertTrue(Alphabet.isConsonant('t'));
		Assert.assertTrue(Alphabet.isConsonant('V'));
		Assert.assertTrue(Alphabet.isConsonant('v'));
		Assert.assertTrue(Alphabet.isConsonant('W'));
		Assert.assertTrue(Alphabet.isConsonant('w'));
		Assert.assertTrue(Alphabet.isConsonant('X'));
		Assert.assertTrue(Alphabet.isConsonant('x'));
		Assert.assertTrue(Alphabet.isConsonant('Y'));
		Assert.assertTrue(Alphabet.isConsonant('y'));
		Assert.assertTrue(Alphabet.isConsonant('Z'));
		Assert.assertTrue(Alphabet.isConsonant('z'));
	}

	@Test
	public void consonantsAreNotVowels() {

		Assert.assertFalse(Alphabet.isVowel('B'));
		Assert.assertFalse(Alphabet.isVowel('b'));
		Assert.assertFalse(Alphabet.isVowel('C'));
		Assert.assertFalse(Alphabet.isVowel('c'));
		Assert.assertFalse(Alphabet.isVowel('D'));
		Assert.assertFalse(Alphabet.isVowel('d'));
		Assert.assertFalse(Alphabet.isVowel('F'));
		Assert.assertFalse(Alphabet.isVowel('f'));
		Assert.assertFalse(Alphabet.isVowel('G'));
		Assert.assertFalse(Alphabet.isVowel('g'));
		Assert.assertFalse(Alphabet.isVowel('H'));
		Assert.assertFalse(Alphabet.isVowel('h'));
		Assert.assertFalse(Alphabet.isVowel('J'));
		Assert.assertFalse(Alphabet.isVowel('j'));
		Assert.assertFalse(Alphabet.isVowel('K'));
		Assert.assertFalse(Alphabet.isVowel('k'));
		Assert.assertFalse(Alphabet.isVowel('L'));
		Assert.assertFalse(Alphabet.isVowel('l'));
		Assert.assertFalse(Alphabet.isVowel('M'));
		Assert.assertFalse(Alphabet.isVowel('m'));
		Assert.assertFalse(Alphabet.isVowel('N'));
		Assert.assertFalse(Alphabet.isVowel('n'));
		Assert.assertFalse(Alphabet.isVowel('P'));
		Assert.assertFalse(Alphabet.isVowel('p'));
		Assert.assertFalse(Alphabet.isVowel('Q'));
		Assert.assertFalse(Alphabet.isVowel('q'));
		Assert.assertFalse(Alphabet.isVowel('R'));
		Assert.assertFalse(Alphabet.isVowel('r'));
		Assert.assertFalse(Alphabet.isVowel('S'));
		Assert.assertFalse(Alphabet.isVowel('s'));
		Assert.assertFalse(Alphabet.isVowel('T'));
		Assert.assertFalse(Alphabet.isVowel('t'));
		Assert.assertFalse(Alphabet.isVowel('V'));
		Assert.assertFalse(Alphabet.isVowel('v'));
		Assert.assertFalse(Alphabet.isVowel('W'));
		Assert.assertFalse(Alphabet.isVowel('w'));
		Assert.assertFalse(Alphabet.isVowel('X'));
		Assert.assertFalse(Alphabet.isVowel('x'));
		Assert.assertFalse(Alphabet.isVowel('Y'));
		Assert.assertFalse(Alphabet.isVowel('y'));
		Assert.assertFalse(Alphabet.isVowel('Z'));
		Assert.assertFalse(Alphabet.isVowel('z'));
	}

	@Test
	public void nilIsConsonant() {

		Assert.assertFalse(Alphabet.isConsonant(Character.MIN_VALUE));
	}

}
