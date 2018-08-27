package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import Poo.ed.Conta;

@Named
@ViewScoped
public class ContaBean {
	
	private Conta conta = new Conta(); 
	
	private List <Conta> contas = new ArrayList<>();
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void addConta() {
		contas.add(getConta());
		conta = new Conta();
	}
	
	public void updateConta() {
		for (Conta con : contas) {
			if(con.getId() == conta.getId()) {
				con.setId(conta.getId());
				con.setPedido(conta.getPedido());
				con.setValor(conta.getValor());
			}
		}
	}
	public void removeConta() {
		for (Conta con : contas) {
			if(con.getId() == conta.getId()) {
				contas.remove(con);
			}
		}
	}
	public void mostrarConta() {
		for (Conta con : contas) {
			if(con.getId() == conta.getId()) {
				System.out.println(con);
			}
		}
	}

}
