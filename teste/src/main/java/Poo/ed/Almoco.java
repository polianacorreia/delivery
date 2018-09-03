package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Almoco implements Identificavel{
	
	@Id
	@GeneratedValue(generator="almoco_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="almoco_seq")
	private Long id;
	
	private String nome;
	private float preco;
	private String acompanhamentos;
	private int quantAlmoco;
	
	//Get e Set
	
	public int getQuantAlmoco() {
		return quantAlmoco;
	}
	public void setQuantAlmoco(int quantAlmoco) {
		this.quantAlmoco = quantAlmoco;
	}
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
	public void setId(Long id_almoco) {
		this.id = id_almoco;
	}
	
	//Construtor
	
	public Almoco() {
		super();
	}
	
	public Almoco(Long id, String nome, float preco, String acompanhamentos, int quantAlmoco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.acompanhamentos = acompanhamentos;
		this.quantAlmoco = quantAlmoco;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Almoco [id=" + id + ", nome=" + nome + ", preco=" + preco + ", acompanhamentos=" + acompanhamentos
				+ ", quantAlmoco=" + quantAlmoco + "]";
	}

}
