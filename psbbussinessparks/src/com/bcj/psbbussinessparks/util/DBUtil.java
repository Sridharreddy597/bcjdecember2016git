package com.bcj.psbbussinessparks.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bcj.psbbussinessparks.controller.RegistrationController;

public class DBUtil {
	final static Logger logger = Logger.getLogger(DBUtil.class);
	Connection con;

	public Connection getconnectionByDataSources() {

		Context context;

		try {
			context = new InitialContext();
			DataSource ds;
			ds = (DataSource) context.lookup("mydb");
			Connection con = ds.getConnection();
			return con;
		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	public Connection getConnectionByPropertiesFile() throws ClassNotFoundException, NamingException, SQLException {

		/**
		 * loades the properties from external properties file
		 */
		Properties prop = new Properties();
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is warn : " );
		logger.info("This is warn : " );
		
		logger.warn("This is warn : " );
		logger.error("This is error : " );
		logger.fatal("This is fatal : " );

		try  {

			/**
			 * reads the file from the external source
			 */
			FileInputStream fis = new FileInputStream(
					System.getenv("CATALINA_HOME")+"\\webapps\\resources\\db.properties");
			logger.debug("This is warn : " );
			logger.info("This is warn : "+fis );
			
			logger.warn("This is warn : " );
			logger.error("This is error : " );
			logger.fatal("This is fatal : " );

			if (fis != null)
				prop.load(fis);
			fis.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error("Threw a BadException in MyClass::MyMethod, full stack trace follows:", e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String pwd = prop.getProperty("password");
		String driver = prop.getProperty("Driver");
		Connection con = null;
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("Threw a BadException in MyClass::MyMethod, full stack trace follows:", e);
		}

		return con;

	}
}
