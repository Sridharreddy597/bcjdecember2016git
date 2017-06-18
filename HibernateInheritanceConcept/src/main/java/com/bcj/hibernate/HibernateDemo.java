package com.bcj.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
	
	public static void main(String[] args) {
		
		
		
		Vechicle vech = new Vechicle();
		vech.setVehicleName("car");
		
		Vechicle vech1 = new Vechicle();
		vech1.setVehicleName("jeep");
		
		UserDetails user = new UserDetails();
		user.setUserName("first user");
		user.getVechicle().add(vech);
		user.getVechicle().add(vech1);
		
		Configuration configuration = new Configuration();
	    configuration.configure();

	    SessionFactory factory= configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		session.beginTransaction();
		session.save(vech);
		session.save(user);
		session.save(vech1);
		
		session.getTransaction().commit();
		session.close();
		
		
	}

}
