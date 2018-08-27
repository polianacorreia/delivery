package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import Poo.ed.Resta;

@Named
@ViewScoped
public class RestaBean {
	
	private Resta resta = new Resta(); 
	
	private List <Resta> restaurantes = new ArrayList<>();
	
	public Resta getResta() {
		return resta;
	}
	
	public void setResta(Resta resta) {
		this.resta = resta;
	}
	
	public List<Resta> getRestaurantes() {
		return restaurantes;
	}
	
	public void addResta() {
		restaurantes.add(getResta());
		resta = new Resta();
	}
	
	public void updateResta() {
		for (Resta res : restaurantes) {
			if(res.getId() == resta.getId()) {
				res.setEndereco(resta.getEndereco());
				res.setId(resta.getId());
				res.setNome(resta.getNome());
				res.setTel(resta.getTel());
			}
		}
	}
	public void removeResta() {
		for (Resta res : restaurantes) {
			if(res.getId() == resta.getId()) {
				restaurantes.remove(res);
			}
		}
	}
	public void mostrarResta() {
		for (Resta res : restaurantes) {
			if(res.getId() == resta.getId()) {
				System.out.println(res);
			}
		}
	}

}
