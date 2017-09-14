package com.bcj.HealthInsurance.service;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.bcj.HealthInsurance.dao.MemberDao;
import com.bcj.HealthInsurance.model.Member;

/**
 * Session Bean implementation class MemberService
 */
/*@Stateless(name="MemberService")
@LocalBean*/
public class MemberService {

   
 /*  @EJB*/ MemberDao memDao= new MemberDao();
    
    
    
    

	public void setMemDao(MemberDao memDao) {
		this.memDao = memDao;
	}





	public void saveMember(Member mem) {
		
	memDao.saveMember(mem);
		
		
	}

}
