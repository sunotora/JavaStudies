package jp.co.sunotora.visitor.Node6;

public interface Visitor6<R, P> {

	R visit(NumNode6 node, P parameter);

	R visit(AddNode6 node, P parameter);

}
