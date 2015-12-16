package jp.co.sunotora.visitor.Node2;

import java.io.IOException;
import java.io.Writer;

public class NumNode2 implements Node2 {

	public final int value;

	public NumNode2(int value) {
		this.value = value;
	}

	@Override
	public int calc() {
		return value;
	}

	@Override
	public void print(Writer out) throws IOException {
		out.write(String.valueOf(value));
	}
}
