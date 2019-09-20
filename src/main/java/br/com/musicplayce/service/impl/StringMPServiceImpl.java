package br.com.musicplayce.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.musicplayce.entity.StringMP;
import br.com.musicplayce.repository.IStringMPRepository;
import br.com.musicplayce.service.IStringMPService;

@Service
@Transactional
public class StringMPServiceImpl implements IStringMPService{

	@Autowired
	IStringMPRepository repo;
	
	
	public StringMP save(StringMP entity) {
		return this.repo.save(entity);
	}
	

	public List<StringMP> findAll() {
		return this.repo.findAll();
	}


	public void delete(Long id) {
		this.repo.deleteById(id);
	}
}
