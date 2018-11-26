package beans;

import java.io.IOException;
import java.io.Serializable;
import java.security.Principal;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import Poo.ed.Cliente;
import services.ClienteService;

@Named
@ViewScoped
public class ClienteBean implements Serializable {

	@Inject
	private ClienteService servico;

	protected Cliente entidade;

	protected Collection<Cliente> entidades;

	public ClienteBean() {

	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getServico().getAll();
	}

	public String getUserLogin() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		Principal userPrincipal = externalContext.getUserPrincipal();
		if (userPrincipal == null) {
			return "";
		}
		return userPrincipal.getName();
	}

	public void efetuarLogout() throws IOException, ServletException {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);
		session.invalidate();
		HttpServletRequest request = (HttpServletRequest) ec.getRequest();
		request.logout();
		ec.redirect(ec.getApplicationContextPath());
	}

	public boolean isUserInRole(String role) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		return externalContext.isUserInRole(role);
	}

	public void remove(Cliente entidade) {
		getServico().remove(entidade);
		limpar();
	}

	public Cliente getEntidade() {
		return entidade;
	}

	public void setEntidade(Cliente entidade) {
		this.entidade = entidade;
	}

	public Collection<Cliente> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Cliente> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getServico().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getServico().getAll();
		entidade = newEntidade();
	}

	protected Cliente newEntidade() {
		return new Cliente();
	}

	public ClienteService getServico() {
		return servico;
	}

}
