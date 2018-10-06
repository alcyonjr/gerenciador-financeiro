package br.com.financas.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.financas.entities.Despesa;
import br.com.financas.repositories.DespesaRepository;

@RestController
@RequestMapping("/api/receitas")
@CrossOrigin("*")
public class ReceitaRestController {
	
	@Autowired
	private DespesaRepository despesaRepository;

	@GetMapping
	public Collection<Despesa> findDespesas() {		
		return despesaRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Long addMovie(@RequestBody Despesa despesa) {
		return despesaRepository.save(despesa).getId();
	}
}
