package jp.co.sunotora.typesafeTest.enums;

import java.io.StringWriter;

import javax.xml.bind.JAXB;

import jp.co.sunotora.typesafeTest.vo.TestVo01;
import jp.co.sunotora.typesafeTest.vo.TestVo02;
import jp.co.sunotora.typesafeTest.vo.TestVo03;

// Xml作成用
public class XmlCreater {

	public static void main(String[] args) {

		TestVo01 vo = new TestVo01();
		vo.setHoge("aaa");
		vo.setPiyo("bbb");
		vo.setHuga("ccc");

		StringWriter sw = new StringWriter();
		JAXB.marshal(vo, sw);
		System.out.println(sw.toString());

		TestVo02 vo2 = new TestVo02();
		vo2.setId("20");
		vo2.setName("bob");

		JAXB.marshal(vo2, sw);
		System.out.println(sw.toString());

		TestVo03 vo3 = new TestVo03();
		vo3.setFoo("nemui");
		vo3.setBar("netai");

		JAXB.marshal(vo3, sw);
		System.out.println(sw.toString());
	}
}
