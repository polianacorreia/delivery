package DAO;

import java.util.List;

import Poo.ed.Cardapio;
import filtros.CardapioFiltro;

public class CardapioDAO extends DAO<Cardapio>{

	public CardapioDAO() {
		super(Cardapio.class);
	}

	public List<Cardapio> findBy(CardapioFiltro filtro) {
		return null;
	}
	
}
