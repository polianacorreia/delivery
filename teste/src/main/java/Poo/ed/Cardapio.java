package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import java.util.ArrayList;

@Entity
public class Cardapio implements Identificavel {
	
	@Id
	@GeneratedValue(generator="cardapio_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="cardapio_seq")
	private Long id;
	
	private ArrayList<Bebida> bebidas;
	private ArrayList<Lanche> lanches;
	private ArrayList<Sobremesa> sobremesas;
	private ArrayList<Almoco> Almocos;
	private ArrayList<Jantar> Jantas;	
	
	//Get e Set
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	public ArrayList<Bebida> getBebidas() {
		return bebidas;
	}
	public void setBebidas(ArrayList<Bebida> bebidas) {
		this.bebidas = bebidas;
	}
	public ArrayList<Lanche> getLanches() {
		return lanches;
	}
	public void setLanches(ArrayList<Lanche> lanches) {
		this.lanches = lanches;
	}
	public ArrayList<Sobremesa> getSobremesas() {
		return sobremesas;
	}
	public void setSobremesas(ArrayList<Sobremesa> sobremesas) {
		this.sobremesas = sobremesas;
	}
	public ArrayList<Almoco> getAlmocos() {
		return Almocos;
	}
	public void setAlmocos(ArrayList<Almoco> almocos) {
		Almocos = almocos;
	}
	public ArrayList<Jantar> getJantas() {
		return Jantas;
	}
	public void setJantas(ArrayList<Jantar> jantas) {
		Jantas = jantas;
	}
	
	//Construtor
	
	public Cardapio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cardapio(Long id, ArrayList<Bebida> bebidas, ArrayList<Lanche> lanches, ArrayList<Sobremesa> sobremesas,
			ArrayList<Almoco> almocos, ArrayList<Jantar> jantas, int id_cardapio) {
		super();
		this.id = id;
		this.bebidas = bebidas;
		this.lanches = lanches;
		this.sobremesas = sobremesas;
		Almocos = almocos;
		Jantas = jantas;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Cardapio [id=" + id + ", bebidas=" + bebidas + ", lanches=" + lanches + ", sobremesas=" + sobremesas
				+ ", Almocos=" + Almocos + ", Jantas=" + Jantas + "]";
	}
}
