package beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Poo.ed.Bebida;
import services.BebidaService;

@Named
@ApplicationScoped
public class BebidaBean implements Serializable {
	
	@Inject
	private BebidaService service;
	
	private Bebida bebida; 
	
	private Collection <Bebida> bebidas;
	
	public Bebida getBebida() {
		return bebida;
	}
	
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public Collection<Bebida> getBebidas() {
		return bebidas;
	}
	
	@PostConstruct
	public void init() {
		bebida = newEntidade();
		bebidas = getService().getAll();
	}

	public void remove(Bebida entidade) {
		getService().remove(entidade);
		limpar();
	}

	public void save() {
		getService().save(bebida);
		limpar();
	}

	public void editar(Long id) {
		this.getBebida().setId(id);
		save();
	}

	public void limpar() {
		bebidas = getService().getAll();
		bebida = newEntidade();
	}

	protected Bebida newEntidade() {
		return new Bebida();
	}

	public BebidaService getService() {
		return service;
	}

}
