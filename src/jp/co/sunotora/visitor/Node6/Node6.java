package jp.co.sunotora.visitor.Node6;


public interface Node6 {

    //↓型変数                 ↓パラメタライズドタイプ
	<R, P> R accept (Visitor6 <R, P> visitor, P parameter);
	// {      ↓型変数へのバインド              ↓パラメタライズドタイプ
	//	List<String> hogeList = new ArrayList<String>();
	//}
	//       ↓メソッドジェネリクスの型変数へのバインド
	// Hoge.<String>hoge(strList);

	//このacceptメソッドはジェネリクスとして<R, P>の型変数を使用します。
	//メソッドは R型を返します、
	//メソッド引数として<R, P>をジェネリクスとして持つVisitorと
	//P型のparameterを受け取る


}
