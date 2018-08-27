package services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import DAO.CardapioDAO;
import Poo.ed.Cardapio;
import util.TransacionalCdi;

@ApplicationScoped
public class CardapioService implements Serializable, Service<Cardapio> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private CardapioDAO userDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@TransacionalCdi
	public void save(Cardapio user) {
		userDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@TransacionalCdi
	public void update(Cardapio user)  {
			userDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@TransacionalCdi
	public void remove(Cardapio user) {
		userDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	public Cardapio getByID(long userId)  {
			return userDAO.getByID(userId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	public List<Cardapio> getAll() {
			return userDAO.getAll();
	}
		
}

