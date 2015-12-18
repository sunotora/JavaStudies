package jp.co.sunotora.visitor.Node7;

public class AddNode7 implements Node7 {

	public final Node7 left;
	public final Node7 right;

	public AddNode7(Node7 left, Node7 right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public <R, P, E extends Exception> R accept(Visitor7<R, P, E> visitor,
			P parameter) throws E {
		return visitor.visit(this, parameter);
	}
}
