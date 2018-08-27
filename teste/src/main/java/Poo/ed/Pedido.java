package Poo.ed;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Pedidos")

public class Pedido {

	@Id
	@GeneratedValue(generator="pedido_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="pedido_seq")
	private Long id;
	
	private String forma_pag;
	private int quanti_pedido;
	private String nome_lanche;
	
	//Get e Set
	
	public String getForma_pag() {
		return forma_pag;
	}
	public void setForma_pag(String forma_pag) {
		this.forma_pag = forma_pag;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//Construtor
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pedido(Long id, String forma_pag, int quanti_pedido, String nome_lanche) {
		super();
		this.id = id;
		this.forma_pag = forma_pag;
		this.quanti_pedido = quanti_pedido;
		this.nome_lanche = nome_lanche;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", forma_pag=" + forma_pag + ", quanti_pedido=" + quanti_pedido + ", nome_lanche="
				+ nome_lanche + "]";
	}
	
	
	

}
