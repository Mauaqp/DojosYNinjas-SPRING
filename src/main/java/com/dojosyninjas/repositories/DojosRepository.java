package com.dojosyninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojosyninjas.models.Dojo;


@Repository
public interface DojosRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
	List<Dojo> findByName(String name);
}
