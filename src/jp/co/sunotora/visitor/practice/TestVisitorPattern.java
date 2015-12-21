package jp.co.sunotora.visitor.practice;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestVisitorPattern {

	@Ignore
	@Test
	public void testPrint01() throws Exception {
		Node node1 = new File("hoge", 100);

		Printer printer = new Printer();
		String actual = node1.accept(printer, "");
		String expected = "hoge(100)";

		assertThat(actual, is(expected));
	}

	@Test
	public void testPrint02() throws Exception {

		Node root = new Directory("root");
		Node path1 = new Directory("foo");
		Node path2 = new Directory("bar");
		Node path3 = new Directory("goo");

		Node file1 = new File("hoge", 100);
		Node file2 = new File("piyo", 200);
		Node file3 = new File("huga", 300);
		Node file4 = new File("hogehoge", 400);

		root.add(path1);
		root.add(path2);
		root.add(file1);

		path1.add(file4);

		path2.add(path3);
		path2.add(file2);

		path3.add(file3);

		Printer printer = new Printer();
		root.accept(printer, "");


//		assertThat(actual, is(expected));
	}


}
