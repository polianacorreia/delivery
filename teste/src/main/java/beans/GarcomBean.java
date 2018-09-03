package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Poo.ed.Almoco;
import Poo.ed.Garcom;
import services.AlmocoService;
import services.GarcomService;

@Named
@ViewScoped
public class GarcomBean implements Serializable {
	
	@Inject
	private GarcomService servico;	
	
	private Garcom garcom; 
	
	private Collection<Garcom> garcons;
	
	public Collection<Garcom> getGarcons() {
		return garcons;
	}
	
	public GarcomService getServico() {
		return servico;
	}

	public Garcom getEntidade() {
		return garcom;
	}

	public void setEntidade(Garcom entidade) {
		this.garcom = entidade;
	}

	public void setGarsons(Collection<Garcom> garcons) {
		this.garcons = garcons;
	}

	@PostConstruct
	public void init() {
		garcom = newEntidade();
		garcons = getServico().getAll();
	}

	public void remove(Garcom entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(garcom);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		garcons = getServico().getAll();
		garcom = newEntidade();
	}

	protected Garcom newEntidade() {
		return new Garcom();
	}

}
