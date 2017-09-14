package com.bcj.CustomerServer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcj.CustomerServer.model.Customer;




@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {

}
