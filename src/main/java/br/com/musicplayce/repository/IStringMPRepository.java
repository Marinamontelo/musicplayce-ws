package br.com.musicplayce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.musicplayce.entity.StringMP;

@Repository
public interface IStringMPRepository extends JpaRepository<StringMP, Long> {

	
	
}
