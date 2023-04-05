package com.bernardi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bernardi.entities.Popolazione;
import com.bernardi.repos.PopolazioneDAO;
@Service
public class PopolazioneServiceImpl implements PopolazioneService {
	
	@Autowired
	PopolazioneDAO dao;

	@Override
	public List<Popolazione> getPopolazineItalia() {
		return dao.findAll();
	}

	@Override
	public List<Popolazione> getPopolazioneByRegione(String regione) {
		return dao.findByRegione(regione);
	}

	@Override
	public Popolazione getPopolazioneById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public Popolazione getPopolazioneByComune(String comune) {
		return dao.findByComune(comune);
	}


	
}
