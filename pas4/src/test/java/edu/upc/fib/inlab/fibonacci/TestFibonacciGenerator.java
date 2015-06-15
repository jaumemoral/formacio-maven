package edu.upc.fib.inlab.fibonacci;


import static org.junit.Assert.*;
import org.junit.Test;


public class TestFibonacciGenerator {
	@Test
	public void testFibonacci1() {
		FibonacciGenerator f=new FibonacciGenerator();
		int n=f.numberAt(1);
		assertEquals(1,n);
	}
	
	@Test
	public void testFibonacci2() {
		FibonacciGenerator f=new FibonacciGenerator();
		int n=f.numberAt(2);
		assertEquals(1,n);
	}
	
	@Test
	public void testFibonacci3() {
		FibonacciGenerator f=new FibonacciGenerator();
		int n=f.numberAt(3);
		assertEquals(2,n);
	}

	@Test
	public void testFibonacci4() {
		FibonacciGenerator f=new FibonacciGenerator();
		int n=f.numberAt(4);
		assertEquals(3,n);
	}

	@Test
	public void testFibonacci6() {
		FibonacciGenerator f=new FibonacciGenerator();
		int n=f.numberAt(6);
		assertEquals(8,n);
	}
}
