/**
 * 
 */
package com.bcj.webinventory.service;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * @author 
 *
 */
public class OrderReceiver implements MessageListener {

	public static String brokerURL = "tcp://localhost:61616";

	private Connection connection;
	private Session session;
	private MessageConsumer consumer;

	public void run() {
		try {
			ConnectionFactory factory = new ActiveMQConnectionFactory(brokerURL);
			connection = factory.createConnection();
			connection.start();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createQueue("messageQueue1");
			consumer = session.createConsumer(destination);
			consumer.setMessageListener(this);
		} catch (Exception e) {
			System.out.println("Caught:" + e);
			e.printStackTrace();
		}
	}

 

	
	@Override
	public void onMessage(Message message) {
		
		InventoryService iser = new InventoryService();
		
		try {
			if (message instanceof TextMessage) {
				TextMessage txtMessage = (TextMessage) message;
				System.out.println("Message received: " + txtMessage.getText());
				String productName = txtMessage.getText();
				System.out.println(productName);
				iser.saveOrder(productName);
				
			} else {
				System.out.println("Invalid message received.");
			}
		} catch (JMSException e) {
			System.out.println("Caught:" + e);
			e.printStackTrace();
		}
	}

}
