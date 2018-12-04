package main;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String [] args) {
		List<? extends Number> list1 = new ArrayList<>();
		//list1.add(10.5);
	
		new C<Integer>();
		
		C.m1(10);
		//C.m1("Hello");
	}
}

class C<T extends Number> {
	T t;
	
	C() {}
	C(T t) {
		this.t = t;
	}
	
	public static <G extends Number> void m1(G g) {
		C<?> c1 = new C<G>(g);
	}
	
}
