package edu.upc.fib.inlab.fibonacci;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.upc.fib.inlab.fibonacci.FibonacciGenerator;

public class Calcula extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		FibonacciGenerator fg = new FibonacciGenerator();
		int n = Integer.parseInt(request.getParameter("n"));
		int f = fg.numberAt(n);
		PrintWriter out = response.getWriter();
		out.println("Numero n:" + f);
	}

}
