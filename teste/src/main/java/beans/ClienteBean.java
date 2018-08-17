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
			if(cli.getId_cliente() == cliente.getId_cliente()) {
				cli.setEndereco(cliente.getEndereco());
				cli.setId_cliente(cliente.getId_cliente());
				cli.setNome(cliente.getNome());
				cli.setTel_cliente(cliente.getTel_cliente());
			}
		}
	}
	public void removeCliente() {
		for (Cliente cli : clientes) {
			if(cli.getId_cliente() == cliente.getId_cliente()) {
				clientes.remove(cli);
			}
		}
	}
	public void mostrarCliente() {
		for (Cliente cli : clientes) {
			if(cli.getId_cliente() == cliente.getId_cliente()) {
				System.out.println(cli);
			}
		}
	}

}
