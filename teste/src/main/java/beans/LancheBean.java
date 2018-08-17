package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import Poo.ed.*;

@Named
@ViewScoped
public class LancheBean {
	
	private Lanche lanche = new Lanche(); 
	
	private List <Lanche> lanches = new ArrayList<>();
	
	public Lanche getLanche() {
		return lanche;
	}
	
	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}
	
	public List<Lanche> getLanches() {
		return lanches;
	}
	
	public void addLanche() {
		lanches.add(getLanche());
		lanche = new Lanche();
	}
	
	public void updateLanche() {
		for (Lanche lan : lanches) {
			if(lan.getId_lanche() == lanche.getId_lanche()) {
				lan.setNome(lanche.getNome());
			}
		}
	}
	public void removeLanche() {
		for (Lanche lan : lanches) {
			if(lan.getId_lanche() == lanche.getId_lanche()) {
				lanches.remove(lan);
			}
		}
	}
	public void mostrarLanche() {
		for (Lanche lan : lanches) {
			if(lan.getId_lanche() == lanche.getId_lanche()) {
				System.out.println(lan);
			}
		}
	}

}
