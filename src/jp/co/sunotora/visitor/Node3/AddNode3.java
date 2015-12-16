package jp.co.sunotora.visitor.Node3;

import java.io.IOException;
import java.io.Writer;

public class AddNode3 implements Node3 {

	public final Node3 left;
	public final Node3 right;

	public AddNode3(Node3 left, Node3 right) {
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
