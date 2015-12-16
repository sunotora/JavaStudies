package jp.co.sunotora.visitor.Node1;

public class NumNode1 implements Node1 {

	public final int value;

	public NumNode1(int value) {
		this.value = value;
	}

	@Override
	public int calc() {
		return value;
	}

}
