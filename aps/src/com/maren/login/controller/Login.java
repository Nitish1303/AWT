package com.maren.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName = request.getParameter("username");
		String Password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if(UserName.contentEquals("nitish") && Password.contentEquals("1234"))
		{
			out.println("WELCOME "+ UserName);
		}
		else
		{
			out.print("FUCK OFF");
		}
	}

}
