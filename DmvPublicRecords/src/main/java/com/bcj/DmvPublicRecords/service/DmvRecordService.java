package com.bcj.DmvPublicRecords.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.DmvPublicRecords.dao.DmvRecordsDao;
import com.bcj.DmvPublicRecords.model.DriverRecords;

/**
 * @author sridhar
 *
 */
@Service
public class DmvRecordService  {

	@Autowired
	private DmvRecordsDao dmvRecordsDao;

	public DriverRecords save(DriverRecords entity) {
		return dmvRecordsDao.save(entity);
	}

	public DriverRecords getById(Serializable id) {
		return dmvRecordsDao.findOne((Long) id);
	}

	public List<DriverRecords> getAll() {
		return dmvRecordsDao.findAll();
	}


	public void delete(Serializable id) {
		dmvRecordsDao.delete((Long) id);
	}

}
