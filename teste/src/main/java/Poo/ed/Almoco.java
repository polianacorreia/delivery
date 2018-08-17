package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.annotation.Generated;
import javax.persistence.Column;

@Entity
public class Almoco implements Identificavel{
	
	@Id
	@GeneratedValue(generator="almoco_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="almoco_seq")
	private Long id;
	private String nome;
	private float preco;
	private String acompanhamentos;
	private int almoco;
	
	
	public int getAlmoco() {
		return almoco;
	}
	public void setAlmoco(int almoco) {
		this.almoco = almoco;
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

	

}
