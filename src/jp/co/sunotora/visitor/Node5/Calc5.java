package jp.co.sunotora.visitor.Node5;

public class Calc5 implements Visitor5 {

	@Override
	public int visit(NumNode5 node) {
		return node.value;
	}

	@Override
	public int visit(AddNode5 node) {
		int left = node.left.accept(this);
		int right = node.right.accept(this);
		return left + right;
	}
}
