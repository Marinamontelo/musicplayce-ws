package br.com.musicplayce.service;

import java.util.List;

import br.com.musicplayce.entity.StringMP;

public interface IStringMPService  {

	List<StringMP> findAll();
	StringMP save(StringMP stringMP);
	void delete(Long id);



}