package drk.learning.doctor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	
	
	@Id
	int did;
	String name;
	String spec;
	String degree;
	String hospital = "Care Hospital";
	int fee;
	String timing;
	
	
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	 
	public int getDid() {
		System.out.println("gettor----getDid... called");
		return did;
	}
	public void setDid(int did) {
		System.out.println("settor----setDid... called");
		
		this.did = did;
	}
	public String getName() {
		System.out.println("gettor----getName... called");
		return name;
	}
	public void setName(String name) {
		System.out.println("settor----setName... called");
		
		name = name.toUpperCase();
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public String getSpec() {
		System.out.println("gettor----getSpec... called");
		return spec;
	}
	public void setSpec(String spec) {
		System.out.println("settor----setSpec... called");
		
		this.spec = spec;
	}
	public String getDegree() {
		System.out.println("gettor----getDegree... called");
		return degree;
	}
	public void setDegree(String degree) {
		System.out.println("settor----setDegree... called");
		
		this.degree = degree;
	}
	public String getHospital() {
		System.out.println("gettor----getHospital... called");
		return hospital;
	}
	public void setHospital(String hospital) {
		System.out.println("settor----setHospital... called");
		
		this.hospital = hospital;
	}
	public int getFee() {
		System.out.println("gettor----getFee... called");
		return fee;
	}
	public void setFee(int fee) {
		System.out.println("settor----setFee... called");
		
		this.fee = fee;
	}
	
	
	
	

}
