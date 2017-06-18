package com.bcj.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.bcj.soap.model.Employee;

@WebService
public interface EmployeeService {
	@WebMethod
	public int add(int i,int j);
	
		@WebMethod
	public int addEmployee(Employee emp);
}
