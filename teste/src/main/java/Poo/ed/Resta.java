package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name="restaurante")

public class Resta implements Identificavel{
	
	@Id
	@GeneratedValue(generator="resta_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="resta_seq")
	private Long id;
	
	private String login;
	private String password;
	private String grupo;
	
	private String endereco;
	private String tel;
	private String nome;
	
	//Get e Set
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	//Construtor
	
	public Resta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Resta(Long id, String login, String password, String grupo, String endereco, String tel, String nome) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.grupo = grupo;
		this.endereco = endereco;
		this.tel = tel;
		this.nome = nome;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Resta [id=" + id + ", login=" + login + ", password=" + password + ", grupo=" + grupo + ", endereco="
				+ endereco + ", tel=" + tel + ", nome=" + nome + "]";
	}
	
}
