package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Lanche {

	@Id
	@GeneratedValue(generator="lanche_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="lanche_seq")
	private Long id;
	
	private String tipo;
	private float preco;
	private String nome;
	
	//Get e Set
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//Construtor
	
	public Lanche() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lanche(Long id, String tipo, float preco, String nome) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.preco = preco;
		this.nome = nome;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Lanche [id=" + id + ", tipo=" + tipo + ", preco=" + preco + ", nome=" + nome + "]";
	}

}
