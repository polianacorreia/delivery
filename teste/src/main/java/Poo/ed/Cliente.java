package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cliente implements Identificavel{
	
	@Id
	@GeneratedValue(generator="cliente_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="cliente_seq")
	private Long id;
	
	private String nome;
	private String telCliente;
	private String endereco;
	
	private String login;
	private String password;
	private String grupo;
	
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id_cliente) {
		this.id = id_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelCliente() {
		return telCliente;
	}
	public void setTelCliente(String tel_cliente) {
		this.telCliente = tel_cliente;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Cliente() {
		super();
	}
	
	public Cliente(Long id, String nome, String telCliente, String endereco, String login, String password, String grupo) {
		super();
		this.id = id;
		this.nome = nome;
		this.telCliente = telCliente;
		this.endereco = endereco;
		this.login = login;
		this.password = password;
		this.grupo = grupo;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", telCliente=" + telCliente + ", endereco=" + endereco
				+ ", login=" + login + ", password=" + password + ", grupo=" + grupo + "]";
	}

}
