package com.prins.employee.command.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
public class CreateEmployeeRequestDto {
	
	@NotEmpty(message = "Employee name can't be null or empty")
	private String empName;
	
	@NotNull(message = "Employee code can't be null or empty")
	private String empCode;
	
	@NotNull(message = "Employee email can't be null or empty")
	private String email;
	
	@NotNull(message = "Employee phone can't be null or empty")
	private String phno;
	
	@NotEmpty(message = "Employee department can't be null or empty")
	private String department;
	

}
