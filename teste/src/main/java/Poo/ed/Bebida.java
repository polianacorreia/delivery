package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Bebida implements Identificavel{

	@Id
	@GeneratedValue(generator="bebida_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="bebida_seq")
	private Long id;
	
	private String nome;
	private String tipo;
	private String marca;
	private float preco;
	
	//Get e Set
	
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	//Construtor
	
	public Bebida() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bebida(Long id, int id_bebida, String nome, String tipo, String marca, float preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Bebida [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", marca=" + marca + ", preco=" + preco + "]";
	}
	
}
