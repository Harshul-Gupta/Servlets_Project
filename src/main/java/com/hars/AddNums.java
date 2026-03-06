package com.hars;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddNums extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
		//req.setAttribute("k", k);
		
		HttpSession session= req.getSession();
		session.setAttribute("k", k);
		res.sendRedirect("sq");
//		RequestDispatcher rd= req.getRequestDispatcher("sq");
//		rd.include(req, res);
	}
}
 