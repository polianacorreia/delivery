package DAO;

import java.util.List;

import Poo.ed.Jantar;
import filtros.JantarFiltro;

public class JantarDAO extends DAO<Jantar> {
	
	public JantarDAO() {
		super(Jantar.class);
	}

	public List<Jantar> findBy(JantarFiltro filtro) {
		return null;
	}
	
}