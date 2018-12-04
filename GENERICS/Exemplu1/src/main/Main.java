package main;

import java.util.function.Function;

public class Main {

	public static void main(String [] args) {
		Function<String, Integer> x1 = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.length();
			}
			
		};
		
		Function<String, Integer> x2 = t -> t.length();
		System.out.println(x2.apply("Hello"));
 	}
}
