package edu.upc.fib.inlab.fibonacci;

import org.apache.log4j.Logger;

public class FibonacciGenerator {
	
	final static Logger logger = Logger.getLogger(FibonacciGenerator.class);
	
	/**
	 * Genera el numero n d'una sèrie de Fibonacci
	 */
	
	public int numberAt(int n) {
		logger.warn("Em criden amb "+n);
		if (n<=2) {
			return 1;
		} else {
			return numberAt(n-1)+numberAt(n-2);
		}
	}

}
