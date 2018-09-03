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
import Poo.ed.Jantar;
import services.AlmocoService;
import services.JantarService;

@Named
@ViewScoped
public class JantarBean implements Serializable{
	
	@Inject
	private JantarService servico;	
	
	private Jantar jantar; 
	
	private Collection<Jantar> jantares;
	
	public Collection<Jantar> getJantares() {
		return jantares;
	}
	
	public JantarService getServico() {
		return servico;
	}

	public Jantar getEntidade() {
		return jantar;
	}

	public void setEntidade(Jantar entidade) {
		this.jantar = entidade;
	}

	public void setJantares(Collection<Jantar> jantares) {
		this.jantares = jantares;
	}

	@PostConstruct
	public void init() {
		jantar = newEntidade();
		jantares = getServico().getAll();
	}

	public void remove(Jantar entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(jantar);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		jantares = getServico().getAll();
		jantar = newEntidade();
	}

	protected Jantar newEntidade() {
		return new Jantar();
	}

}
