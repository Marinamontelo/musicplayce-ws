package br.com.musicplayce.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.musicplayce.entity.StringMP;
import br.com.musicplayce.service.IStringMPService;

@RestController
@RequestMapping("string-mp")
public class StringMPResource {

	@Autowired
	IStringMPService service;
	
	
	@GetMapping
	public List<StringMP> findAll() {		
		return this.service.findAll();
	}
	
	@PostMapping
	public StringMP save(@RequestBody StringMP stringMP ) {		
		return this.service.save(stringMP);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void delete(@PathVariable("id") Long id ) {		
		this.service.delete(id);
	}
	
	
	
}
