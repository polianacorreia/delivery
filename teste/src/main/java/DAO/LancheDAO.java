package DAO;

import java.util.List;

import Poo.ed.Lanche;
import filtros.LancheFiltro;

public class LancheDAO extends DAO<Lanche> {
	
	public LancheDAO() {
		super(Lanche.class);
	}

	public List<Lanche> findBy(LancheFiltro filtro) {
		return null;
	}
	
}