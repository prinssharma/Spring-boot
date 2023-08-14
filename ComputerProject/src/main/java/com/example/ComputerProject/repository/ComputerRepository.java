package com.example.ComputerProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.ComputerProject.controller.ComputerDto;

@Repository
public interface ComputerRepository extends JpaRepository<ComputerEntity, ID>{

	Optional<ComputerEntity> findById(Long id);

}
