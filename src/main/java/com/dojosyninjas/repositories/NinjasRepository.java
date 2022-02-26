package com.dojosyninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojosyninjas.models.Ninja;


@Repository
public interface NinjasRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}
