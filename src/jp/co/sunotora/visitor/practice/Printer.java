package jp.co.sunotora.visitor.practice;

import java.util.List;

public class Printer implements Visitor {

	@Override
	public String visitor(File file, String dir) {
		String filePath = dir + "/"+ file.getName() + "(" + String.valueOf(file.getSize()) + ")";
		System.out.println(filePath);
		return filePath;
	}

	@Override
	public String visitor(Directory dir, String parentDir) {
		List<Node> nodeList = dir.getNodeList();
		System.out.println(parentDir + "/" + dir.getName());
		for (Node node: nodeList) {
			node.accept(this, parentDir + "/" + dir.getName());
		}

		return "" ;
	}


}
