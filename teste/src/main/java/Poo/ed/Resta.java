package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="restaurante")

public class Resta {
	
	@Id
	@Column
	
	private int id_resta;
	private String endereco;
	private String tel;
	private String nome;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getId_resta() {
		return id_resta;
	}
	public void setId_resta(int id_resta) {
		this.id_resta = id_resta;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
