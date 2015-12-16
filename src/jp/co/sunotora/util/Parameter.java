package jp.co.sunotora.util;

public class Parameter {
	private String a;
	private int b;
	private float c;
	private String d;

	public Parameter copy() {
		return new Parameter(a, b, c );
	}

	public Parameter(String a, int b, float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}



}