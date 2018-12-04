package main;

public class Ex1 {

	public static void main(String [] args) {
		A<Integer, String> a1;
		A<?, ?> a2;
		A<?, Integer> a3;
		
		
		a1 = new A<Integer, String>();
		a2 = new A<String, String>();
		a3 = new A<String, Integer>();
	
		Number n1 = new Integer(10);
		
		//A<Object, Object> a4 = new A<Integer, Integer>();
	}
	
	public A<?,?> m() {
		return null;
	}
}

class A<T, G> {
	
	T a;
	G b;
	
}
