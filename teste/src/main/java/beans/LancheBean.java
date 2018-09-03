package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Poo.ed.*;
import services.AlmocoService;
import services.LancheService;

@Named
@ViewScoped
public class LancheBean implements Serializable{
	
	@Inject
	private LancheService servico;	
	
	private Lanche lanche; 
	
	private Collection<Lanche> lanches;
	
	public Collection<Lanche> getLanches() {
		return lanches;
	}
	
	public LancheService getServico() {
		return servico;
	}

	public Lanche getEntidade() {
		return lanche;
	}

	public void setEntidade(Lanche entidade) {
		this.lanche = entidade;
	}

	public void setLanches(Collection<Lanche> lanches) {
		this.lanches = lanches;
	}

	@PostConstruct
	public void init() {
		lanche = newEntidade();
		lanches = getServico().getAll();
	}

	public void remove(Lanche entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(lanche);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		lanches = getServico().getAll();
		lanche = newEntidade();
	}

	protected Lanche newEntidade() {
		return new Lanche();
	}

}
