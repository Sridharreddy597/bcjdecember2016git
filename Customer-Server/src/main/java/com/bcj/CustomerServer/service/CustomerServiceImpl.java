package com.bcj.CustomerServer.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.CustomerServer.dao.CustomerDao;
import com.bcj.CustomerServer.model.Customer;



/**
 * 
 * @author BytesTree
 *
 */
@Service
public class CustomerServiceImpl  {

	@Autowired
	private CustomerDao custDao;

	public Customer save(Customer entity) {
		return custDao.save(entity);
	}

	public Customer getById(Serializable id) {
		return custDao.findOne((Long) id);
	}

	public List<Customer> getAll() {
		return custDao.findAll();
	}


	public void delete(Serializable id) {
		custDao.delete((Long) id);
	}

}
