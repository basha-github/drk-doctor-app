package drk.learning.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import drk.learning.doctor.entity.Doctor;
import drk.learning.doctor.service.DoctorService;




@RestController
public  class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	
	@PostMapping("/drk/hospital/doc/add")
	public String  saveNewDoctor(@RequestBody Doctor docObj) {
		
		
		doctorService.insertNewDoctorIntoDB(docObj);
		
		return "successfully inserted into the DB";
	}
	

}
