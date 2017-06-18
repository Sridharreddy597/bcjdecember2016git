package com.bcj.restspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcj.restspringboot.model.Customer;


@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {

}
