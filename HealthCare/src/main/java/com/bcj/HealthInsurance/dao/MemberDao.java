package com.bcj.HealthInsurance.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bcj.HealthInsurance.HibernateUtil;
import com.bcj.HealthInsurance.model.Member;




/**
 * Session Bean implementation class MemberDao
 */
/*@Stateless(name="MemberDao")
@LocalBean*/
public class MemberDao {

    /**
     * Default constructor. 
     */
   
	public void saveMember(Member mem) {
		System.out.println(mem);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(mem);
		transaction.commit();
		session.close();
		//return true;
		}
  
}
