package br.com.gama.projeto_itau.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class ContaItau {

	
	@Id
	
	
	@Column(name="id_cliente")
	private String aid_cliente;
	
	@Column(name ="nome_cliente")
	private String nome_cliente;
	
	@Column(name ="idade_cliente")
	private String idade_cliente;
	
	@Column(name ="email_cliente")
	private String email_cliente;
	
	@Column(name ="cpf_cliente")
	private String cpf_cliente;

	public String getAid_cliente() {
		return aid_cliente;
	}

	public void setAid_cliente(String aid_cliente) {
		this.aid_cliente = aid_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getIdade_cliente() {
		return idade_cliente;
	}

	public void setIdade_cliente(String idade_cliente) {
		this.idade_cliente = idade_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}
	
		
	
	
	
	}
