package com.bcj.HealthInsurance.action;

import java.util.List;

import com.bcj.HealthInsurance.model.Dependent;
import com.bcj.HealthInsurance.model.Member;
import com.bcj.HealthInsurance.service.MemberService;
import com.opensymphony.xwork2.ModelDriven;


public class Registration implements ModelDriven<Member> {

	
	Member member= new Member();
	
	
/* @EJB */MemberService memsrvc= new MemberService();
	
	
	
	public void setMemsrvc(MemberService memsrvc) {
		this.memsrvc = memsrvc;
	}
	
	public String execute() throws Exception {
		System.out.println(memsrvc+"................"+member);
		for(Dependent dep : member.getDependents())
		dep.setMember(member);
		
		memsrvc.saveMember(member);
		
		return "SUCCESS";
		
	}
	@Override
	public Member getModel() {
		
		return member;
	}
	
	
	
	
	






	
	
	
}
