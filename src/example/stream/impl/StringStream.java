package example.stream.impl;

import example.stream.Stream;

public class StringStream implements Stream {

	private char[] stream = null;
	private int lastIndex = 0;
	private int index = -1;

	public StringStream(String stream) {

		if (stream == null || "".equals(stream)) {
			throw new IllegalArgumentException("Stream cannot be null or empty");
		}

		this.stream = stream.toCharArray();
		this.lastIndex = this.stream.length - 1;
	}

	public char getNext() {
		return stream[++index];

	}

	public boolean hasNext() {
		return index < lastIndex;
	}

}
