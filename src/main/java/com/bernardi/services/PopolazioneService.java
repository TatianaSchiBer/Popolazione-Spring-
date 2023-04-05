package com.bernardi.services;

import java.util.List;

import com.bernardi.entities.Popolazione;

public interface PopolazioneService {
	
	
	List<Popolazione>getPopolazineItalia();
	
	List<Popolazione>getPopolazioneByRegione(String regione);
	
	Popolazione getPopolazioneById(int id);
	
	Popolazione getPopolazioneByComune(String comune);
	


}
