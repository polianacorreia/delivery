package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity

public class Conta {


	@Id
	@Column
	
	private int id_conta;
	private String pedido;
	private float valor;
	
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getId_conta() {
		return id_conta;
	}
	public void setId_conta(int id_conta) {
		this.id_conta = id_conta;
	}
	
	

}
