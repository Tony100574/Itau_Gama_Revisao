package br.com.tom.projeto.model;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="tb_cliente")
public class Conta {

	
	@Id
	@Column(name="nome")
	private String nome;
	@Column(name ="cpf")
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column (name="email")
	private String email;
	
}
