package jp.co.sunotora.visitor.Node6;

public class AddNode6 implements Node6 {

	public final Node6 left;
	public final Node6 right;

	public AddNode6(Node6 left, Node6 right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int accept(Visitor6 visitor) {
		return visitor.visit(this);
	}

}
