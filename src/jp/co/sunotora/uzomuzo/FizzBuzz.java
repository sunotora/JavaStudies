package jp.co.sunotora.uzomuzo;

import java.util.stream.IntStream;

public class FizzBuzz {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 100)
			.mapToObj(
				i -> 	i % 15 == 0 ? i + ": fizzbuzz" :
						i %  3 == 0 ? i + ": fizz" :
						i %  5 == 0 ? i + ": buzz" :
									  i + ":"
					)
			.forEach(System.out::println);


//		Stream<String> fizzbuzz =
//				range.mapToObj(
//				i -> 	i % 15 == 0 ? "fizzbuzz" :
//						i %  3 == 0 ? "fizz" :
//						i %  5 == 0 ? "buzz" : ""
//				).forEach(System.out::println);

//		Supplier<String> convFizzBuzz = i -> 	i % 15 == 0 ? "fizzbuzz" :
//												i %  3 == 0 ? "fizz" :
//												i %  5 == 0 ? "buzz" : "";
//
//		Stream<String> fizzbuzz = range.collect(
//												,accumulator, combiner).peel(System.out::println);
//
//		Function<String> a = i -> 	i % 15 == 0 ? "fizzbuzz" :
//	 								i %  3 == 0 ? "fizz" :
//	 								i %  5 == 0 ? "buzz" : ""
//		IntStream.rangeClosed(1, 100).boxed().map(mapper)
//		Stream<Integer> a = IntStream.rangeClosed(1, 100).boxed();
//		a.peek(System.out::println);
//		Stream<String> b = a.map(i -> 	i % 15 == 0 ? "fizzbuzz" :
//					 		i %  3 == 0 ? "fizz" :
//					 		i %  5 == 0 ? "buzz" : "");
//
//				b.peek(System.out::println)
//				.sorted()
//				.close();

	}
}
