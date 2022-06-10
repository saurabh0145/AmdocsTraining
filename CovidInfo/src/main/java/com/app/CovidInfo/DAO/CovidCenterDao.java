package com.app.CovidInfo.DAO;

import java.util.*;

import org.springframework.stereotype.Service;

import com.app.CovidInfo.pojos.*;

@Service
public class CovidCenterDao {
	
	List<CovidCenter> centerList;

	public List<CovidCenter> getAllCenters() {
		centerList = new ArrayList<>();
		
		centerList.add(new CovidCenter("Abc", "pune", "maharashtra", "411028"));
		centerList.add(new CovidCenter("Xyz", "baramati", "maharashtra", "410201"));
		centerList.add(new CovidCenter("Npm", "nashik", "maharashtra", "400102"));
		centerList.add(new CovidCenter("Mns", "amravati", "maharashtra", "419805"));
		centerList.add(new CovidCenter("Lmo", "nagpur", "maharashtra", "440203"));
		
		return centerList;
	}
	
	public List<CovidCenter> getAllCentersByPincode(String pincode) {
		List<CovidCenter> centerListByPincode = new ArrayList<>();
		
		for(CovidCenter i : centerList) {
			if(i.getPincode().equals(pincode)) {
				centerListByPincode.add(i);
			}
		}
		
		return centerListByPincode;
	}
	
	public String addCovidCenter(CovidCenter centerInfo) {
		
		centerList.add(centerInfo);
		if(centerList.contains(centerInfo))
			return "Added successfully " + centerInfo.toString();
		else
			return "Something went wrong!!";
	}
}
