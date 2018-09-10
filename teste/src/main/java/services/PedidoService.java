package services;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import DAO.PedidoDAO;
import Poo.ed.Pedido;
import util.TransacionalCdi;

public class PedidoService implements Serializable, Service<Pedido> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private PedidoDAO userDAO;
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@TransacionalCdi
	public void save(Pedido user) {
		userDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@TransacionalCdi
	public void update(Pedido user)  {
			userDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@TransacionalCdi
	public void remove(Pedido user) {
		userDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	public Pedido getByID(long userId)  {
			return userDAO.getByID(userId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	public List<Pedido> getAll() {
			return userDAO.getAll();
	}
		

}
