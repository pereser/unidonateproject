package br.unibh.unidonate.entities;

import javax.persistence.*;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "telefone")
	private Long telefone;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "cpf")
	private Long cpf;
	
	
	public Usuario() {
		
		
	}


	public Usuario(Long id, Long telefone, String nome, String email, String senha, Long cpf) {
		super();
		this.id = id;
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getTelefone() {
		return telefone;
	}


	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Long getCpf() {
		return cpf;
	}


	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	

}
