package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import Poo.ed.Sobremesa;

@Named
@ViewScoped
public class SobremesaBean {
	
	private Sobremesa sobremesa = new Sobremesa(); 
	
	private List <Sobremesa> sobremesas = new ArrayList<>();
	
	public Sobremesa getSobremesa() {
		return sobremesa;
	}
	
	public void setSobremesa(Sobremesa sobremesa) {
		this.sobremesa = sobremesa;
	}
	
	public List<Sobremesa> getSobremesas() {
		return sobremesas;
	}
	
	public void addSobremesa() {
		sobremesas.add(getSobremesa());
		sobremesa = new Sobremesa();
	}
	
	public void updateSobremesa() {
		for (Sobremesa sob : sobremesas) {
			if(sob.getId() == sobremesa.getId()) {
				sob.setId(sobremesa.getId());
				sob.setNome(sobremesa.getNome());
				sob.setPreco(sobremesa.getPreco());
				sob.setTipo(sobremesa.getTipo());
			}
		}
	}
	public void removeSobremesa() {
		for (Sobremesa sob : sobremesas) {
			if(sob.getId() == sobremesa.getId()) {
				sobremesas.remove(sob);
			}
		}
	}
	public void mostrarSobremesa() {
		for (Sobremesa sob : sobremesas) {
			if(sob.getId() == sobremesa.getId()) {
				System.out.println(sob);
			}
		}
	}

}
