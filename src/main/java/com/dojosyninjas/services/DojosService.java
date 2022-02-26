package com.dojosyninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojosyninjas.models.Dojo;
import com.dojosyninjas.repositories.DojosRepository;

@Service
public class DojosService {
	private final DojosRepository dojosRepo;
	public DojosService(DojosRepository dojosRepo) {
		this.dojosRepo = dojosRepo;
	}
	
//	Métodos útiles
	// devuelve todos los dojos
    public List<Dojo> allDojos() {
        return dojosRepo.findAll();
    }
    // crea un dojo
    public Dojo createDojo(Dojo b) {
        return dojosRepo.save(b);
    }
    // recupera un dojo
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojosRepo.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
}
