package com.bridgelabcfp.SpringBootP.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
public class ModelDemo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empID;
	private String firstName;
	private String lastName;
	private int salary;
	
	
	public ModelDemo(ModelDemo model) {
		this.firstName=model.getFirstName();
		this.lastName=model.getLastName();
		this.salary=model.getSalary();
	}

	
	
	
	
	

	
}
