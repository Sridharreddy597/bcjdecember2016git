/**
 * 
 */
package com.bcj.webshop.messaging;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.bcj.webshop.model.Order;

/**
 * @author 
 * A Service for sending the message using JmsTemplate.
 */
public class MessageSender{
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Destination messageDestination;

	/*public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}*/

	public void sendMessage(final Order order) {
		System.out.println("Producer sends " + order.getProductName());
		jmsTemplate.send(messageDestination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				ObjectMessage objectMessage = session.createObjectMessage(order);
				return objectMessage;
			}
		});
	}

}
