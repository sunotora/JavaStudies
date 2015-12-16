package jp.co.sunotora.visitor.Node6;

import java.io.IOException;
import java.io.Writer;

public class Printer6 implements Visitor6<Void, Writer> {

	@Override
	public Void visit(NumNode6 node, Writer parameter) {
		try {
			parameter.write(String.valueOf(node.value));
		} catch (IOException e) {

			throw new RuntimeException(e);
		}
		return null;
	}

	@Override
	public Void visit(AddNode6 node, Writer parameter) {
        try {
            parameter.write("(");
            node.left.accept(this, parameter);
            parameter.write("+");
            node.right.accept(this, parameter);
            parameter.write(")");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
	}

}
