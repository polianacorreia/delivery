package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity

public class Almoco {
	
	@Id
	@Column
	
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id_almoco) {
		this.id = id_almoco;
	}

	

}
