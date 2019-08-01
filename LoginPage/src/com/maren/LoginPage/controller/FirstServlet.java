package com.maren.LoginPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

  
  
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
          
    String Name=request.getParameter("username");  
    String Password=request.getParameter("password"); 
    
    
	try {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nitish","root","Nitish123#");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into userreg values('"+Name+"','"+Password+"')");
	    System.out.println("data inserted");  
	          
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
    		        
    }  
}  
