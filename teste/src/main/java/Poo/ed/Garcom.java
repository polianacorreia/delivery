package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Garcom implements Identificavel{
	
	@Id
	@GeneratedValue(generator="garcom_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="garcom_seq")
	private Long id;
	
	private String nome;
	
	//Get e Set
	
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
	
	public Garcom() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Garcom(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Garcom [id=" + id + ", nome=" + nome + "]";
	}

}
