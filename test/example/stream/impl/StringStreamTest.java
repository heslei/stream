package example.stream.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import example.stream.Stream;

public class StringStreamTest {

	@Test
	public void iterateAnOneCharStringStreamResultingEachValue() {

		char values[] = { 'a' };
		Stream stream = new StringStream(new String(values));

		assertTrue(stream.hasNext());
		assertEquals(values[0], stream.getNext());
		assertFalse(stream.hasNext());
	}

	@Test
	public void iterateTwoStringCharStreamResultingEachValue() {

		char values[] = { 'a', 'b' };
		Stream stream = new StringStream(new String(values));

		assertTrue(stream.hasNext());
		assertEquals(values[0], stream.getNext());
		assertEquals(values[1], stream.getNext());
		assertFalse(stream.hasNext());
	}

	@Test
	public void iterateTenCharStringStreamResultingEachValue() {

		char values[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
		Stream stream = new StringStream(new String(values));

		assertTrue(stream.hasNext());
		assertEquals(values[0], stream.getNext());
		assertEquals(values[1], stream.getNext());
		assertEquals(values[2], stream.getNext());
		assertEquals(values[3], stream.getNext());
		assertEquals(values[4], stream.getNext());
		assertEquals(values[5], stream.getNext());
		assertEquals(values[6], stream.getNext());
		assertEquals(values[7], stream.getNext());
		assertEquals(values[8], stream.getNext());
		assertEquals(values[9], stream.getNext());
		assertFalse(stream.hasNext());
	}

	@Test(expected = IllegalArgumentException.class)
	public void iterateNullStringStreamResultingEachValue() {

		new StringStream(null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void iterateEmptyStringStreamResultingEachValue() {

		new StringStream(null);

	}

}
