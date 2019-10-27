package br.com.zssn.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zssn.entity.Survivor;
import br.com.zssn.repository.ISurvivorRepository;
import br.com.zssn.service.ISurvivorService;

@Service
@Transactional
public class SurvivorServiceImpl implements ISurvivorService{

	@Autowired
	ISurvivorRepository repo;
	
	
	public Survivor save(Survivor entity) {
		return this.repo.save(entity);
	}
	

	public List<Survivor> findAll() {
		return this.repo.findAll();
	}


	public void delete(Long id) {
		this.repo.deleteById(id);
	}

	public Survivor getOne(Long id) {
		return this.repo.getOne(id);
	}
}
