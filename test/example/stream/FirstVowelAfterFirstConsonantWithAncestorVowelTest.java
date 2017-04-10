package example.stream;

import static org.junit.Assert.*;
import org.junit.Test;

import example.FirstVowelAfterFirstConsonantWithAncestorVowel;
import example.stream.impl.StringStream;

public class FirstVowelAfterFirstConsonantWithAncestorVowelTest {

	@Test
	public void given_ABA_return_nil() {

		Stream stringStream = new StringStream("ABA");
		char firstChar = FirstVowelAfterFirstConsonantWithAncestorVowel.firstChar(stringStream);
		assertEquals(0, firstChar);
	}
	
	@Test
	public void given_AEABI_return_I() {

		Stream stringStream = new StringStream("AEABI");
		char firstChar = FirstVowelAfterFirstConsonantWithAncestorVowel.firstChar(stringStream);
		assertEquals('I', firstChar);
	}
	
	@Test
	public void given_AEABIF_return_I() {

		Stream stringStream = new StringStream("AEABIF");
		char firstChar = FirstVowelAfterFirstConsonantWithAncestorVowel.firstChar(stringStream);
		assertEquals('I', firstChar);
	}
	
	@Test
	public void given_fafe_return_nil() {

		Stream stringStream = new StringStream("fafe");
		char firstChar = FirstVowelAfterFirstConsonantWithAncestorVowel.firstChar(stringStream);
		assertEquals(0, firstChar);
	}
	
	@Test
	public void given_cafe_return_e() {

		Stream stringStream = new StringStream("cafe");
		char firstChar = FirstVowelAfterFirstConsonantWithAncestorVowel.firstChar(stringStream);
		assertEquals('e', firstChar);
	}
	
	@Test
	public void given_cacafe_return_e() {

		Stream stringStream = new StringStream("cacafe");
		char firstChar = FirstVowelAfterFirstConsonantWithAncestorVowel.firstChar(stringStream);
		assertEquals('e', firstChar);
	}
	
	@Test
	public void given_aAbBABacafe_return_e() {

		Stream stringStream = new StringStream("aAbBABacafe");
		char firstChar = FirstVowelAfterFirstConsonantWithAncestorVowel.firstChar(stringStream);
		assertEquals('e', firstChar);
	}
	
	@Test
	public void given_aAbBABacafe_return_nil() {

		Stream stringStream = new StringStream("aAbBAfacafe");
		char firstChar = FirstVowelAfterFirstConsonantWithAncestorVowel.firstChar(stringStream);
		assertEquals(0, firstChar);
	}
	
}
