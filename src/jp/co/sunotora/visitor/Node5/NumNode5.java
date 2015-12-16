package jp.co.sunotora.visitor.Node5;


public class NumNode5 implements Node5 {

	public final int value;

	public NumNode5(int value) {
		this.value = value;
	}

	@Override
	public int accept(Visitor5 visitor) {
		return visitor.visit(this);
	}

}
