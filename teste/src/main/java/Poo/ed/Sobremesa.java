package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity

public class Sobremesa {

	@Id
	@Column
	
	private int idSobremesa;
	private String nome;
	private float preco;
	private String tipo;
	
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
	public int getIdSobremesa() {
		return idSobremesa;
	}
	public void setIdSobremesa(int idSobremesa) {
		this.idSobremesa = idSobremesa;
	}
	
	

}
