package rs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;

import Poo.ed.Cliente;
import services.ClienteService;

@Path("/clien")
public class ClienteServiceRS {

	@Inject
	private ClienteService clienteService;
	
	@GET
	@Path("/nome/{id}")
	@Produces("text/html")
	public String getNome(@PathParam("id") Long id) {
		return "<h1>"+clienteService.getByID(id).getNome()+"</h1>";
	}
	
	// http://localhost:8888/teste/rest/clien/list
	@GET
	@Path("/list")
	@Produces("text/html")
	public String list() {
		String retorno = "<ul>";
		List<Cliente> clientes = clienteService.getAll();
		for(Cliente c: clientes) {
			retorno += "<li>"+c.getNome()+"</li>";
		}
		return retorno + "</ul>";
	}
	
	// http://localhost:8888/teste/rest/clien/add/user;nome=Mairno;endereco=Palmas;telefone=33644578;login=hg@hg.com;password=132
	@GET
	@Path("/add/{cliente}")
	public String add(@PathParam("cliente") PathSegment atributos) {
		MultivaluedMap<String, String> matrixParameters = atributos.getMatrixParameters();
		String nome = matrixParameters.getFirst("nome");
		String telefone = matrixParameters.getFirst("telefone");
		String endereco = matrixParameters.getFirst("endereco");
		
		String login = matrixParameters.getFirst("login");
		String password = matrixParameters.getFirst("password");
		
		Cliente c = new Cliente();
		c.setNome(nome);
		c.setTelCliente(telefone);
		c.setEndereco(endereco);
		
		c.setGrupo("CLIENTE");
		c.setPassword(password);
		c.setLogin(login);
		
		clienteService.save(c);
		return "Salvo com sucesso";
	}
	
	public ClienteService getUserService() {
		return clienteService;
	}
	
	public void setUserService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

}
