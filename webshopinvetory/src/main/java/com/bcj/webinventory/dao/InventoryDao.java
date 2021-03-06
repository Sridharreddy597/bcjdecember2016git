package com.bcj.webinventory.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import com.bcj.webinventory.model.Order;

public class InventoryDao {

	public void saveOrder(Order order) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JmsActiveMQ", "root", "root");
			CallableStatement stmt = con.prepareCall("{CALL `JmsActiveMQ`.`insertorder`(?,?)}");
			stmt.setString(1, order.getOrderId());
			stmt.setString(2, order.getProductName());
			stmt.execute();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
