package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Jantar {

	@Id
	@GeneratedValue(generator="jantar_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="jantar_seq")
	private Long id;
	
	private String nome;
	private float preco;
	private String acompanhamentos;
	
	//Get e Set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getAcompanhamentos() {
		return acompanhamentos;
	}
	public void setAcompanhamentos(String acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//Construtor
	
	public Jantar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Jantar(Long id, String nome, float preco, String acompanhamentos) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.acompanhamentos = acompanhamentos;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Jantar [id=" + id + ", nome=" + nome + ", preco=" + preco + ", acompanhamentos=" + acompanhamentos
				+ "]";
	}
	
}
