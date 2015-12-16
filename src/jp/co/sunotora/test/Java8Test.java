package jp.co.sunotora.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Java8Test {

	private static List<String> strList = new ArrayList<String>();
	static {
		strList.add("bbbb");
		strList.add("aaaaa");
		strList.add("ccc");
	}

	private static class DoubleTuple {
		double x;
		double y;

		public DoubleTuple(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	private static List<DoubleTuple> doubleTupleList = new ArrayList<Java8Test.DoubleTuple>();

	static {
		doubleTupleList.add(new DoubleTuple(1d, 2d));
		doubleTupleList.add(new DoubleTuple(2d, 3d));
		doubleTupleList.add(new DoubleTuple(3d, 4d));
	}

	public static void main(String[] args) {

		// testOld();
		// testComp();
		// testMethodRef();

	}

	private static void testColligion() {

	}

	public static class Student implements Named, Person {
		@Override
		public String getName() {
			return Named.super.getName();
		}
	}

	interface Named {
		default String getName() {
			return "Named getName";
		}
	}

	interface Person {
		default String getName() {
			return "Person getName";
		}
	}

	private static void testMethodRef() {
		// object::instanceMethod
		// System.out::println = x -> System.out.println(x);
		System.out.println("aaa");

		// Class::staticMethod
		// Math::pow = (x, y) -> Math.pow(x, y);

		// Math.pow(10d, 11d);
		// 違うらしい
		doubleTupleList.stream().map(tuple -> Math.pow(tuple.x, tuple.y));

		// Class::instanceMethod
		// String::compareToIgnoreCase = (x, y) -> x.compareToIgnoreCase(y);

		// "aaa".compareToIgnoreCase("yyy");
		// これはOK
		Collections.sort(strList, String::compareToIgnoreCase);

	}

	private static void testError() {
		Runnable sleeper = () -> {
			System.out.println("ZZZ");
			// Thread.sleep(100); //error
		};
	}

	private static void testComp() {

		// ラムダ
		Collections.sort(
				strList,
				(first, second) -> Integer.compare(first.length(),
						second.length()));

		// 関数型インターフェース
		BiFunction<String, String, Integer> comp = (first, second) -> Integer
				.compare(first.length(), second.length());

		Comparator<String> lengthComparator = (first, second) -> Integer
				.compare(first.length(), second.length());
		Collections.sort(strList, lengthComparator);

		// 有名クラスの無名インスタンス
		Collections.sort(strList, new LengthComparator());

		// 無名クラスの無名インスタンス
		Collections.sort(strList, new Comparator<String>() {
			public int compare(String first, String second) {
				return Integer.compare(first.length(), second.length());
			}
		});

	}

	static class LengthComparator implements Comparator<String> {
		public int compare(String first, String second) {
			return Integer.compare(first.length(), second.length());
		}
	}

	private static void testOldRambda() {
		System.out.println("*********匿名クラス*********");

		// 匿名クラス
		Runnable runner1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous");
			}
		};
		runner1.run();

		List<Integer> list = Arrays.asList(1, 3, 2);
		System.out.println(list);
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		});
		System.out.println(list);

		System.out.println("*********ラムダ*********");

		// lambda
		Runnable runner2 = () -> {
			System.out.println("lambda");
		};
		runner2.run();

		List<Integer> list2 = Arrays.asList(1, 3, 2);
		System.out.println(list2);
		Collections.sort(list2, (o1, o2) -> Integer.compare(o1, o2));
		System.out.println(list2);

	}

}
