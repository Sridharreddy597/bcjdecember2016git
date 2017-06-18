package com.sridhar.elimination.applicationui;

import java.util.ArrayList;
import java.util.Scanner;

import com.sridhar.elimination.controller.CartController;
import com.sridhar.elimination.controller.CustomerController;
import com.sridhar.elimination.controller.LoginController;
import com.sridhar.elimination.controller.PaymentController;
import com.sridhar.elimination.dao.ProductDao;
import com.sridhar.elimination.modal.Cart;
import com.sridhar.elimination.modal.Customer;
import com.sridhar.elimination.modal.Payment;
import com.sridhar.elimination.modal.Product;

public class EcommerceApplication {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("welcome  to *******   website ");
		System.out.println("***************  menu  *********");
		System.out.println("   1) customer creation   ");
		System.out.println("   2) login/sign in");
		System.out.println("   3) product catalogue   ");
		System.out.println("   4) shopping cart");
		System.out.println("   5) payment processing ");
		System.out.println("   6) order generation   ");
		System.out.println();
		System.out.println();
		
		
		/*System.out.println("enter your choice ");
		 int choice =s.nextInt();		
		 if(choice==1) 
		    customerCreation(); 
		
		
		  System.out.println(" enter your choice for login"); 
		  int choice2 = s.nextInt();		  
		  if (choice2 == 2) 
			  login();
		*/ 
		System.out.println("enter your choice for product catalog");
		int choice3 = s.nextInt();
		if (choice3 == 3) 
			productCatalog();
		
		System.out.println("enter your choice for shopping cart");
		int choice4 = s.nextInt();
		if (choice4== 4) 
			shoppingCart();
		
	System.out.println("enter your choice for payment");
		int choice5 = s.nextInt();
		if (choice5==5) 
			payment();	
	}

	private static void payment() {
		// TODO Auto-generated method stub	
		Payment  pymnt= new Payment();
		System.out.println("enter your credit card/ debit card No");
		pymnt.setCcNumber1(s.next());
		System.out.println("enter your Name ");
		pymnt.setName(s.next());
		System.out.println("enter your cvv on card");
		pymnt.setCvv(s.nextInt());
		PaymentController pymntCtrllr= new PaymentController();
		if(pymntCtrllr.processPayment(pymnt))
			System.out.println(" payment success");
		else 
			System.out.println("payment failed ");
		
		
		
		
		
	}

	private static void shoppingCart() {
		// TODO Auto-generated method stub
		System.out.println(" enter the   product id you need ");
		Cart crt= new Cart();
		crt.setProductId(s.nextInt()); 
		
		System.out.println("enter the no of items ");
		crt.setNoofitems(s.nextInt());
		
		
		
		CartController cContrler = new CartController();
		System.out.println("your  shoppig cart id is "+cContrler.saveCart(crt));
		System.out.println("total amount charged is "+crt.getAmount());
		
		
		
	}

	private static void productCatalog() {
		// TODO Auto-generated method stub
		ProductDao pCtllr = new ProductDao();
		ArrayList<Product> pdt = pCtllr.getproduct();
		System.out.println("product id \t" + "product Name \t" + " price ");
		for (Product p : pdt) {
			System.out.println(p.getProductId() + " \t\t" + p.getProductName() + "\t\t  " + p.getPrice());
		}
	}

	

	private static void login() {
		// TODO Auto-generated method stub
		Customer clogin = new Customer();

		System.out.println(" enter your user id ");
		clogin.setUserId(s.next());
		// System.out.println(clogin.ge);

		System.out.println("enter your password");
		clogin.setPassword(s.next());
		LoginController loginCtrl = new LoginController();

		if (loginCtrl.verifyCustomer(clogin)) {
			System.out.println(" logged in successfully");
		} else {
			System.out.println("invalid username or password");
		}

	}

	private static void customerCreation() {
		// TODO Auto-generated method stub
		Customer cust = new Customer();

		System.out.println("enter your first name");
		cust.setFirstName(s.next());

		System.out.println(" enter your lastName");
		cust.setLastName(s.next());

		System.out.println("enter your Email");
		cust.setEmail(s.next());

		System.out.println(" enter your phone ");
		cust.setPhone(s.next());

		System.out.println(" enter your userId");
		cust.setUserId(s.next());

		System.out.println(" enter your password ");
		cust.setPassword(s.next());

		if (CustomerController.doPost(cust)) {
			System.out.println("your account is created  successfully ");
			System.out.println("your customerId is " + cust.getCustomerId());
		} else
			System.out.println(" customer creation failed ");
	}

}
