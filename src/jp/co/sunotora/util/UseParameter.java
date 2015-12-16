package jp.co.sunotora.util;

public class UseParameter {

	private Parameter param;

	UseParameter(Parameter param) {

		// 防御的コピー（深いコピー）
		//this.param = param.copy();
		param.setB(500);
		// 浅いコピー
		this.param = param;
	}

	public Parameter getParam() {
		return param;
	}

	public void setParam(Parameter param) {
		this.param = param;
	}

}
