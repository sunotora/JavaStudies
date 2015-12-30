package jp.co.sunotora.typesafeTest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import jp.co.sunotora.typesafeTest.enums.ProcessEnumsBlackArts01;
import jp.co.sunotora.typesafeTest.vo.TestVo01;
import jp.co.sunotora.typesafeTest.vo.TestVo02;
import jp.co.sunotora.typesafeTest.vo.TestVo03;

import org.junit.Test;

public class InvokerBlackArts01Test {

	public static void main(String[] args) {
		TestVo01 vo = InvokerBlackArts01.Invoke(ProcessEnumsBlackArts01.PROCESS01);

		System.out.println(vo.getHoge());
		System.out.println(vo.getPiyo());
		System.out.println(vo.getHuga());

	}

	@Test
	public void InvokerTest01() {

		TestVo01 vo = InvokerBlackArts01.Invoke(ProcessEnumsBlackArts01.PROCESS01);

		assertThat(vo.getHoge(), is("aaa"));
		assertThat(vo.getPiyo(), is("bbb"));
		assertThat(vo.getHuga(), is("ccc"));
	}

	@Test
	public void InvokerTest02() {

		TestVo02 vo = InvokerBlackArts01.Invoke(ProcessEnumsBlackArts01.PROCESS02);

		assertThat(vo.getId(), is("20"));
		assertThat(vo.getName(), is("Bob"));
	}

	@Test
	public void InvokerTest03() {

		TestVo03 vo = InvokerBlackArts01.Invoke(ProcessEnumsBlackArts01.PROCESS03);

		assertThat(vo.getFoo(), is("netai"));
		assertThat(vo.getBar(), is("nemui"));
	}
}
