package br.com.zssn.service;

import java.util.List;

import br.com.zssn.entity.Survivor;

public interface ISurvivorService  {

	List<Survivor> findAll();
	Survivor getOne(Long id);
	Survivor save(Survivor stringMP);
	void delete(Long id);



}