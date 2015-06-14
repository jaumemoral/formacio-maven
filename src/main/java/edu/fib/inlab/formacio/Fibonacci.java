package edu.fib.inlab.formacio;

import edu.fib.inlab.fibonacci.FibonacciGenerator;

public class Fibonacci {
/*	
	public int[] genera(int n) {
		int[] resultat=new int[n];
		if (n>=1) resultat[0]=1;
		if (n>=2) resultat[1]=1;
		for (int i=2;i<n;i++) {resultat[i]=resultat[i-1]+resultat[i-2];}
		return resultat;
	}
*/
	FibonacciGenerator g=new FibonacciGenerator();
		
	public int[] genera(int n) {
		int[] resultat=new int[n];
		for (int i=0;i<n;i++) resultat[i]=g.numberAt(i+1);
		return resultat;
	}	
}
