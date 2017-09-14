package com.bcj.Wso2JmsProducer;

import java.util.Scanner;

import com.bcj.Wso2JmsProducer.model.Order;
import com.bcj.Wso2JmsProducer.service.OrderService;

public class JmsProducerDemo {

	public static void main(String[] args) {
		JmsProducerDemo jpd= new JmsProducerDemo();
		jpd.createMessage();
		
	}

	private void createMessage() {
		Order ord= new Order();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter product Name");
		ord.setProductName(sc.nextLine());
		
		System.out.println("Enter orderId ");
		ord.setProductName(sc.nextLine());
		
		OrderService ordserv= new OrderService();
		
		ordserv.save(ord);
		
		
		sc.close();
	}
	
	
}
