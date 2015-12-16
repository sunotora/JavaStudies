package jp.co.sunotora.visitor.Node5;

import java.io.IOException;
import java.io.Writer;

public class Printer5 implements Visitor5 {

	private final Writer out;

	public Printer5(Writer out) {
		this.out = out;
	}

	@Override
	public int visit(NumNode5 node) {
		try {
			out.write(String.valueOf(node.value));
		} catch (IOException e) {

			throw new RuntimeException(e);
		}

		return 0;
	}

	@Override
	public int visit(AddNode5 node) {
        try {
            out.write("(");
            node.left.accept(this);
            out.write("+");
            node.right.accept(this);
            out.write(")");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
	}
}
