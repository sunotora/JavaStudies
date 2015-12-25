package jp.co.sunotora.typesafeTest.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root")
public class TestVo03 implements ValueObjectMarker{

	private String foo;
	private String bar;

	public String getFoo() {
		return foo;
	}
	public void setFoo(String foo) {
		this.foo = foo;
	}
	public String getBar() {
		return bar;
	}
	public void setBar(String bar) {
		this.bar = bar;
	}


}
