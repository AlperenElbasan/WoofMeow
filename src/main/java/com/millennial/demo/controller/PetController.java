package com.millennial.demo.controller;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.millennial.demo.domain.Pet;
import com.millennial.demo.repository.PetRepository;

@RestController
@RequestMapping("/pets")
public class PetController {
	
	@Autowired
	private PetRepository petRepository;
	
	@GetMapping
	public List<Pet> listPets() {
		return petRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Pet getPet(@PathVariable Integer id) {
		return petRepository.findById(id).orElse(null);
	}
	
	@PutMapping("/{id}")
	public Pet updatePet(@PathVariable Integer id, @RequestBody Pet updatedData) {
		Pet pet = petRepository.findById(id).orElse(null);
		if (pet == null)
			throw new Exception();
		
		
	}
	
	@PostMapping
	public Pet insertPet(@RequestBody Pet newPet) {
		newPet.setCreatedAt(Date.from(Instant.now()));
		return petRepository.save(newPet);
	}
}
