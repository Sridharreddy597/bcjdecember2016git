package com.bcj.restexample.dao;
import javax.transaction.Transactional;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.bcj.restexample.model.Customer;
import com.mongodb.WriteResult;



@Repository
@Transactional
public class CustomerDao {
	

	private MongoOperations mongoOps;
	private static final String PERSON_COLLECTION = "Customer";
	
	
	
	public CustomerDao(MongoOperations mongoOps) {
		
		this.mongoOps = mongoOps;
	}


	public void create(Customer p) {
		this.mongoOps.insert(p, PERSON_COLLECTION);
	}


	/*public ArrayList<Customer> getCustomerList() {
		Session session = this.sessionFactory.getCurrentSession();
		
		ArrayList<Customer> customerList = (ArrayList<Customer>) session.createQuery("from Customer").list();
		

		return customerList;
	}*/

	public Customer getCustomer(int id) {
		Query query = new Query(Criteria.where("_id").is(id));
		return this.mongoOps.findOne(query, Customer.class, PERSON_COLLECTION);

		
	}

	public boolean createCustomer(Customer cust) {
		System.out.println(cust);
		this.mongoOps.insert(cust, PERSON_COLLECTION);
		return true;
	}

	public int deleteCustomer(int id) {
		Query query = new Query(Criteria.where("_id").is(id));
		//if (null != query) 
			WriteResult result = this.mongoOps.remove(query, Customer.class, PERSON_COLLECTION);
		return result.getN();
		
	}

	public boolean updateCustomer(int id, Customer cust) {
		
		
		this.mongoOps.save(cust, PERSON_COLLECTION);
		return true;
	}

}
