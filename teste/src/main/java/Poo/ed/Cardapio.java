package Poo.ed;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity

public class Cardapio {
	
	@Id
	@Column
	
	private ArrayList<Bebida> bebidas;
	private ArrayList<Lanche> lanches;
	private ArrayList<Sobremesa> sobremesas;
	private ArrayList<Almoco> Almocos;
	private ArrayList<Jantar> Jantas;
	private int id_cardapio;
	
	
	public int getId_cardapio() {
		return id_cardapio;
	}
	public void setId_cardapio(int id_cardapio) {
		this.id_cardapio = id_cardapio;
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
	
	
	
	

}
