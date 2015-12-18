package jp.co.sunotora.visitor.Node7;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.StringWriter;

import org.junit.Test;

public class Node7Test {

	@Test
	public void testCalc() throws Exception {
		Node7 node1 = new NumNode7(2);
		Node7 node2 = new NumNode7(3);
		Node7 node3 = new AddNode7(node1, node2);
		Node7 node4 = new NumNode7(7);
		Node7 node5 = new AddNode7(node3, node4);

		Calc7 calc = new Calc7();

		int actual = node5.accept(calc, null);
		int expected = 2 + 3 + 7;

		assertThat(actual, is(expected));
	}

	@Test
	public void testPrint() throws Exception {
		Node7 node1 = new NumNode7(2);
		Node7 node2 = new NumNode7(3);
		Node7 node3 = new AddNode7(node1, node2);
		Node7 node4 = new NumNode7(7);
		Node7 node7 = new AddNode7(node3, node4);

		StringWriter out = new StringWriter();
		Printer7 printer = new Printer7();
		node7.accept(printer, out);
		String actual = out.toString();
		String expected = "((2+3)+7)";

		assertThat(actual, is(expected));
	}
}
