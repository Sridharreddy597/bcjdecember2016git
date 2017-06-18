package com.sridhar.elimination.controller;

import java.util.ArrayList;

import com.sridhar.elimination.modal.Product;
import com.sridhar.elimination.service.ProductService;

public class ProductController {

	
	public ArrayList<Product> getProduct(){
		ProductService  pSrvce =new ProductService();
		
		
		return pSrvce.getProduct();
		
	}
}
