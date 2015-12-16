package jp.co.sunotora.visitor.Node3;

import java.io.IOException;
import java.io.Writer;

public interface Node3 {
	int calc();

	void print(Writer out) throws IOException;
}
