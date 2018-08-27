package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Cidade {
	
	@Id
	@GeneratedValue(generator="cidade_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="cidade_seq")
	private Long id;
	
	private String nome;
	private String cep;
	
	//Get e Set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//Construtor
	
	public Cidade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cidade(Long id, String nome, String cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.cep = cep;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Cidade [id=" + id + ", nome=" + nome + ", cep=" + cep + "]";
	}
	
	
	

}
