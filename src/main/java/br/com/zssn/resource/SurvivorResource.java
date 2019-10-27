package br.com.zssn.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zssn.entity.Survivor;
import br.com.zssn.service.ISurvivorService;

@RestController
@RequestMapping("survivors")
public class SurvivorResource {

	@Autowired
	ISurvivorService service;
	
	
	@GetMapping
	public List<Survivor> findAll() {		
		return this.service.findAll();
	}
	
	@PostMapping(path="/update")
	public Survivor updateLastLocation(@RequestBody Survivor entity) {	
		Survivor survivor = this.service.getOne(entity.getId());
		return this.service.(entity);
	}
	
	@PostMapping
	public Survivor save(@RequestBody Survivor entity ) {		
		return this.service.save(entity);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void delete(@PathVariable("id") Long id ) {		
		this.service.delete(id);
	}	
	
	
}
