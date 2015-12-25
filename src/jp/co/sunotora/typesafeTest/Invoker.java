package jp.co.sunotora.typesafeTest;

import java.io.StringReader;

import javax.xml.bind.JAXB;

import jp.co.sunotora.typesafeTest.enums.ProcessEnums;
import jp.co.sunotora.typesafeTest.vo.ValueObjectMarker;

public class Invoker {

	public static <T extends ValueObjectMarker> T Invoke(ProcessEnums<T> process) {
		return JAXB.unmarshal(new StringReader(process.getXml()), process.getClazz());
	}
}
