package jp.co.sunotora.visitor.Node7;

import java.io.IOException;
import java.io.Writer;

public class Printer7 implements Visitor7<Void, Writer, IOException> {

	@Override
	public Void visit(NumNode7 node, Writer parameter) throws IOException {
		parameter.write(String.valueOf(node.value));
		return null;
	}

	@Override
	public Void visit(AddNode7 node, Writer parameter) throws IOException {
		parameter.write("(");
		node.left.accept(this, parameter);
		parameter.write("+");
		node.right.accept(this, parameter);
		parameter.write(")");
		return null;
	}
}
