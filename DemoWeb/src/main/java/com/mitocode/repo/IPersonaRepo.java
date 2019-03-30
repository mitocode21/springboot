package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	
}
