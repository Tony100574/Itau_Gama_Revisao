package br.com.tom.projeto.dao;
import org.springframework.data.repository.CrudRepository;

import br.com.tom.projeto.model.Conta;

public interface ContaDao extends CrudRepository<Conta,Integer>{

}
