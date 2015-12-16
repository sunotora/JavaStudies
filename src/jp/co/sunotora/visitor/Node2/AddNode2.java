package jp.co.sunotora.visitor.Node2;

import java.io.IOException;
import java.io.Writer;

public class AddNode2 implements Node2 {

	public final Node2 left;
	public final Node2 right;

	public AddNode2(Node2 left, Node2 right) {
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
