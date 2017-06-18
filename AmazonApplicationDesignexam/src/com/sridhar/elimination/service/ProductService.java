package com.sridhar.elimination.service;

import java.util.ArrayList;

import com.sridhar.elimination.dao.ProductDao;
import com.sridhar.elimination.modal.Product;

public class ProductService {
public ArrayList<Product>	getProduct(){
	ProductDao pDao=new ProductDao();
	return  pDao.getproduct();
		
	}

}
