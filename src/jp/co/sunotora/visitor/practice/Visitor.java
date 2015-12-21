package jp.co.sunotora.visitor.practice;

public interface Visitor {

	String visitor(File file, String parameter);

	String visitor(Directory dir, String parameter);

}
