package jp.co.sunotora.visitor.Node6;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.StringWriter;

import org.junit.Test;

public class Node6Test {

	@Test
	public void testCalc() throws Exception {
		Node6 node1 = new NumNode6(2);
		Node6 node2 = new NumNode6(3);
		Node6 node3 = new AddNode6(node1, node2);
		Node6 node4 = new NumNode6(6);
		Node6 node6 = new AddNode6(node3, node4);

		Calc6 calc = new Calc6();

		//Void → nullでいいらしい
//		int actual = node6.<Integer, Void>accept(calc, null);
		int actual = node6.accept(calc, null);
		int expected = 2 + 3 + 6;

		assertThat(actual, is(expected));
	}

	@Test
	public void testPrint() throws Exception {
		Node6 node1 = new NumNode6(2);
		Node6 node2 = new NumNode6(3);
		Node6 node3 = new AddNode6(node1, node2);
		Node6 node4 = new NumNode6(6);
		Node6 node6 = new AddNode6(node3, node4);

		StringWriter out = new StringWriter();
		Printer6 printer = new Printer6();
//		node6.<Void, Writer>accept(printer, out);
		node6.accept(printer, out);
		String actual = out.toString();
		String expected = "((2+3)+6)";

		assertThat(actual, is(expected));
	}
}
