package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity

public class Entregador {
	
	@Id
	@Column
	
	private int id_entregador;
	private String contato;
	private String nome;
	
	public int getId_intregador() {
		return id_entregador;
	}
	public void setId_intregador(int id_intregador) {
		this.id_entregador = id_intregador;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
