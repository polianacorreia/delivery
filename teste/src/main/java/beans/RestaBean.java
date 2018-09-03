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
import Poo.ed.Resta;
import services.AlmocoService;
import services.RestaService;

@Named
@ViewScoped
public class RestaBean implements Serializable{
	
	@Inject
	private RestaService servico;	
	
	private Resta resta; 
	
	private Collection<Resta> restas;
	
	public Collection<Resta> getRestas() {
		return restas;
	}
	
	public RestaService getServico() {
		return servico;
	}

	public Resta getEntidade() {
		return resta;
	}

	public void setEntidade(Resta entidade) {
		this.resta = entidade;
	}

	public void setRestas(Collection<Resta> restas) {
		this.restas = restas;
	}

	@PostConstruct
	public void init() {
		resta = newEntidade();
		restas = getServico().getAll();
	}

	public void remove(Resta entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(resta);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		restas = getServico().getAll();
		resta = newEntidade();
	}

	protected Resta newEntidade() {
		return new Resta();
	}

}
