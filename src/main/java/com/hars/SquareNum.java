package com.hars;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieHandler;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareNum extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k= 0;
		Cookie cookie[]= req.getCookies();
		for(Cookie c: cookie)
		{
			if(c.getName().equals("k"))
				k= Integer.parseInt(c.getValue());
		}
        int result = k * k;

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Calculation Result</title>");
        out.println("<style>");
        out.println("  body { margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; min-height: 100vh; font-family: 'Segoe UI', sans-serif; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); color: #fff; }");
        out.println("  .glass-card { background: rgba(255, 255, 255, 0.1); backdrop-filter: blur(10px); border-radius: 20px; padding: 40px; border: 1px solid rgba(255, 255, 255, 0.2); box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37); text-align: center; max-width: 400px; width: 90%; }");
        out.println("  h1 { font-size: 1.2rem; text-transform: uppercase; letter-spacing: 2px; opacity: 0.8; margin-bottom: 20px; }");
        out.println("  .result-value { font-size: 4rem; font-weight: 800; margin: 10px 0; background: linear-gradient(to right, #fff, #d1d1d1); -webkit-background-clip: text; -webkit-text-fill-color: transparent; }");
        out.println("  .details { font-size: 1rem; opacity: 0.7; margin-top: 20px; }");
        out.println("  .back-btn { margin-top: 30px; display: inline-block; padding: 10px 25px; background: rgba(255, 255, 255, 0.2); text-decoration: none; color: white; border-radius: 50px; transition: 0.3s; }");
        out.println("  .back-btn:hover { background: rgba(255, 255, 255, 0.4); }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("  <div class='glass-card'>");
        out.println("    <h1>Calculation Result</h1>");
        out.println("    <div class='result-value'>" + result + "</div>");
        out.println("    <p class='details'>The square of sum of <b>" + k + "</b> has been calculated successfully.</p>");
        out.println("    <a href='NewFile.html' class='back-btn'>Try Another</a>");
        out.println("  </div>");
        out.println("</body>");
        out.println("</html>");
    }
}
