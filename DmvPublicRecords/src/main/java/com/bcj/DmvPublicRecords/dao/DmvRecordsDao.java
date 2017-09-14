package com.bcj.DmvPublicRecords.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcj.DmvPublicRecords.model.DriverRecords;


@Repository
public interface DmvRecordsDao extends JpaRepository<DriverRecords, Long> {

}
