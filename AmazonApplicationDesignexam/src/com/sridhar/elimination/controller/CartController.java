package com.sridhar.elimination.controller;

import com.sridhar.elimination.modal.Cart;
import com.sridhar.elimination.service.CartService;

public class CartController {

	
	public int saveCart(Cart crt){
		CartService cSrvc= new CartService();	
		
		return cSrvc.saveCart(crt);
		
	}
}
