package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import Poo.ed.Garcom;

@Named
@ViewScoped
public class GarcomBean {
	
	private Garcom garcom = new Garcom(); 
	
	private List <Garcom> garcons = new ArrayList<>();
	
	public Garcom getGarcom() {
		return garcom;
	}
	
	public void setGarcom(Garcom garcom) {
		this.garcom = garcom;
	}
	
	public List<Garcom> getGarcons() {
		return garcons;
	}
	
	public void addGarcom() {
		garcons.add(getGarcom());
		garcom = new Garcom();
	}
	
	public void updateBebida() {
		for (Garcom gar : garcons) {
			if(gar.getId_garcom() == garcom.getId_garcom()) {
				gar.setId_garcom(garcom.getId_garcom());
				gar.setNome(garcom.getNome());
			}
		}
	}
	public void removeGarcom() {
		for (Garcom gar : garcons) {
			if(gar.getId_garcom() == garcom.getId_garcom()) {
				garcons.remove(gar);
			}
		}
	}
	public void mostrarGarcom() {
		for (Garcom gar : garcons) {
			if(gar.getId_garcom() == garcom.getId_garcom()) {
				System.out.println(gar);
			}
		}
	}

}
