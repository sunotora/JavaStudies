package jp.co.sunotora.test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {


		//事前にCommandプロンプトにてsubstを発行

		File file = new File("F:\\temp.txt");

		if (file.exists()) {
			System.out.println("exists");
		} else {
			System.out.println("not");
		}

		System.out.println(Files.exists(Paths.get("F:\\temp.txt")));

	}

}
