package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Ex5 {

	public static void main(String [] args) {
		A<B<A<B<String, B<Integer, Integer>>>, String>> x;
		
		List<List<Integer>> graf1 = new ArrayList<>();
		
		graf1.add(new ArrayList<>());
		graf1.get(0).add(1);
		
		List<Map<Integer, Double>> graf2 = new ArrayList<>();
		graf2.add(new HashMap<>());
		graf2.get(0).put(1, 10.5);
		
	}
}

class A<T> {
	
}

class B<T, G> {
	
}