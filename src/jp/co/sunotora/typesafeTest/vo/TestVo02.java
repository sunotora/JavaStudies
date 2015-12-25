package jp.co.sunotora.typesafeTest.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root")
public class TestVo02 implements ValueObjectMarker{

	private String id;
	private String name;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
