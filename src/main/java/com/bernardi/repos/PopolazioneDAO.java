package com.bernardi.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bernardi.entities.Popolazione;

@Repository
public interface PopolazioneDAO extends JpaRepository<Popolazione, Integer> {
	
	List<Popolazione>findByRegione(String regione);

	Popolazione findByComune(String comune);
	
	
	
	

}
