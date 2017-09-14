package com.bcj.DmvPublicRecords.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bcj.DmvPublicRecords.model.DriverRecords;
import com.bcj.DmvPublicRecords.service.DmvRecordService;


 
/**
 * @author sridhar
 *
 */
@RestController
public class DmvController {

	final static Logger logger = Logger.getLogger(DmvController.class);

	@Autowired
	DmvRecordService dmvsrvc;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<DriverRecords> addDriverRecord(@RequestBody DriverRecords driverRecord) {
		dmvsrvc.save(driverRecord);
		logger.debug("Added:: " + driverRecord);
		return new ResponseEntity<DriverRecords>(driverRecord, HttpStatus.CREATED);
	}


	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> updateEmployee(@RequestBody DriverRecords driverRecord) {
		DriverRecords existingEmp = dmvsrvc.getById(driverRecord.getId());
		if (existingEmp == null) {
			logger.debug("driverRecord with id " + driverRecord.getId() + " does not exists");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			dmvsrvc.save(driverRecord);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<DriverRecords> getEmployee(@PathVariable("id") Long id) {
		DriverRecords driverRecord = dmvsrvc.getById(id);
		if (driverRecord == null) {
			logger.debug("driverRecord with id " + id + " does not exists");
			return new ResponseEntity<DriverRecords>(HttpStatus.NOT_FOUND);
		}
		logger.debug("Found driverRecord:: " + driverRecord);
		return new ResponseEntity<DriverRecords>(driverRecord, HttpStatus.OK);
	}


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<DriverRecords>> getAllEmployees() {
		List<DriverRecords> driverRecords = dmvsrvc.getAll();
		if (driverRecords.isEmpty()) {
			logger.debug("driverRecords does not exists");
			return new ResponseEntity<List<DriverRecords>>(HttpStatus.NO_CONTENT);
		}
		logger.debug("Found " + driverRecords.size() + " driverRecords");
		logger.debug(Arrays.toString(driverRecords.toArray()));
		return new ResponseEntity<List<DriverRecords>>(driverRecords, HttpStatus.OK);
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Long id) {
		DriverRecords driverRecord = dmvsrvc.getById(id);
		if (driverRecord == null) {
			logger.debug("driverRecord with id " + id + " does not exists");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			dmvsrvc.delete(id);
			logger.debug("driverRecord with id " + id + " deleted");
			return new ResponseEntity<Void>(HttpStatus.GONE);
		}
	}

}
