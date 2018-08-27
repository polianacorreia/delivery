package Poo.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Conta {


	@Id
	@GeneratedValue(generator="conta_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="conta_seq")
	private Long id;
	
	private String pedido;
	private float valor;
	
	//Get e Set
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//Construtor
	
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Conta(Long id, int id_conta, String pedido, float valor) {
		super();
		this.id = id;
		this.pedido = pedido;
		this.valor = valor;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Conta [id=" + id + ", pedido=" + pedido + ", valor=" + valor + "]";
	}
	
	
	
}
