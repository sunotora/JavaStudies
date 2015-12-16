package jp.co.sunotora.visitor.Node4;

import java.io.IOException;
import java.io.Writer;

public class AddNode4 implements Node4 {

	public final Node4 left;
	public final Node4 right;

	public AddNode4(Node4 left, Node4 right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int calc() {
		return left.calc() + right.calc();
	}

	@Override
	public void print(Writer out) throws IOException {
		out.write("(");
		left.print(out);
		out.write("+");
		right.print(out);
		out.write(")");
	}

}
