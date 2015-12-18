package jp.co.sunotora.visitor.Node7;

interface Visitor7<R, P, E extends Exception> {

	R visit(NumNode7 node, P parameter) throws E;

	R visit(AddNode7 node, P parameter) throws E;

}
