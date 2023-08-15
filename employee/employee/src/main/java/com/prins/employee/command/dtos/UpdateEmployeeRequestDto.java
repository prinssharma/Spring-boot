package com.prins.employee.command.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UpdateEmployeeRequestDto {

	private String empName;
	
	private String email;
	
	private String phno;
	
	private String department;
	
}
