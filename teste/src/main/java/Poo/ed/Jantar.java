package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity

public class Jantar {

	@Id
	@Column

	private int idJantar;
	private String nome;
	private float preco;
	private String acompanhamentos;
	
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
	public int getIdJantar() {
		return idJantar;
	}
	public void setIdJantar(int idJantar) {
		this.idJantar = idJantar;
	}
	

	

}
