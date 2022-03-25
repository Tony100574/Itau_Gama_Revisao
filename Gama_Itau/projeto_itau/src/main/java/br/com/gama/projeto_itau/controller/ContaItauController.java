package br.com.gama.projeto_itau.controller;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.projeto_itau.dao.ContaItauDao;
import br.com.gama.projeto_itau.model.ContaItau;

@RestController
public class ContaItauController {
	@Autowired
	private ContaItauDao dao;
	
	@GetMapping("/clientes")
	
	// Criar um método para retornar os regisros da nossa tabela
	public ArrayList<ContaItau> recuperarTudo(){
		ArrayList<ContaItau> lista;
		lista= (ArrayList<ContaItau>)dao.findAll();
		return lista;
	}
}

