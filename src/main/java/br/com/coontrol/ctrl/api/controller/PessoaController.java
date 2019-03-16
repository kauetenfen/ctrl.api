package br.com.coontrol.ctrl.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.coontrol.ctrl.api.model.Pessoa;
import br.com.coontrol.ctrl.api.repository.PessoaRepository;
import br.com.coontrol.ctrl.api.service.PessoaService;

@RestController
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@Autowired
	PessoaService pessoaService;
	
	@GetMapping("/pessoas")
	public Page<Pessoa> getPessoas(Pageable pageable) {
		return pessoaRepository.findAll(pageable);
	}
	
	@PostMapping("/pessoas")
	public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
		pessoaService.inserirSignoPessoa(pessoa);
		return pessoaRepository.save(pessoa);
	}
}
