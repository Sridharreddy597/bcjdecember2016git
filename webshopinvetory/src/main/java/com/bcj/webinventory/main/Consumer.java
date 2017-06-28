/**
 * 
 */
package com.bcj.webinventory.main;

import com.bcj.webinventory.service.OrderReceiver;

/**
 * @author
 *
 */
public class Consumer {

	public static void main(String[] args) {
		OrderReceiver app = new OrderReceiver();
		app.run();
	}

}
