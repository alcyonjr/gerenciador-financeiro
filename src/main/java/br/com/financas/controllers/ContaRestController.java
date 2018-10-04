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

import br.com.financas.entities.Conta;
import br.com.financas.repositories.ContaRepository;


@RestController
@RequestMapping("/api/contas")
@CrossOrigin("*")
public class ContaRestController {

	@Autowired
	private ContaRepository contaRepository;

	@GetMapping
	public Collection<Conta> findMovies() {		
		return contaRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Long addMovie(@RequestBody Conta conta) {
		return contaRepository.save(conta).getId();
	}
	
}
