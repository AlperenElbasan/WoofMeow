package com.millennial.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.millennial.demo.domain.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{
}
