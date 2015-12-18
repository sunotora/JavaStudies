package jp.co.sunotora.visitor.Node7;

public class Calc7 implements Visitor7<Integer, Void, RuntimeException> {

	@Override
	public Integer visit(NumNode7 node, Void parameter) {
		return Integer.valueOf(node.value);
	}

	@Override
	public Integer visit(AddNode7 node, Void parameter) {
		int left = node.left.accept(this, parameter);
		int right = node.right.accept(this, parameter);
		return Integer.valueOf(left + right);
	}
}
