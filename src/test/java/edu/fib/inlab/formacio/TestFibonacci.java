package edu.fib.inlab.formacio;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestFibonacci {
	
	@Test
	public void testFibonacci1() {
		Fibonacci f=new Fibonacci();
		int[] numeros=f.genera(1);
		assertArrayEquals(new int[]{1},numeros);
	}
	
	@Test
	public void testFibonacci2() {
		Fibonacci f=new Fibonacci();
		int[] numeros=f.genera(2);
		assertArrayEquals(new int[]{1,1},numeros);
	}
	
	@Test
	public void testFibonacci3() {
		Fibonacci f=new Fibonacci();
		int[] numeros=f.genera(3);
		assertArrayEquals(new int[]{1,1,2},numeros);
	}

	@Test
	public void testFibonacci4() {
		Fibonacci f=new Fibonacci();
		int[] numeros=f.genera(4);
		assertArrayEquals(new int[]{1,1,2,3},numeros);
	}	

	@Test
	public void testFibonacci6() {
		Fibonacci f=new Fibonacci();
		int[] numeros=f.genera(6);
		assertArrayEquals(new int[]{1,1,2,3,5,8},numeros);
	}		
	
}
