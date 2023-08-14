package com.example.ComputerProject.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ComputerUpdateDto {

	
	private String model;
	
	private String ram;
	
	private String color;
	
	private String price;
	
	private String processor;
}
