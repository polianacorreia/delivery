package beans;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Poo.ed.Cidade;
import services.CidadeService;

@Named
@ViewScoped
public class CidadeBean implements Serializable {

	@Inject
	private CidadeService servico;

	private Cidade cidade;

	private Collection<Cidade> cidades;

	public Collection<Cidade> getCidades() {
		return cidades;
	}

	public CidadeService getServico() {
		return servico;
	}

	public Cidade getEntidade() {
		return cidade;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public void setServico(CidadeService servico) {
		this.servico = servico;
	}

	public void setEntidade(Cidade entidade) {
		this.cidade = entidade;
	}

	public void setCidades(Collection<Cidade> cidades) {
		this.cidades = cidades;
	}

	@PostConstruct
	public void init() {
		cidade = newEntidade();
		cidades = getServico().getAll();
	}

	public void remove(Cidade entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(cidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		cidades = getServico().getAll();
		cidade = newEntidade();
	}

	protected Cidade newEntidade() {
		return new Cidade();
	}
}
