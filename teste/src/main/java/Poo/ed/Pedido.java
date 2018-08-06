package Poo.ed;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Pedidos")

public class Pedido {

	@Id
	@Column
	
	private int id_pedido;
	private String forma_pag;
	private int quanti_pedido;
	private String nome_lanche;
	
	public String getForma_pag() {
		return forma_pag;
	}
	public void setForma_pag(String forma_pag) {
		this.forma_pag = forma_pag;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public int getQuanti_pedido() {
		return quanti_pedido;
	}
	public void setQuanti_pedido(int quanti_pedido) {
		this.quanti_pedido = quanti_pedido;
	}
	public String getNome_lanche() {
		return nome_lanche;
	}
	public void setNome_lanche(String nome_lanche) {
		this.nome_lanche = nome_lanche;
	}
	
	

}
