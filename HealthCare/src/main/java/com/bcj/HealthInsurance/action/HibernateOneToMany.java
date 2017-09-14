package com.bcj.HealthInsurance.action;

import java.util.ArrayList;
import java.util.List;

import com.bcj.HealthInsurance.dao.MemberDao;
import com.bcj.HealthInsurance.model.Address;
import com.bcj.HealthInsurance.model.Dependent;
import com.bcj.HealthInsurance.model.Member;

public class HibernateOneToMany {

	public static void main(String[] args) {
		
		Member m = new Member();
		m.setFirstName("sridhar");
		m.setLastName("ramasahayam");
		m.setMiddleName("reddy");
		m.setMobile("75849302");
		m.setEmail("fghdjk@fdh.com");
		m.setAnnualIncome("56483920");
		m.setDateOfBirth("89-89-8998");
		m.setSsn("78990098");
		m.setHouseMortage("6789");
		Address add= new Address();
		add.setAddressLine1("2938 W Royal Lane");
		add.setAddressLine2("apt # 3145");
		add.setCity("irving");add.setState("texas");
		add.setZip("75063");
		m.setAddress(add);
		
		
		Dependent dp1= new Dependent();
		dp1.setFirstName("dp1firstname");
		dp1.setLastName("dp1lastname");
		dp1.setMiddleName("dp1middlename");
		dp1.setEmail("dp1 email.@gmail.com");
		dp1.setDateOfBirth("dp1934939");
		dp1.setMobile("dp1mobile");
		dp1.setMember(m);
		
		Dependent dp2= new Dependent();
		dp2.setFirstName("dp2firstname");
		dp2.setLastName("dp2lastname");
		dp2.setMiddleName("dp2middlename");
		dp2.setEmail("dp2 email.@gmail.com");
		dp2.setDateOfBirth("dp2934939");
		dp2.setMobile("dp2mobile");
		dp2.setMember(m);
		
		Dependent dp3= new Dependent();
		dp3.setFirstName("dp3firstname");
		dp3.setLastName("dp3lastname");
		dp3.setMiddleName("dp3middlename");
		dp3.setEmail("dp3email.@gmail.com");
		dp3.setDateOfBirth("dp3934939");
		dp3.setMobile("dp3mobile");
		dp3.setMember(m);
		
		Dependent dp31= new Dependent();
		dp31.setFirstName("dp4firstname");
		dp31.setLastName("dp4astname");
		dp31.setMiddleName("4middlename");
		dp31.setEmail("dp4email.@gmail.com");
		dp31.setDateOfBirth("dp4934939");
		dp31.setMobile("dp4mobile");
		dp31.setMember(m);
		
		List<Dependent> deplist= new ArrayList<Dependent>();
		deplist.add(dp31);
		deplist.add(dp3);
		deplist.add(dp1);
		deplist.add(dp2);
		
		m.setDependents(deplist);
	
		 MemberDao memDao= new MemberDao();
		
		memDao.saveMember(m);
		
		System.out.println(m.getDependents().get(0));
		System.out.println(m.getDependents().get(1));
		System.out.println(m.getDependents().get(2));
		System.out.println(m.getDependents().get(3));
		
		System.out.println("saved..add...add...add.");
		
		
	}

}
