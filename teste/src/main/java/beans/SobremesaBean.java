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
import Poo.ed.Sobremesa;
import services.AlmocoService;
import services.SobremesaService;

@Named
@ViewScoped
public class SobremesaBean implements Serializable{
	
	@Inject
	private SobremesaService servico;	
	
	private Sobremesa sobremesa; 
	
	private Collection<Sobremesa> sobremesas;
	
	public Collection<Sobremesa> getSobremesas() {
		return sobremesas;
	}
	
	public SobremesaService getServico() {
		return servico;
	}

	public Sobremesa getEntidade() {
		return sobremesa;
	}

	public void setEntidade(Sobremesa entidade) {
		this.sobremesa = entidade;
	}

	public void setSobremesas(Collection<Sobremesa> sobremesas) {
		this.sobremesas = sobremesas;
	}

	@PostConstruct
	public void init() {
		sobremesa = newEntidade();
		sobremesas = getServico().getAll();
	}

	public void remove(Sobremesa entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(sobremesa);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		sobremesas = getServico().getAll();
		sobremesa = newEntidade();
	}

	protected Sobremesa newEntidade() {
		return new Sobremesa();
	}

}
