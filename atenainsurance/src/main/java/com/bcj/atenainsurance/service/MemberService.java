package com.bcj.atenainsurance.service;


import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bcj.atenainsurance.model.Member;


@WebService
public interface MemberService {

	@WebMethod
	public Member getMemberbyId(int id);
	
	@WebMethod
	public int createMember(Member mem);
	
	
	
}
