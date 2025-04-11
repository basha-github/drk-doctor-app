package drk.learning.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*
 * 
 * {
  "did":778899,
  "name":"Sarojini",
  "degree":"MD",
  "fee":1500,
  "hospital":"KIMS",
  "timing":"9 A.M - 4 P.M"
}


URL::::http://localhost:8080/drk/hospital/doc/add
method::::POST
 */
@SpringBootApplication
public class DoctorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorAppApplication.class, args);
	}

}
