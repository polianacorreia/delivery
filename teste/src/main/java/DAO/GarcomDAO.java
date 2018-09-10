package DAO;

import java.util.List;

import Poo.ed.Garcom;
import filtros.GarcomFiltro;

public class GarcomDAO extends DAO<Garcom> {
	
	public GarcomDAO() {
		super(Garcom.class);
	}

	public List<Garcom> findBy(GarcomFiltro filtro) {
		return null;
	}
	
}
