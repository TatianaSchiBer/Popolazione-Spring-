package com.bernardi.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bernardi.entities.Popolazione;
import com.bernardi.services.PopolazioneService;

@RestController
@RequestMapping("api")
public class PopolazioneREST {
	
	@Autowired
	private PopolazioneService service;
	
	@GetMapping("all")
	List<Popolazione>getPopolazioneItalia() {
		return service.getPopolazineItalia();
	}
	

	@GetMapping("popolazione/{regione}")
	List<Popolazione> getPopolazioneByRegione(@PathVariable String regione) {
		return service.getPopolazioneByRegione(regione);
	
}	
	@GetMapping("id/{id}")
	Popolazione getPopolazioneById(@PathVariable int id) {
		return service.getPopolazioneById(id);
	}
	
	@GetMapping("comune/{comune}")
	Popolazione getPopolazioneByComune(@PathVariable String comune) {
		return service.getPopolazioneByComune(comune);
	}
	
	
}
