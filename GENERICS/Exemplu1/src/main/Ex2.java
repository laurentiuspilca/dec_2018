package main;

public class Ex2 {

	public static void main(String [] args) {
		 B<? extends Number> b1 = new B<Integer>();
		 B<Integer> b2 = new B<Integer>();
		 B<?> b3 = new B<String>();
		 B<? super Integer> b4 = new B<Object>();
		 
		 b2.a = 10;
		 //b1.a = 10;
		 b4.a = 10;
	}
	
	public B<?> m() {
		return null;
	}
}

class B<T> {
	T a;
}
