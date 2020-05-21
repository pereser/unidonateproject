package br.unibh.unidonate.entities;
import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Donate implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Doacao")
	private int id;

	@Column(name = "donateType")
	private String donateType;

	@Column(name = "qtd")
	private int qtd;

	@Column(name = "descricao")
	private String descricao;

	@ManyToOne
	private Ong ong;
	
	public Donate() {
		
	}

	public Donate(int id, String donateType, int qtd, String descricao, Ong ong) {
		super();
		this.id = id;
		this.donateType = donateType;
		this.qtd = qtd;
		this.descricao = descricao;
		this.ong = ong;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDonateType() {
		return donateType;
	}

	public void setDonateType(String donateType) {
		this.donateType = donateType;
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

	public Ong getOng() {
		return ong;
	}

	public void setOng(Ong ong) {
		this.ong = ong;
	}

	
}