package com.example.ComputerProject.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "comp_table")
@Table(name = "comp_table")
@Getter
@Setter
public class ComputerEntity {
	
	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "ram")
	private String ram;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "processor")
	private String processor;

}
