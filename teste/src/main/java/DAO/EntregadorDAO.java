package DAO;

import java.util.List;

import Poo.ed.Entregador;
import filtros.EntregadorFiltro;

public class EntregadorDAO extends DAO<Entregador> {
	
	public EntregadorDAO() {
		super(Entregador.class);
	}

	public List<Entregador> findBy(EntregadorFiltro filtro) {
		return null;
	}
	
}
