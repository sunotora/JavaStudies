package jp.co.sunotora.visitor.Node7;


public class NumNode7 implements Node7 {

	public final int value;

	public NumNode7(int value) {
		this.value = value;
	}

	@Override
	public <R, P, E extends Exception> R accept(Visitor7<R, P, E> visitor,
			P parameter) throws E {
		return visitor.visit(this, parameter);
	}
}
