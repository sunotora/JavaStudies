package jp.co.sunotora.visitor.Node3;

import java.io.IOException;
import java.io.Writer;

public class NumNode3 implements Node3 {

	public final int value;

	public NumNode3(int value) {
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
