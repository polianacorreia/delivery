package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity


public class Cliente {
	
	@Id
	@Column
	
	private int id_cliente;
	private String nome;
	private int tel_cliente;
	private String endereco;
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTel_cliente() {
		return tel_cliente;
	}
	public void setTel_cliente(int tel_cliente) {
		this.tel_cliente = tel_cliente;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
