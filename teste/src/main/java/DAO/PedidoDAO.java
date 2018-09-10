package DAO;

import java.util.List;

import Poo.ed.Pedido;
import filtros.PedidoFiltro;

public class PedidoDAO extends DAO<Pedido> {
	
	public PedidoDAO() {
		super(Pedido.class);
	}

	public List<Pedido> findBy(PedidoFiltro filtro) {
		return null;
	}
	
}