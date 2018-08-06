package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity

public class Garcom {
	
	@Id
	@Column
	
	private int id_garcom;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId_garcom() {
		return id_garcom;
	}
	public void setId_garcom(int id_garcom) {
		this.id_garcom = id_garcom;
	}
	

}
