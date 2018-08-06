package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity

public class Lanche {

	@Id
	@Column

	private int id_lanche;
	private String tipo;
	private float preco;
	private String nome;
	
	
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
	public int getId_lanche() {
		return id_lanche;
	}
	public void setId_lanche(int id_lanche) {
		this.id_lanche = id_lanche;
	}
	
	

}
