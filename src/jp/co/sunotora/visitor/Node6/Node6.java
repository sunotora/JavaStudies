package jp.co.sunotora.visitor.Node6;


public interface Node6 {


	<R, P> R accept (Visitor6 <R, P> visitor, P parameter);
	//このacceptメソッドはジェネリクスとして<R, P>を使用します。
	//メソッドは R型を返します、
	//メソッド引数として<R, P>をジェネリクスとして持つVisitorと
	//P型のparameterを受け取る
}
