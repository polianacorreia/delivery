package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import Poo.ed.Cliente;

@Named
@ViewScoped
public class ClienteBean {
	
	private Cliente cliente = new Cliente(); 
	
	private List <Cliente> clientes = new ArrayList<>();
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void addCliente() {
		clientes.add(getCliente());
		cliente = new Cliente();
	}
	
	public void updateCliente() {
		for (Cliente cli : clientes) {
			if(cli.getId() == cliente.getId()) {
				cli.setEndereco(cliente.getEndereco());
				cli.setId(cliente.getId());
				cli.setNome(cliente.getNome());
				cli.setTelCliente(cliente.getTelCliente());
			}
		}
	}
	public void removeCliente() {
		for (Cliente cli : clientes) {
			if(cli.getId() == cliente.getId()) {
				clientes.remove(cli);
			}
		}
	}
	public void mostrarCliente() {
		for (Cliente cli : clientes) {
			if(cli.getId() == cliente.getId()) {
				System.out.println(cli);
			}
		}
	}

}
