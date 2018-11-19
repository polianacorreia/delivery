package beans;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Poo.ed.Conta;
import services.ContaService;

@Named
@ViewScoped
public class ContaBean implements Serializable{
	
	@Inject
	private ContaService servico;
	
	private Conta conta; 
	
	private Collection<Conta> contas;
	
	public Collection<Conta> getContas(){
		return contas;
	}
	
	public ContaService getServico() {
		return servico;
	}

	public Conta getEntidade() {
		return conta;
	}

	public void setEntidade(Conta entidade) {
		this.conta = entidade;
	}

	public void setContas(Collection<Conta> contas) {
		this.contas = contas;
	}
	
	@PostConstruct
	public void init() {
		conta = newEntidade();
		contas = getServico().getAll();
	}

	public void remove(Conta entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(conta);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		contas = getServico().getAll();
		conta = newEntidade();
	}

	protected Conta newEntidade() {
		return new Conta();
	}

}
