package com.app.CovidInfo.Controller;

import java.util.*;
import com.app.CovidInfo.pojos.*;
import com.app.CovidInfo.DAO.CovidCenterDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidController {
	
	@Autowired
	private CovidCenterDao covidCenterDao;
	
	@GetMapping("/get/allCenters")
	public List<CovidCenter> getCenters() {
		return covidCenterDao.getAllCenters();
	}
	
	
	@GetMapping("get/allCenters/{pincode}")
	public List<CovidCenter> getCentersByPincode(@PathVariable String pincode) {
		return covidCenterDao.getAllCentersByPincode(pincode);
	}
	
	
	@PostMapping("/add/covidCenter")
	public String addCovidCenter(@RequestBody CovidCenter centerInfo) {
		return covidCenterDao.addCovidCenter(centerInfo);
	}
}
