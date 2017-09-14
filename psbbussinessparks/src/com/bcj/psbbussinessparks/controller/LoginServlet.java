package com.bcj.psbbussinessparks.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
<<<<<<< HEAD
=======
import javax.servlet.annotation.WebServlet;
>>>>>>> 96b5c57366ad685b6446a1c0f5a3f59608861971
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcj.psbbussinessparks.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */

/**
 * @author Bootcamp User 005 this class is used to take the request from the
 *         user when he calls the login page
 */
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse) this method
	 * takes the input and request from the html page and sends it to service
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("config  login :"+getServletConfig().getInitParameter("driver"));
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		LoginService lSrvce = new LoginService();

		/**
		 * aunthenticate methods returns true if userid ,password are valid
		 * other wise returns false
		 */
		if (lSrvce.authenticateTenant(userId, password)) {

			response.setContentType("text/html");

			PrintWriter out = response.getWriter();

			out.println("<html>\n" + "<head><title></title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n" + "<ul>\n"
					+ "<b><h1 align='center'>your are logged in succesfully   </h1></b> "
					+ "\n <h3 align = 'center'><a href ='payment.html'> payment  </a></h3>" + "\n" + "</ul>\n"
					+ "</body></html>");

		} else {
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			
			out.println("<html>\n" + "<head><title></title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n" + "<ul>\n"
					+ "<b><h1 align='center'>invalid user name or password  </h1></b> "
					+ "\n <h3 align = 'center'><a href ='login.html'> login here  </a></h3>" + "\n" + "</ul>\n"
					+ "</body></html>");
		}
	}

}
