package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Sobremesa implements Identificavel{

	@Id
	@GeneratedValue(generator="sobremesa_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="sobremesa_seq")
	private Long id;
	
	private String nome;
	private float preco;
	private String tipo;
	
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//Construtor
	
	public Sobremesa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sobremesa(Long id, String nome, float preco, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Sobremesa [id=" + id + ", nome=" + nome + ", preco=" + preco + ", tipo=" + tipo + "]";
	}
	
}
