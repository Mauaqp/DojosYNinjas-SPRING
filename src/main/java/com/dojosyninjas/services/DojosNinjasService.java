package com.dojosyninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojosyninjas.models.Dojo;
import com.dojosyninjas.models.Ninja;
import com.dojosyninjas.repositories.DojosRepository;
import com.dojosyninjas.repositories.NinjasRepository;

@Service
public class DojosNinjasService {
	private final NinjasRepository ninjasRepo;
	private final DojosRepository dojosRepo;
	
	public DojosNinjasService (NinjasRepository ninjasRepo, DojosRepository dojosRepo) {
		this.ninjasRepo = ninjasRepo;
		this.dojosRepo = dojosRepo;
	}
	
//	Métodos DOJO
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

//	Métodos NINJAS
	// devuelve todos los ninjas
    public List<Ninja> allNinjas() {
        return ninjasRepo.findAll();
    }
    // crea un ninja
    public Ninja createNinja(Ninja b) {
        return ninjasRepo.save(b);
    }
    // recupera un ninja
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjasRepo.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }	
}
