package jp.co.sunotora.typesafeTest.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root")
public class TestVo01 implements ValueObjectMarker {

	private String hoge;
	private String piyo;
	private String huga;

	public String getHoge() {
		return hoge;
	}
	public void setHoge(String hoge) {
		this.hoge = hoge;
	}
	public String getPiyo() {
		return piyo;
	}
	public void setPiyo(String piyo) {
		this.piyo = piyo;
	}
	public String getHuga() {
		return huga;
	}
	public void setHuga(String huga) {
		this.huga = huga;
	}

}
