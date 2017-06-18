package com.bcj.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.soap.dao.EmployeeDao;
import com.bcj.soap.model.Employee;


@Service @WebService(endpointInterface="com.bcj.soap.service.EmployeeService")
public class EmployeeImpl implements EmployeeService {
/*	EmployeeDao dao= new EmployeeDao();*/
	@Autowired
	EmployeeDao dao;

	
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}
	@WebMethod
	public int add(int i, int j) {
		
		return i+j;
	}
	 @WebMethod
	public int addEmployee(Employee emp) {
		
		return dao.addEmployee(emp);
		
		
		
	}

}
