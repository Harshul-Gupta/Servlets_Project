package com.hars;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddNums extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
		//req.setAttribute("k", k);
		
		PrintWriter out= res.getWriter();
		out.println("Result is "+ k);
		res.sendRedirect("sq?k="+k);
//		RequestDispatcher rd= req.getRequestDispatcher("sq");
//		rd.include(req, res);
	}
}
 