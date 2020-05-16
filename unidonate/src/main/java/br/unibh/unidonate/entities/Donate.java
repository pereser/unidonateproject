package br.unibh.unidonate.entities;
import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Donate implements Serializable {

	private static final long serialVersionUID = 1L;

	public Donate() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Doacao")
	private int id;

	@Column(nullable = false)
	private String DonateType;

	@ManyToOne
	private Ong ong;

	@Column(nullable = false)
	private int qtd;

	@Column(nullable = false)
	private String descricao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDonateType() {
		return DonateType;
	}

	public void setDonateType(String donateType) {
		DonateType = donateType;
	}

	public Ong getOng() {
		return ong;
	}

	public void setOng(Ong ong) {
		this.ong = ong;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}