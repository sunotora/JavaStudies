package jp.co.sunotora.visitor.Node6;


public class NumNode6 implements Node6 {

	public final int value;

	public NumNode6(int value) {
		this.value = value;
	}

	@Override
	public int accept(Visitor6 visitor) {
		return visitor.visit(this);
	}

}
