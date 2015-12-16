package jp.co.sunotora.visitor.Node4;

import java.io.IOException;
import java.io.Writer;

public class NumNode4 implements Node4 {

	public final int value;

	public NumNode4(int value) {
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
