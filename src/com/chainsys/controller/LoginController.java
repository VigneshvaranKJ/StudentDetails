package com.chainsys.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email =request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter out =  response.getWriter();
		out.print(email);
		out.print(password);
		
		if(email.equalsIgnoreCase("csys@gmail.com")&& password.equalsIgnoreCase("12345")){
		out.print("Success");
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
		}else
	{
		out.print("failure");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		
	}
	}
		
	}


