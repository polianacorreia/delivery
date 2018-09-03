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
import Poo.ed.Entregador;
import services.AlmocoService;
import services.EntregadorService;

@Named
@ViewScoped
public class EntregadorBean implements Serializable{
	
	@Inject
	private EntregadorService servico;	
	
	private Entregador entregador; 
	
	private Collection<Entregador> entregadores;
	
	public Collection<Entregador> getEntregadores() {
		return entregadores;
	}
	
	public EntregadorService getServico() {
		return servico;
	}

	public Entregador getEntidade() {
		return entregador;
	}

	public void setEntidade(Entregador entidade) {
		this.entregador = entidade;
	}

	public void setEntregadores(Collection<Entregador> entregadores) {
		this.entregadores = entregadores;
	}
	
	@PostConstruct
	public void init() {
		entregador = newEntidade();
		entregadores = getServico().getAll();
	}

	public void remove(Entregador entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(entregador);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entregadores = getServico().getAll();
		entregador = newEntidade();
	}

	protected Entregador newEntidade() {
		return new Entregador();
	}

}
