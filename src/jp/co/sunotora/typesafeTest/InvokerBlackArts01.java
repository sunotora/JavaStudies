package jp.co.sunotora.typesafeTest;

import java.io.StringReader;

import javax.xml.bind.JAXB;

import jp.co.sunotora.typesafeTest.enums.ProcessEnumsBlackArts01;
import jp.co.sunotora.typesafeTest.vo.ValueObjectMarker;

public class InvokerBlackArts01 {

	public static <T extends ValueObjectMarker> T Invoke(ProcessEnumsBlackArts01<T> process) {
		return JAXB.unmarshal(new StringReader(process.getXml()), process.getClazz());
	}
}
