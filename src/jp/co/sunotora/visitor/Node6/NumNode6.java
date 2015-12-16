package jp.co.sunotora.visitor.Node6;


public class NumNode6 implements Node6 {

	public final int value;

	public NumNode6(int value) {
		this.value = value;
	}

	@Override
	public <R, P> R accept(Visitor6<R, P> visitor, P parameter) {
		return visitor.visit(this, parameter);
	}

}
