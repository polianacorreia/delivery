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
			if(con.getId_conta() == conta.getId_conta()) {
				con.setId_conta(conta.getId_conta());
				con.setPedido(conta.getPedido());
				con.setValor(conta.getValor());
			}
		}
	}
	public void removeConta() {
		for (Conta con : contas) {
			if(con.getId_conta() == conta.getId_conta()) {
				contas.remove(con);
			}
		}
	}
	public void mostrarConta() {
		for (Conta con : contas) {
			if(con.getId_conta() == conta.getId_conta()) {
				System.out.println(con);
			}
		}
	}

}
