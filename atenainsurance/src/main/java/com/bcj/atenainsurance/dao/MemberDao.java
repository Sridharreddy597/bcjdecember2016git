package com.bcj.atenainsurance.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bcj.atenainsurance.model.Member;

@Repository
@Transactional
public class MemberDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Member getMember(int id) {
		
		Session session = this.sessionFactory.getCurrentSession();
		// Transaction transaction = session.beginTransaction();
		Member mem = (Member) session.load(Member.class, new Integer(id));

		/*
		 * Query query = session.
		 * createQuery("SELECT m.firstName,m.lastName,m.plan,m.address.addressLine1,m.address.addressline2,m.address.city,m.address.state,m.address.zipCode FROM Member m WHERE m.id = :id"
		 * ); query.setInteger("id", id); List<Member> result =
		 * (ArrayList<Member>) query.list(); Iterator itr = result.iterator();
		 * while (itr.hasNext()) { obj = (Object[]) itr.next();
		 * member.setFirstName(String.valueOf(obj[0]));
		 * member.setLastName(String.valueOf(obj[1]));
		 * member.setPlan(String.valueOf(obj[2]));
		 * address.setAddressLine1(String.valueOf(obj[3]));
		 * address.setAddressline2(String.valueOf(obj[4]));
		 * address.setCity(String.valueOf(obj[5]));
		 * address.setState(String.valueOf(obj[6]));
		 * address.setZipCode(String.valueOf(obj[7]));
		 * member.setAddress(address);
		 */

		System.out.println(mem);
		// transaction.commit();
		// session.close();
		
		return mem;

	}

	public int createMember(Member mem) {

		System.out.println(mem);
		//Address add = mem.getAddress();
		Session session = this.sessionFactory.getCurrentSession();
		
		//Transaction transaction = session.beginTransaction();
		session.save(mem);
		//session.saveOrUpdate(add);
		//session.flush();
		// transaction.commit();
		int id = mem.getId();
		//session.close();
		
		return id;
	}
}
