package br.com.coontrol.ctrl.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.coontrol.ctrl.api.service.UtilService;

@RestController
public class UtilController {
	
	@Autowired
	UtilService utilService;
	
	@GetMapping("/fibonacci/{inicio}/{quantidade}")
	public String obterSequenciaFibonacci(@PathVariable Long inicio, @PathVariable Integer quantidade) {
		return utilService.calcularSequenciaFibonacci(inicio, quantidade);
	}	
}
