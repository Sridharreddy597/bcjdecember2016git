package com.bcj.psbbussinessparks.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcj.psbbussinessparks.modal.Payment;
import com.bcj.psbbussinessparks.service.PaymentService;

/**
 * Servlet implementation class PaymentServlet
 */
/**
 * @author Bootcamp User 005 this class is used to take the request from the
 *         user and gives back the response using regarding payment confirmed or
 *         not
 *
 */
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		/**
		 * takes all the details  regarding payment from the user sets it to
		 * payment entity class
		 */
		Payment pymnt = new Payment();
		pymnt.setNameOnCard(request.getParameter("nameOnCard"));
		pymnt.setCardNumber(request.getParameter("cardNumber"));
		pymnt.setCvv(request.getParameter("cvv"));
		pymnt.setAmount(request.getParameter("amount"));

		PaymentService pSrvc = new PaymentService();
		System.out.println(pSrvc.verifyPayment(pymnt));
		if (pSrvc.verifyPayment(pymnt)) {
			response.setContentType("text/html");

			PrintWriter out = response.getWriter();		

			out.println("<html>\n" + "<head><title></title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
					 + "<ul>\n" + "<b><h1 align='center'>your payment is approved  </h1></b> "
						+ "\n </ul>\n" + "</body></html>");

		} else {
			response.setContentType("text/html");

			PrintWriter out = response.getWriter();	

			out.println("<html>\n" + "<head><title></title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
					 + "<ul>\n" + "<b><h1 align='center'>invalid details  </h1></b> "
						+ "\n <h3 align = 'center'><a href ='payment.html'> click here for payment  </a></h3>" + "\n" + "</ul>\n" + "</body></html>");

		}

	}

}
