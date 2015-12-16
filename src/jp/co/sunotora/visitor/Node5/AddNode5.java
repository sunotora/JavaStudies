package jp.co.sunotora.visitor.Node5;

public class AddNode5 implements Node5 {

	public final Node5 left;
	public final Node5 right;

	public AddNode5(Node5 left, Node5 right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int accept(Visitor5 visitor) {
		return visitor.visit(this);
	}

}
