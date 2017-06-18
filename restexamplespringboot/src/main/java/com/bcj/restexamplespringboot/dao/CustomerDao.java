package com.bcj.restexamplespringboot.dao;
import java.util.ArrayList;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bcj.restexamplespringboot.model.Customer;




@Transactional
@Repository
public class CustomerDao {
	
	
	
	private SessionFactory sessionFactory;
	
	 @Autowired
	  public CustomerDao(EntityManagerFactory factory) {
	    if(factory.unwrap(SessionFactory.class) == null){
	      throw new NullPointerException("factory is not a hibernate factory");
	    }
	    this.sessionFactory = factory.unwrap(SessionFactory.class);
	  }
	

	public ArrayList<Customer> getCustomerList() {
		Session session = this.sessionFactory.openSession();
		
		//Transaction transaction = session.beginTransaction();
		ArrayList<Customer> customerList = (ArrayList<Customer>) session.createQuery("from Customer").list();
		//transaction.commit();
		//session.close();
		return customerList;
	}

	public Customer getCustomer(int id) {
		Session session = this.sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();
		Customer cst = (Customer) session.load(Customer.class, new Integer(id));
		System.out.println(cst);
		//transaction.commit();
		//session.close();
		return cst;
	}

	public boolean createCustomer(Customer cust) {
		System.out.println(cust);
		Session session = this.sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(cust);
		//transaction.commit();
		//session.close();
		return true;
	}

	public boolean deleteCustomer(int id) {
		Session session = this.sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();
		Customer cst = (Customer) session.load(Customer.class, new Integer(id));
		if (null != cst) {
			session.delete(cst);
		}
		//transaction.commit();
		//session.close();
		return true;
	}

	public boolean updateCustomer(int id, Customer cust) {
		System.out.println(cust);
		Session session = this.sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, id);
		customer.setFirstName(cust.getFirstName());
		customer.setLastName(cust.getLastName());
		session.update(customer);
		//transaction.commit();
		//session.close();
		return true;
	}

}
