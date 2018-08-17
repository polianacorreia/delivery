package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

import Poo.ed.Bebida;

@Named
@ApplicationScoped
public class BebidaBean {
	
	private Bebida bebida = new Bebida(); 
	
	private List <Bebida> bebidas = new ArrayList<>();
	
	public Bebida getBebida() {
		return bebida;
	}
	
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public List<Bebida> getBebidas() {
		return bebidas;
	}
	
	public void addBebida() {
		bebidas.add(getBebida());
		bebida = new Bebida();
	}
	
	public void updateBebida() {
		for (Bebida beb : bebidas) {
			if(beb.getId_bebida() == bebida.getId_bebida()) {
				beb.setMarca(bebida.getMarca());
				beb.setId_bebida(bebida.getId_bebida());
				beb.setNome(bebida.getNome());
				beb.setPreco(bebida.getPreco());
				beb.setTipo(bebida.getTipo());
			}
		}
	}
	public void removeBebida() {
		for (Bebida beb : bebidas) {
			if(beb.getId_bebida() == bebida.getId_bebida()) {
				bebidas.remove(beb);
			}
		}
	}
	public void mostrarBebida() {
		for (Bebida beb : bebidas) {
			if(beb.getId_bebida() == bebida.getId_bebida()) {
				System.out.println(beb);
			}
		}
	}

}
