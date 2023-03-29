package com.klinnovations.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee_Details")
public class Employee {
	
	@Id
	private Integer empId;
	private String empName;
	private Double empsalary;
	private String empgender;
	private String dept;

}
