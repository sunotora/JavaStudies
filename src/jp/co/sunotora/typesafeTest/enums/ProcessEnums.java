package jp.co.sunotora.typesafeTest.enums;

import jp.co.sunotora.typesafeTest.vo.TestVo01;
import jp.co.sunotora.typesafeTest.vo.TestVo02;
import jp.co.sunotora.typesafeTest.vo.TestVo03;
import jp.co.sunotora.typesafeTest.vo.ValueObjectMarker;

public class ProcessEnums <T extends ValueObjectMarker> {

	// typesafe-enum パターン
	// JAXBのunmarshalでclassが欲しいのだが引数として渡してやるしかない？
	public static final ProcessEnums<TestVo01> PROCESS01 = new ProcessEnums<>(TestVo01.class, createTestVo01Xml());
	public static final ProcessEnums<TestVo02> PROCESS02 = new ProcessEnums<>(TestVo02.class, createTestVo02Xml());
	public static final ProcessEnums<TestVo03> PROCESS03 = new ProcessEnums<>(TestVo03.class, createTestVo03Xml());

	private Class<T> clazz;
	private String xml;

	public ProcessEnums(Class<T> clazz, String xml) {
		this.clazz = clazz;
		this.xml = xml;
	}

	public Class<T> getClazz() {
		return clazz;
	}

	public String getXml() {
		return xml;
	}

	private static String createTestVo01Xml() {
		return
			  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
			+ "<root>"
			+ " <hoge>aaa</hoge>"
			+ " <huga>ccc</huga>"
			+ " <piyo>bbb</piyo>"
			+ "</root>";
	}

	private static String createTestVo02Xml() {
		return
			  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
			+ "<root>"
			+ " <id>20</id>"
			+ " <name>Bob</name>"
			+ "</root>";
	}

	private static String createTestVo03Xml() {
		return
			  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
			+ "<root>"
			+ " <foo>netai</foo>"
			+ " <bar>nemui</bar>"
			+ "</root>";
	}
}
