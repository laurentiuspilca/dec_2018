package main;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {

	public static <A extends Number> List<A> mergeLists(List<A> a, List<A> b) {
		List<A> result = new ArrayList<>();
		
		for (var q : a) {
			result.add(q);
		}
		
		for (var q : b) {
			result.add(q);
		}
		
		return result;
	}
}
