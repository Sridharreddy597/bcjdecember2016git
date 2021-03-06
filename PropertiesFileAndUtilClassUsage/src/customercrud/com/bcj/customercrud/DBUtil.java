package com.bcj.customercrud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	
	public Connection getConnectionbyHardCode(){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elimination", "root","root");		
		
		
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
		
		
	}
	public Connection getConnectionByPropertiesFile() throws ClassNotFoundException
	{
		Properties prop=new Properties();
		
		try {
			FileInputStream fis= new FileInputStream("C:\\BCJ_DEC_2016\\workspace\\CoreJava\\customercrud\\src\\db.properties");		
				
			if(fis!=null)
				prop.load(fis);	
				fis.close();
		}
		 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	String url=prop.getProperty("url");
	String user=prop.getProperty("user");
	String pwd=prop.getProperty("password");
	String driver=prop.getProperty("Driver");
	Connection con =null;
	try {
		Class.forName(driver);
		con = DriverManager.getConnection(url,user,pwd);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		return con;
		
	}
}
