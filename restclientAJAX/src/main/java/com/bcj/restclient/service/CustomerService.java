package com.bcj.restclient.service;

import org.springframework.stereotype.Service;
import com.bcj.restclient.model.Customer;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Service
public class CustomerService {

	public void getAllCustomer() {
		// TODO Auto-generated method stub

	}

	public Customer saveCustomer(Customer cust) {

		try {

			Client client = Client.create();
			WebResource webResource = client.resource("http://192.168.0.55:8280/services/restexamplewso2/create");
			ObjectMapper mapper = new ObjectMapper();
			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class, mapper.writeValueAsString(cust));
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);
			return cust;
		} catch (Exception e) {
			e.printStackTrace();
			return cust;
		}
	}

	public Customer getCustomer(String  id) {
		
		Customer customer=null;
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://192.168.0.55:8280/services/restexamplewso2/get/");
			
			System.out.println("Output from Server .... \n");
		 customer = webResource.path(id)
		            .accept(MediaType.APPLICATION_JSON_TYPE)
		                .get(Customer.class);
		       // System.out.println(customer.getLastName() + ", "+ customer.getFirstName());
		        
			
			
			return customer;
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return customer;
		
	}

	public Customer updateCustomer(Customer cust) {
		 String id= Integer.toString(cust.getId());
		
	
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://192.168.0.55:8280/services/restexamplewso2/update/"+id);
			ObjectMapper mapper = new ObjectMapper();
			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).put(ClientResponse.class, mapper.writeValueAsString(cust));
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);
			return cust;
			
		} catch (Exception e) {
			e.printStackTrace();
			return cust;
		}
		
		
		
	}

	public String deleteCustomer(String id) {
	
		
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://192.168.0.55:8280/services/restexamplewso2/delete/");
			
			System.out.println("Output from Server .... \n");
		 String str = webResource.path(id)
		            .accept(MediaType.APPLICATION_JSON_TYPE)
		                .delete(String.class);
		       // System.out.println(customer.getLastName() + ", "+ customer.getFirstName());
		        
			return "deleted sucessfully";
		} catch (Exception e) {
			e.printStackTrace();
			return "delete failed";
		}
		
		
		
	}
}
