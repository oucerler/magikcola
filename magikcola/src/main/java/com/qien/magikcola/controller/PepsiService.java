package com.qien.magikcola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qien.magikcola.domein.Pepsi;

@Service
@Transactional
public class PepsiService {
	@Autowired
	PepsiRepository pepsiRepository;
	
	public Iterable<Pepsi> maaktNietUit(){
		return pepsiRepository.findAll();
	}
}
