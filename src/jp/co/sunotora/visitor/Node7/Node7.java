package jp.co.sunotora.visitor.Node7;


public interface Node7 {
	<R, P, E extends Exception>  R accept (Visitor7 <R, P, E> visitor, P parameter) throws E;
}
