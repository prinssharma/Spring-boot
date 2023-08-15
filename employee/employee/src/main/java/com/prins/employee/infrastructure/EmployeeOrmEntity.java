package com.prins.employee.infrastructure;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "emp_table")
@Table(name = "emp_table")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeOrmEntity {

	@Column(name = "emp_name")
	private String empName;
	
	@Id
	@Column(name = "emp_code")
	private String empCode;
	
	@Column(name = "emp_email")
	private String email;
	
	@Column(name = "emp_phno")
	private String phno;
	
	@Column(name = "emp_department")
	private String department;
}
