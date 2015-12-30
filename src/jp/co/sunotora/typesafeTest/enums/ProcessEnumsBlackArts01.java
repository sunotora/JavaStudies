package jp.co.sunotora.typesafeTest.enums;

import jp.co.sunotora.typesafeTest.vo.TestVo01;
import jp.co.sunotora.typesafeTest.vo.TestVo02;
import jp.co.sunotora.typesafeTest.vo.TestVo03;
import jp.co.sunotora.typesafeTest.vo.ValueObjectMarker;

public class ProcessEnumsBlackArts01 <T extends ValueObjectMarker> {

	//邪法その１
	// コンストラクタのclazz(taに変更)に空の配列を渡し空の配列からリフレクションでclassを得る
	public static final ProcessEnumsBlackArts01<TestVo01> PROCESS01 = new ProcessEnumsBlackArts01<>(ProcessEnums.createTestVo01Xml());
	public static final ProcessEnumsBlackArts01<TestVo02> PROCESS02 = new ProcessEnumsBlackArts01<>(ProcessEnums.createTestVo02Xml());
	public static final ProcessEnumsBlackArts01<TestVo03> PROCESS03 = new ProcessEnumsBlackArts01<>(ProcessEnums.createTestVo03Xml());

	private String xml;
	private Class<T> clazz;

	//ta経由の潜在的なヒープ汚染があるらしい・・・
	@SafeVarargs
	private ProcessEnumsBlackArts01(String xml, T... ta) {
		this.xml = xml;
		try {
			Class<?> clazz = ta.getClass();
			Class<?> componentType = clazz.getComponentType();
			this.clazz = (Class<T>) componentType.newInstance().getClass();
		} catch (ReflectiveOperationException e) {
			throw new RuntimeException(e);
		}

	}

	public Class<T> getClazz() {
		return clazz;
	}

	public String getXml() {
		return xml;
	}
}
