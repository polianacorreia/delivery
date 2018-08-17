package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import Poo.ed.Pedido;

@Named
@ViewScoped
public class PedidoBean {
	
	private Pedido pedido = new Pedido(); 
	
	private List <Pedido> pedidos = new ArrayList<>();
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void addPedido() {
		pedidos.add(getPedido());
		pedido = new Pedido();
	}
	
	public void updatePedido() {
		for (Pedido ped : pedidos) {
			if(ped.getId_pedido() == pedido.getId_pedido()) {
				ped.setForma_pag(pedido.getForma_pag());
				ped.setId_pedido(pedido.getId_pedido());
				ped.setNome_lanche(pedido.getNome_lanche());
				ped.setQuanti_pedido(pedido.getQuanti_pedido());
			}
		}
	}
	public void removePedido() {
		for (Pedido ped : pedidos) {
			if(ped.getId_pedido() == pedido.getId_pedido()) {
				pedidos.remove(ped);
			}
		}
	}
	public void mostrarPedido() {
		for (Pedido ped : pedidos) {
			if(ped.getId_pedido() == pedido.getId_pedido()) {
				System.out.println(ped);
			}
		}
	}

}
