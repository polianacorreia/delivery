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
			if(en.getId() == entregador.getId()) {
				en.setContato(entregador.getContato());
				en.setId(entregador.getId());
				en.setNome(entregador.getNome());
			}
		}
	}
	public void removeEntregador() {
		for (Entregador en : entregadores) {
			if(en.getId() == entregador.getId()) {
				entregadores.remove(en);
			}
		}
	}
	public void mostrarEntregador() {
		for (Entregador en : entregadores) {
			if(en.getId() == entregador.getId()) {
				System.out.println(en);
			}
		}
	}

}
