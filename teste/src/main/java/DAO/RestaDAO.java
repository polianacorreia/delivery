package DAO;

import java.util.List;

import Poo.ed.Resta;
import filtros.RestaFiltro;

public class RestaDAO extends DAO<Resta> {
	
	public RestaDAO() {
		super(Resta.class);
	}

	public List<Resta> findBy(RestaFiltro filtro) {
		return null;
	}
	
}