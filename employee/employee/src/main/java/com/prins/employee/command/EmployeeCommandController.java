package com.prins.employee.command;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prins.employee.command.dtos.CreateEmployeeDtoCommand;
import com.prins.employee.command.dtos.CreateEmployeeRequestDto;

@RestController
@RequestMapping("/api/employee")
public class EmployeeCommandController {
	
	public ResponseEntity<?> saveEmployeeDetails(@RequestBody @Validated CreateEmployeeRequestDto requestDto){
		CreateEmployeeDtoCommand dtoCommand = Employee.Mapper.createEmployeeRequestDtoToCreateEmployeeDtoCommand(requestDto);
		
		return null;
		
	}

}
