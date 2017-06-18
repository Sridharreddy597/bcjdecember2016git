package com.bcj.psbbussinessparks.controller;


import com.bcj.psbbussinessparks.modal.Company;
import com.bcj.psbbussinessparks.modal.Tenant;
import com.bcj.psbbussinessparks.service.RegistrationService;
import com.bcj.psbbussinessparks.modal.Address;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


/**
 * Servlet implementation class RegistrationController
 */
/**
 * @author Bootcamp User 005 this class is used to take the request from the
 *         user and send the response for registration 
 */
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(RegistrationController.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 *  this method
	 * takes all the details from html page given by the user by using request
	 * parameter 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is warn : " );
		logger.info("This is warn : " );
		
		logger.warn("This is warn : " );
		logger.error("This is error : " );
		logger.fatal("This is fatal : " );
		// TODO Auto-generated method stub

		/**
		 * here it stores all the details to company entity class 
		 */
		System.out.println("config  registartion :"+getInitParameter("name"));
		Company cmpny = new Company();
		cmpny.setCompanyName(request.getParameter("cmpName"));
		cmpny.setPhone(request.getParameter("cmpPhone"));
		cmpny.setEmail(request.getParameter("cmpEmail"));
		

		/**
		 * here it stores all the details to address entity class
		 * 
		 */
		Address add = new Address();
	//String line1=	request.getParameter("line1");
		add.setAddressLine1(request.getParameter("line1"));
		add.setAddressLine2(request.getParameter("line2"));
		add.setCity(request.getParameter("city"));
		add.setState(request.getParameter("state"));
		add.setZip(request.getParameter("zip"));
		
		
		/**
		 * here it stores all the details to tenant entity class
		 * 
		 */
		Tenant tnt = new Tenant();

		tnt.setFirstName(request.getParameter("fName"));
		tnt.setLastName(request.getParameter("lName"));
		tnt.settPhone(request.getParameter("phone"));
		tnt.settEmail(request.getParameter("email"));
		tnt.settUserId(request.getParameter("userId"));
		tnt.settPassword(request.getParameter("password"));
		cmpny.setAdd(add);
		cmpny.setTnt(tnt);

		RegistrationService rsrvc = new RegistrationService();
		
		if (rsrvc.saveCompany(cmpny)) {

			/**
			 * prints the message registered successfully if it returns true 
			 */
			response.setContentType("text/html");

			PrintWriter out = response.getWriter();
			
			out.println("<html>\n" + "<head><title></title></head>\n" + "<body bgcolor=\"#AFEEEE\">\n"
					+ "<h1 align='center'>\n" + "<ul>\n" + "  <b>you are registered sucessfully </b></h1> "
					+ "\n<p align='center'> <a href=login.html><font color='black'>click here to login</font></a></p>" + "\n" + "</ul>\n" + "</body></html>");
		} else {
			/**
			 * prints the message registration failed if it returns false
			 */

			response.setContentType("text/html");

			PrintWriter out = response.getWriter();	

			out.println( "<html>\n" + "<head><title></title></head>\n" + "<body bgcolor=\"#AFEEEE\">\n"
					+ "<h1 align='center'>\n" + "<ul>\n" + "  <b>registration failed </b></h1> " + "\n " + "\n"
					+ "</ul>\n" + "</body></html>");
		}

	}

}
