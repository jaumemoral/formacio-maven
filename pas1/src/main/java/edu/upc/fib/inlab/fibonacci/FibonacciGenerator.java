package edu.upc.fib.inlab.fibonacci;

public class FibonacciGenerator {
	
	/**
	 * Genera el numero n d'una sèrie de Fibonacci
	 */
	
	public int numberAt(int n) {
		if (n<=2) {
			return 1;
		} else {
			return numberAt(n-1)+numberAt(n-2);
		}
	}

}
