package main;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

	public static void main(String [] args) {
		I1<? extends Number> i1 = new Q<String, Integer>();
		List<? extends Number> list1 = new ArrayList();
		I2<String> i2 = new Q<>();
	}
}

interface I1<A> {

}

interface I2<B> {
	
}

class Q<T, G> implements I1<G>, I2<String> {
	T a;
	
}
