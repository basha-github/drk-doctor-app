package drk.learning.doctor.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import drk.learning.doctor.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor,Integer>{

}
