package com.sridhar.elimination.service;

import java.util.Random;

import com.sridhar.elimination.dao.CustomerDao;
import com.sridhar.elimination.dao.CartDao;
import com.sridhar.elimination.modal.Cart;

public class CartService {
	public int saveCart(Cart crt){
		
		
		
		Random rand = new Random();

		
		int crtId = 10000 + rand.nextInt(90000);
		crt.setCartId(crtId);		
		CartDao crtDao=new CartDao();
		crtDao.saveCart(crt);
		
		return crtId;
		
	}
	
	
	

}
