package com.example.ComputerProject.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ComputerProject.service.ComputerDetailsService;

@RequestMapping("/computer")
@RestController
public class ComputerController {

	
	@Autowired
	ComputerDetailsService computerDetailsService;
	
	
	//save 
	@PostMapping("/save-details")
	public ComputerDto saveComputerDetails(@RequestBody ComputerDto computerDto ) {
		ComputerDto dtos = computerDetailsService.saveDetails(computerDto);
		return dtos;
		
	}
	
	//Get
	@GetMapping("/get-details-by-id/{id}")
	public ResponseEntity<ComputerDto> getComputerById(@PathVariable("id") Long id) {
	    try {
	        ComputerDto computerDto = computerDetailsService.getComputerById(id);
	        return ResponseEntity.ok(computerDto);
	    } catch (NoSuchElementException e) {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	//Update
	@PutMapping("/update-details/{id}")
	public ComputerUpdateDto updateComputerDetails(@PathVariable Long id, @RequestBody ComputerUpdateDto computerUpdateDto) {
	    ComputerUpdateDto UpdateDto = computerDetailsService.updateDetails(id, computerUpdateDto);
	    return UpdateDto;
	}

	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteComputer(@PathVariable Long id) {
	    String message = computerDetailsService.deleteComputer(id);
	    return ResponseEntity.ok(message);
	}

	


}
