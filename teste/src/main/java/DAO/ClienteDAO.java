package DAO;

import java.util.List;

import Poo.ed.Cliente;
import filtros.ClienteFiltro;

public class ClienteDAO extends DAO<Cliente> {
	
	public ClienteDAO() {
		super(Cliente.class);
	}

	public List<Cliente> findBy(ClienteFiltro filtro) {
		return null;
	}
	
}
