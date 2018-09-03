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
import Poo.ed.Cliente;
import services.AlmocoService;
import services.ClienteService;

@Named
@ViewScoped
public class ClienteBean implements Serializable {
	
	@Inject
	private ClienteService servico;
	
	private Cliente cliente; 
	
	private Collection<Cliente> clientes;
	
	public Collection<Cliente> getClientes() {
		return clientes;
	}
	
	public ClienteService getServico() {
		return servico;
	}
	
	public Cliente getEntidade() {
		return cliente;
	}
	
	public void setEntidade(Cliente entidade) {
		this.cliente = entidade;
	}

	public void setClientes(Collection<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	@PostConstruct
	public void init() {
		cliente = newEntidade();
		clientes = getServico().getAll();
	}

	public void remove(Cliente entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(cliente);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		clientes = getServico().getAll();
		cliente = newEntidade();
	}

	protected Cliente newEntidade() {
		return new Cliente();
	}

}
