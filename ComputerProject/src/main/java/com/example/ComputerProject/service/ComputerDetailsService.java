package com.example.ComputerProject.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ComputerProject.controller.ComputerDto;
import com.example.ComputerProject.controller.ComputerUpdateDto;
import com.example.ComputerProject.repository.ComputerEntity;
import com.example.ComputerProject.repository.ComputerRepository;

@Service
public class ComputerDetailsService {
	
	
	@Autowired
	ComputerRepository computerRepository;

	//save
	public ComputerDto saveDetails(ComputerDto computerDto) {
		
		ComputerEntity entity = new ComputerEntity();
		
		entity.setId(computerDto.getId());
		entity.setModel(computerDto.getModel());
		entity.setColor(computerDto.getColor());
		entity.setProcessor(computerDto.getProcessor());
		entity.setRam(computerDto.getRam());
		entity.setPrice(computerDto.getPrice());
		computerRepository.save(entity);
		
		ComputerDto dtos = new ComputerDto();
		dtos.setId(entity.getId());
		dtos.setModel(entity.getModel());
		dtos.setColor(entity.getColor());
		dtos.setProcessor(entity.getProcessor());
		dtos.setRam(entity.getRam());
		dtos.setPrice(entity.getPrice());
		return dtos;
	}

	
	//get
	public ComputerDto getComputerById(Long id) {
	    Optional<ComputerEntity> computerOptional = computerRepository.findById(id);
	    if (computerOptional.isPresent()) {
	        ComputerEntity computerEntity = computerOptional.get();
	        
	        // Map the ComputerEntity to ComputerDto
	        ComputerDto computerDto = new ComputerDto();
	        computerDto.setId(computerEntity.getId());
	        computerDto.setColor(computerEntity.getColor());
	        computerDto.setModel(computerEntity.getModel());
	        computerDto.setPrice(computerEntity.getPrice());
	        computerDto.setRam(computerEntity.getRam());
	        computerDto.setProcessor(computerEntity.getProcessor());
	        
	        return computerDto;
	    } else {
	        throw new NoSuchElementException("Computer not found with ID: " + id);
	    }
	}

	
	//Update
	public ComputerUpdateDto updateDetails(Long id, ComputerUpdateDto updateDto) {
	    Optional<ComputerEntity> optionalEntity = computerRepository.findById(id);
	    
	    if (optionalEntity.isPresent()) {
	        ComputerEntity entity = optionalEntity.get();
	        
	        entity.setModel(updateDto.getModel());
	        entity.setColor(updateDto.getColor());
	        entity.setProcessor(updateDto.getProcessor());
	        entity.setRam(updateDto.getRam());
	        entity.setPrice(updateDto.getPrice());
	        
	        ComputerEntity updatedEntity = computerRepository.save(entity);
	        
	        ComputerUpdateDto updatedDto = new ComputerUpdateDto();
//	        updatedDto.setId(updatedEntity.getId());
	        updatedDto.setModel(updatedEntity.getModel());
	        updatedDto.setColor(updatedEntity.getColor());
	        updatedDto.setProcessor(updatedEntity.getProcessor());
	        updatedDto.setRam(updatedEntity.getRam());
	        updatedDto.setPrice(updatedEntity.getPrice());
	        
	        return updatedDto;
	    } else {
	        System.out.println("Cannot update with the given ID");
	    }
	    return updateDto;
	}


	//Delete
	public String deleteComputer(Long id) {
	    Optional<ComputerEntity> optionalEntity = computerRepository.findById(id);
	    
	    if (optionalEntity.isPresent()) {
	        ComputerEntity entity = optionalEntity.get();
	        computerRepository.delete(entity);
	        return "Successfully deleted.";
	    } else {
	        return "Computer not found.";
	    }
	}




	
	
}
