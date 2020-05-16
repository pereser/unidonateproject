package br.unibh.unidonate.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ong implements Serializable{ 

	public Set<Donate> getDonates() {
		return donates;
	}

	public void setDonates(Set<Donate> donates) {
		this.donates = donates;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	public Ong() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(nullable = false)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private Long cnpj;

	@Column(nullable = false)
	private String endereco;

	@Column(nullable = false)
	private Long telefone;

	@Column(nullable = false)
	private String email;
	
	@OneToMany(mappedBy = "ong")
	private Set<Donate> donates;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

}
