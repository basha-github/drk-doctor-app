package drk.learning.doctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drk.learning.doctor.entity.Doctor;
import drk.learning.doctor.repo.DoctorRepo;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepo  doctorRepo;

	public void insertNewDoctorIntoDB(Doctor docObj) {
		
		doctorRepo.save(docObj);
		
	}

}
