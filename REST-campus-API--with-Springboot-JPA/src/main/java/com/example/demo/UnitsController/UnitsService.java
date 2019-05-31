package com.example.demo.UnitsController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitsService {
	
	@Autowired
	private UnitsRepository unitsrepository;
	

	
	//-----------------------------------------------------------------------------------------
	
	public List<Units> getAllUnits(){
		List <Units> unt=new ArrayList<>();
		unitsrepository.findAll().forEach(unt::add);
		return unt;
		 
	}
	
	//------------------------------------------------------------------------------------------
	public Units getUnit(String id) {
		
		return unitsrepository.findById(id).orElse(null);
		
		
	}

	public void addUnit(Units unt) {
		unitsrepository.save(unt);
		
	}

	public void UpdateUnit(String id, Units unt) {

		unitsrepository.save(unt);
	}

	public void deletingUnit(String id) {
		
		unitsrepository.deleteById(id);
				
	}

}
