package jp.co.sunotora.visitor.Node1;

public class AddNode1 implements Node1 {

	public final Node1 left;
	public final Node1 right;

	public AddNode1(Node1 left, Node1 right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int calc() {
		return left.calc() + right.calc();
	}

}
