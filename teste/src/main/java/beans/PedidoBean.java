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
import Poo.ed.Pedido;
import services.AlmocoService;
import services.PedidoService;

@Named
@ViewScoped
public class PedidoBean implements Serializable{
	
	@Inject
	private PedidoService servico;	
	
	private Pedido pedido; 
	
	private Collection<Pedido> pedidos;
	
	public Collection<Pedido> getPedidos() {
		return pedidos;
	}
	
	public PedidoService getServico() {
		return servico;
	}

	public Pedido getEntidade() {
		return pedido;
	}

	public void setEntidade(Pedido entidade) {
		this.pedido = entidade;
	}

	public void setPedidos(Collection<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@PostConstruct
	public void init() {
		pedido = newEntidade();
		pedidos = getServico().getAll();
	}

	public void remove(Pedido entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public void save() {
		getServico().save(pedido);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		pedidos = getServico().getAll();
		pedido = newEntidade();
	}

	protected Pedido newEntidade() {
		return new Pedido();
	}


}
