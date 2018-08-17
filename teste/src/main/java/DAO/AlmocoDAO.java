package DAO;

import java.util.List;

import Poo.ed.Almoco;
import filtros.AlmocoFiltro;

public class AlmocoDAO extends DAO<Almoco> {
	
	public AlmocoDAO() {
		super(Almoco.class);
	}

	public List<Almoco> findBy(AlmocoFiltro filtro) {
		return null;
	}
	
}
