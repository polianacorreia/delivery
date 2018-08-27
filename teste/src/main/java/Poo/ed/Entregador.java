package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Entregador {
	
	@Id
	@GeneratedValue(generator="entregador_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="entregador_seq")
	private Long id;
	
	private String contato;
	private String nome;
	
	//Get e Set

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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//Construtor
	
	public Entregador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Entregador(Long id, String contato, String nome) {
		super();
		this.id = id;
		this.contato = contato;
		this.nome = nome;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Entregador [id=" + id + ", contato=" + contato + ", nome=" + nome + "]";
	}
	
}
