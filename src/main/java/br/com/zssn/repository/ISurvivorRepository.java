package br.com.zssn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zssn.entity.Survivor;

@Repository
public interface ISurvivorRepository extends JpaRepository<Survivor, Long> {

	
	
}
