package br.com.tom.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

import br.com.tom.projeto.dao.ContaDao;
import br.com.tom.projeto.model.Conta;

@RestController
public class ContaController {
	@Autowired
	private ContaDao dao;
	
	@GetMapping("/clientes")
	
	// Criar um método para retornar os regisros da nossa tabela
	public ArrayList<Conta> recuperarTudo(){
		ArrayList<Conta> lista;
		lista= (ArrayList<Conta>)dao.findAll();
		return lista;
	}
}
