package jp.co.sunotora.util;

public class Main {

	public static void main(String[] args) {

		Parameter param = new Parameter("aaa", 100, 1.5f);

		System.out.println("param B:"+param.getB());

		System.out.println("*******************************");

		UseParameter use = new UseParameter(param);


		System.out.println("param A:"+param.getA());
		System.out.println("param B:"+param.getB());

		System.out.println("UseParameter A:" + use.getParam().getA());


		System.out.println("*******************************");

		param.setA("change");


		System.out.println("param:"+param.getA());
		System.out.println("param B:"+param.getB());

		System.out.println("UseParameter A:" + use.getParam().getA());


	}

}
