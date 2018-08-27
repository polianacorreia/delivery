package beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Poo.ed.Almoco;
import services.AlmocoService;

@Named
@ViewScoped
public class AlmocoBean implements Serializable{
	
	@Inject
	private AlmocoService servico;	
	
	private Almoco almoco; 
	
	private Collection<Almoco> almocos;
	
	public Collection<Almoco> getAlmocos() {
		return almocos;
	}
	
	public AlmocoService getServico() {
		return servico;
	}

	public Almoco getEntidade() {
		return almoco;
	}

	public void setEntidade(Almoco entidade) {
		this.almoco = entidade;
	}

	public void setAlmocos(Collection<Almoco> almocos) {
		this.almocos = almocos;
	}

	@PostConstruct
	public void init() {
		almoco = newEntidade();
		almocos = getServico().getAll();
	}

	public void remove(Almoco entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(almoco);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		almocos = getServico().getAll();
		almoco = newEntidade();
	}

	protected Almoco newEntidade() {
		return new Almoco();
	}
}
