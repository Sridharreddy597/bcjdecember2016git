package com.bcj.Wso2JmsProducer.service;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;

import com.bcj.Wso2JmsProducer.model.Order;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class OrderService {

	public void save(Order ord) {


		try {

			Client client = Client.create();
			WebResource webResource = client.resource("http://sridhar-PC:8280/services/rrtrr");
			ObjectMapper mapper = new ObjectMapper();
			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class, mapper.writeValueAsString(ord));
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);
			//return cust;
		} catch (Exception e) {
			e.printStackTrace();
			//return cust;
		}
	
	}

}
