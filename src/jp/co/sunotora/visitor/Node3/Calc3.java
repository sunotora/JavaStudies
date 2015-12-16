package jp.co.sunotora.visitor.Node3;

public class Calc3 {

	public int calc(Node3 node) {

		if(node instanceof AddNode3) {
			AddNode3 addNode3 = (AddNode3) node;
			return calc(addNode3.left) + calc(addNode3.right);
		} else if (node instanceof NumNode3) {
			NumNode3 numNode3 = (NumNode3) node;
			return numNode3.value;
		}

		throw new IllegalArgumentException(String.valueOf(node));
	}

}
