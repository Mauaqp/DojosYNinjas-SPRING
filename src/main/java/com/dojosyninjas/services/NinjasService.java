package com.dojosyninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojosyninjas.models.Ninja;
import com.dojosyninjas.repositories.NinjasRepository;

@Service
public class NinjasService {
	private final NinjasRepository ninjasRepo;
	
	public NinjasService(NinjasRepository ninjasRepo) {
		this.ninjasRepo = ninjasRepo;
	}
//	Métodos útiles
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
