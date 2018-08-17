package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import Poo.ed.Entregador;

@Named
@ViewScoped
public class EntregadorBean {
	
	private Entregador entregador = new Entregador(); 
	
	private List <Entregador> entregadores = new ArrayList<>();
	
	public Entregador getEntregador() {
		return entregador;
	}
	
	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}
	
	public List<Entregador> getEntregadores() {
		return entregadores;
	}
	
	public void addEntregador() {
		entregadores.add(getEntregador());
		entregador = new Entregador();
	}
	
	public void updateEntregador() {
		for (Entregador en : entregadores) {
			if(en.getId_intregador() == entregador.getId_intregador()) {
				en.setContato(entregador.getContato());
				en.setId_intregador(entregador.getId_intregador());
				en.setNome(entregador.getNome());
			}
		}
	}
	public void removeEntregador() {
		for (Entregador en : entregadores) {
			if(en.getId_intregador() == entregador.getId_intregador()) {
				entregadores.remove(en);
			}
		}
	}
	public void mostrarEntregador() {
		for (Entregador en : entregadores) {
			if(en.getId_intregador() == entregador.getId_intregador()) {
				System.out.println(en);
			}
		}
	}

}
