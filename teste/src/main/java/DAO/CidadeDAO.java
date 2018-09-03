package DAO;

import java.util.List;

import Poo.ed.Cidade;
import filtros.CidadeFiltro;

public class CidadeDAO extends DAO<Cidade> {
	
	public CidadeDAO() {
		super(Cidade.class);
	}

	public List<Cidade> findBy(CidadeFiltro filtro) {
		return null;
	}

}
