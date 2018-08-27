package DAO;

import java.util.List;

import Poo.ed.Bebida;
import filtros.BebidaFiltro;

public class BebidaDAO extends DAO<Bebida>{

	public BebidaDAO() {
		super(Bebida.class);
	}

	public List<Bebida> findBy(BebidaFiltro filtro) {
		return null;
	}

}
