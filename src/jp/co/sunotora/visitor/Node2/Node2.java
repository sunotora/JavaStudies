package jp.co.sunotora.visitor.Node2;

import java.io.IOException;
import java.io.Writer;

public interface Node2 {
	int calc();

	void print(Writer out) throws IOException;
}
