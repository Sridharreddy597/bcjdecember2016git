package com.bcj.atenainsurance.service;


import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcj.atenainsurance.dao.MemberDao;
import com.bcj.atenainsurance.model.Member;

@WebService(endpointInterface = "com.bcj.atenainsurance.service.MemberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao aDao;

	@WebMethod
	public Member getMemberbyId(int id) {

		return aDao.getMember(id);
	}

	@WebMethod
	public int createMember(Member mem) {

		System.out.println(mem);
		return aDao.createMember(mem);
	}

}
