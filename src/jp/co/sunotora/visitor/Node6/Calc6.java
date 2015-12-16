package jp.co.sunotora.visitor.Node6;

public class Calc6 implements Visitor6<Integer, Void> {

	@Override
	public Integer visit(NumNode6 node, Void parameter) {
		return Integer.valueOf(node.value);
	}

	@Override
	public Integer visit(AddNode6 node, Void parameter) {
		int left = node.left.accept(this, parameter);
		int right = node.right.accept(this, parameter);
		return Integer.valueOf(left + right);
	}
}
