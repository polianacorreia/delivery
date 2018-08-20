package Poo.ed;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Exception.AlmocoExistenteException;
import Exception.BebidaExistenteException;
import Exception.ClienteExistenteException;
import Exception.ContaExistenteException;
import Exception.ContatoEntregadorNullException;
import Exception.EnderecoNullException;
import Exception.EntregadorExistenteException;
import Exception.FormaPagNullException;
import Exception.GarcomExistenteException;
import Exception.IdAlmocoNullException;
import Exception.IdBebidaNullException;
import Exception.IdClienteNullException;
import Exception.IdContaNullException;
import Exception.IdEntregadorNullException;
import Exception.IdGarcomNullException;
import Exception.IdJantaNullException;
import Exception.IdJantarNullException;
import Exception.IdLancheNullException;
import Exception.IdPedidoNullException;
import Exception.IdRestaNullException;
import Exception.IdSobremesaNullException;
import Exception.JantaExistenteException;
import Exception.LancheExistenteException;
import Exception.MarcaBebidaNullException;
import Exception.NomeAlmocoNullException;
import Exception.NomeBebidaNullException;
import Exception.NomeClienteNullException;
import Exception.NomeEntregadorNullException;
import Exception.NomeGarcomNullException;
import Exception.NomeJantaNullException;
import Exception.NomeLancheNullException;
import Exception.NomeRestaNullException;
import Exception.NomeSobremesaNullException;
import Exception.PedidoContaNullException;
import Exception.PedidoExistenteException;
import Exception.PrecoAlmocoNullException;
import Exception.PrecoBebidaNullException;
import Exception.PrecoJantaNullException;
import Exception.PrecoLancheNullException;
import Exception.PrecoSobremesaNullException;
import Exception.QuantiPedidoNullException;
import Exception.RestauranteExistenteException;
import Exception.SobremesaExistenteException;
import Exception.TipoBebidaNullException;
import Exception.ValorContaNullException;

public class Main implements Delivery {
	
	
	private EntityManager em;

	
	public Main() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("te");
		em =factory.createEntityManager();
	}
	
	public void addCliente(int idCliente, String nome, int telCliente, String endereco)
			throws IdClienteNullException, NomeClienteNullException, EnderecoNullException, ClienteExistenteException {
		Cliente cliente = em.find(Cliente.class, idCliente);
		if(cliente == null ) {
			cliente = new Cliente();
			cliente.setNome(nome);
			cliente.setEndereco(endereco);
			cliente.setId_cliente(idCliente);
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
		} else {
			throw new ClienteExistenteException();
		}	
	}

	public void removeCliente(int idCliente) throws IdClienteNullException {
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, idCliente);
		em.remove(cliente);
		em.getTransaction().commit();
	}

	public Cliente buscarCliente(String nome, int idCliente) throws IdClienteNullException, NomeClienteNullException {
		Cliente cliente = em.find(Cliente.class, idCliente);
		return cliente;
		
	}
	
	public void atualizarCliente(String nome, int idCliente) throws IdClienteNullException, NomeClienteNullException {
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, idCliente);
		cliente.setNome(nome);
		em.merge(cliente);
		em.getTransaction().commit();
	}

	//-------------------------------------------------------------------------------------------------------------- //
	
	public void addRestaurante(String endereco, int idResta, String tel, String nome)
			throws IdRestaNullException, NomeRestaNullException, EnderecoNullException, RestauranteExistenteException {
		Resta resta = em.find(Resta.class, idResta);
		if(resta == null ) {
			resta = new Resta();
			resta.setNome(nome);
			resta.setTel(tel);
			resta.setEndereco(endereco);
			resta.setId_resta(idResta);
			em.getTransaction().begin();
			em.persist(resta);
			em.getTransaction().commit();
		} else {
			throw new RestauranteExistenteException();
		}
		
	}

	public void RemoveRestaurante(int idResta) throws IdRestaNullException {
		em.getTransaction().begin();
		Resta resta = em.find(Resta.class, idResta);
		em.remove(resta);
		em.getTransaction().commit();
		
	}

	
	public Resta buscarRestaurante(String nome, int idResta) throws IdRestaNullException, NomeRestaNullException {
		Resta restaurante = em.find(Resta.class, idResta);
		return restaurante;
	}
	
	public void atualizarRestaurante(String endereco, int idResta, String tel, String nome)
			throws IdRestaNullException, NomeRestaNullException, EnderecoNullException {
		em.getTransaction().begin();
		Resta resta = em.find(Resta.class, idResta);
		resta.setNome(nome);
		resta.setEndereco(endereco);
		resta.setTel(tel);
		em.merge(resta);
		em.getTransaction().commit();
		
	}
	
	//-------------------------------------------------------------------------------------------------------------- //

	public void addBebida(String nome, String tipo, String marca, int idBebida, float preco)
			throws IdBebidaNullException, NomeBebidaNullException, TipoBebidaNullException, MarcaBebidaNullException,
			PrecoBebidaNullException, BebidaExistenteException {
		Bebida bebida = em.find(Bebida.class, idBebida);
		if(bebida == null ) {
			bebida = new Bebida();
			bebida.setNome(nome);
			bebida.setMarca(marca);
			bebida.setTipo(tipo);
			bebida.setPreco(preco);
			bebida.setId_bebida(idBebida);
			em.getTransaction().begin();
			em.persist(bebida);
			em.getTransaction().commit();
		} else {
			throw new BebidaExistenteException();
		}
		
	}

	public void RemoveBebida(int idBebida) throws IdBebidaNullException {
		em.getTransaction().begin();
		Bebida bebida = em.find(Bebida.class, idBebida);
		em.remove(bebida);
		em.getTransaction().commit();
		
	}
	
	public Bebida buscarBebida(int idBebida) throws IdBebidaNullException, NomeBebidaNullException {
		Bebida bebida = em.find(Bebida.class, idBebida);
		return bebida;
	}
	
	public void atualizarBebida(String nome, String tipo, String marca, int idBebida, float preco)
			throws IdBebidaNullException, NomeBebidaNullException, TipoBebidaNullException, MarcaBebidaNullException,
			PrecoBebidaNullException {
		em.getTransaction().begin();
		Bebida bebida = em.find(Bebida.class, idBebida);
		bebida.setMarca(marca);
		bebida.setNome(nome);
		bebida.setTipo(tipo);
		bebida.setPreco(preco);
		em.merge(bebida);
		em.getTransaction().commit();
		
	}
	
	//-------------------------------------------------------------------------------------------------------------- //
	
	public void addAlmoco(String nome, String acompanhamento, Long idAlmoco, float preco)
			throws IdAlmocoNullException, NomeAlmocoNullException, PrecoAlmocoNullException, AlmocoExistenteException {
		Almoco almoco = em.find(Almoco.class, idAlmoco);
		if(almoco == null ) {
			almoco = new Almoco();
			almoco.setNome(nome);
			almoco.setAcompanhamentos(acompanhamento);
			almoco.setPreco(preco);
			almoco.setId(idAlmoco);
			em.getTransaction().begin();
			em.persist(almoco);
			em.getTransaction().commit();
		} else {
			throw new AlmocoExistenteException();
		}
		
	}

	public void RemoveAlmoco(int idAlmoco) throws IdAlmocoNullException {
		em.getTransaction().begin();
		Almoco almoco = em.find(Almoco.class, idAlmoco);
		em.remove(almoco);
		em.getTransaction().commit();
		
	}

	public Almoco buscarAlmoco(String nome, int idAlmoco) throws IdAlmocoNullException, NomeAlmocoNullException {
		Almoco almoco = em.find(Almoco.class, idAlmoco);
		return almoco;
	}
	
	public void atualizarAlmoco(String nome, String acompanhamento, int idAlmoco, float preco)
			throws IdAlmocoNullException, NomeAlmocoNullException, PrecoAlmocoNullException {
		em.getTransaction().begin();
		Almoco almoco = em.find(Almoco.class, idAlmoco);
		almoco.setAcompanhamentos(acompanhamento);
		almoco.setNome(nome);
		almoco.setPreco(preco);
		em.merge(almoco);
		em.getTransaction().commit();	
	}
	
	//-------------------------------------------------------------------------------------------------------------- //

	public void addLanche(String nome, String tipo, int idLanche, float preco)
			throws IdLancheNullException, NomeLancheNullException, PrecoLancheNullException, LancheExistenteException {
		Lanche lanche = em.find(Lanche.class, idLanche);
		if(lanche == null ) {
			lanche = new Lanche();
			lanche.setNome(nome);
			lanche.setPreco(preco);
			lanche.setTipo(tipo);
			lanche.setId_lanche(idLanche);
			em.getTransaction().begin();
			em.persist(lanche);
			em.getTransaction().commit();
		} else {
			throw new LancheExistenteException();
		}
			
	}

	public void RemoveLanche(int idLanche) throws IdLancheNullException {
		em.getTransaction().begin();
		Lanche lanche = em.find(Lanche.class, idLanche);
		em.remove(lanche);
		em.getTransaction().commit();
	}

	public Lanche buscarLanche(String nome, int idLanche) throws IdLancheNullException, NomeLancheNullException {
		Lanche lanche = em.find(Lanche.class, idLanche);
		return lanche;
	}
	
	public void atualizarLanche(String nome, String tipo, int idLanche, float preco)
			throws IdLancheNullException, NomeLancheNullException, PrecoLancheNullException {
		em.getTransaction().begin();
		Lanche lanche = em.find(Lanche.class, idLanche);
		lanche.setNome(nome);
		lanche.setPreco(preco);
		lanche.setTipo(tipo);
		em.merge(lanche);
		em.getTransaction().commit();
	}
	
	//-------------------------------------------------------------------------------------------------------------- //
	
	public void addJanta(String nome, float preco, String acompanhamentos, int idJantar)
			throws IdJantaNullException, PrecoJantaNullException, IdJantarNullException, JantaExistenteException {
		Jantar janta = em.find(Jantar.class, idJantar);
		if(janta == null ) {
			janta = new Jantar();
			janta.setNome(nome);
			janta.setPreco(preco);
			janta.setAcompanhamentos(acompanhamentos);
			janta.setIdJantar(idJantar);
			em.getTransaction().begin();
			em.persist(janta);
			em.getTransaction().commit();
		} else {
			throw new JantaExistenteException();
		}
	}

	
	public void RemoveJanta(int idJanta) throws IdJantaNullException {
		em.getTransaction().begin();
		Jantar janta = em.find(Jantar.class, idJanta);
		em.remove(janta);
		em.getTransaction().commit();	
	}

	
	public Jantar buscarJanta(String nome, int idJanta) throws IdJantaNullException, NomeJantaNullException {
		Jantar jantar = em.find(Jantar.class, idJanta);
		return jantar;
	}
	
	public void atualizarJanta(String nome, float preco, String acompanhamentos, int idJantar)
			throws IdJantaNullException, PrecoJantaNullException, IdJantarNullException {
		em.getTransaction().begin();
		Jantar janta = em.find(Jantar.class, idJantar);
		janta.setAcompanhamentos(acompanhamentos);
		janta.setNome(nome);
		janta.setPreco(preco);
		em.merge(janta);
		em.getTransaction().commit();
	}

	//-------------------------------------------------------------------------------------------------------------- //
	
	public void addSobremesa(String nome, float preco, String tipo, int idSobremesa)
			throws IdSobremesaNullException, PrecoSobremesaNullException, NomeSobremesaNullException, SobremesaExistenteException {
		Sobremesa sobremesa = em.find(Sobremesa.class, idSobremesa);
		if(sobremesa == null ) {
			sobremesa = new Sobremesa();
			sobremesa.setNome(nome);
			sobremesa.setPreco(preco);
			sobremesa.setTipo(tipo);
			sobremesa.setIdSobremesa(idSobremesa);
			em.getTransaction().begin();
			em.persist(sobremesa);
			em.getTransaction().commit();
		} else {
			throw new SobremesaExistenteException();
		}
	}

	
	public void RemoveSobremesa(int idSobremesa) throws IdSobremesaNullException {
		em.getTransaction().begin();
		Sobremesa sobremesa = em.find(Sobremesa.class, idSobremesa);
		em.remove(sobremesa);
		em.getTransaction().commit();	
		
	}

	
	public Sobremesa buscarSobremesa(String nome, int idSobremesa)
			throws IdSobremesaNullException, NomeSobremesaNullException {
		Sobremesa sobremesa = em.find(Sobremesa.class, idSobremesa);
		return sobremesa;
	}
	
	public void atualizarSobremesa(String nome, float preco, String tipo, int idSobremesa)
			throws IdSobremesaNullException, PrecoSobremesaNullException, NomeSobremesaNullException {
		em.getTransaction().begin();
		Sobremesa sobremesa = em.find(Sobremesa.class, idSobremesa);
		sobremesa.setNome(nome);
		sobremesa.setPreco(preco);
		sobremesa.setTipo(tipo);
		em.merge(sobremesa);
		em.getTransaction().commit();
	}

	//-------------------------------------------------------------------------------------------------------------- //
	
	public void addGarcom(String nome, int idGarcom) throws IdGarcomNullException, NomeGarcomNullException, GarcomExistenteException {
		Garcom garcom = em.find(Garcom.class, idGarcom);
		if(garcom == null ) {
			garcom = new Garcom();
			garcom.setNome(nome);
			garcom.setId_garcom(idGarcom);
			em.getTransaction().begin();
			em.persist(garcom);
			em.getTransaction().commit();
		} else {
			throw new GarcomExistenteException();
		}
		
	}

	
	public void RemoveGarcom(int idGarcom) throws IdGarcomNullException {
		em.getTransaction().begin();
		Garcom garcom = em.find(Garcom.class, idGarcom);
		em.remove(garcom);
		em.getTransaction().commit();	
	}

	
	public Garcom buscarGarcom(String nome, int idGarcom) throws IdGarcomNullException, NomeGarcomNullException {
		Garcom garcom = em.find(Garcom.class, idGarcom);
		return garcom;
	}
	
	public void atualizarGarcom(String nome, int idGarcom) throws IdGarcomNullException, NomeGarcomNullException {
		em.getTransaction().begin();
		Garcom garcom = em.find(Garcom.class, idGarcom);
		garcom.setNome(nome);
		em.merge(garcom);
		em.getTransaction().commit();
		
	}

	//-------------------------------------------------------------------------------------------------------------- //
	
	public void addEntregador(int idEntregador, String contato, String nome)
			throws IdEntregadorNullException, ContatoEntregadorNullException, NomeEntregadorNullException, EntregadorExistenteException {
		Entregador entregador = em.find(Entregador.class, idEntregador);
		if(entregador == null ) {
			entregador = new Entregador();
			entregador.setNome(nome);
			entregador.setId_intregador(idEntregador);
			entregador.setContato(contato);
			em.getTransaction().begin();
			em.persist(entregador);
			em.getTransaction().commit();
		} else {
			throw new EntregadorExistenteException();
		}
		
	}

	
	public void RemoveEntregador(int idEntregador) throws IdEntregadorNullException {
		em.getTransaction().begin();
		Entregador entregador = em.find(Entregador.class, idEntregador);
		em.remove(entregador);
		em.getTransaction().commit();
		
	}

	
	public Entregador buscarEntregador(String nome, int idEntregador)
			throws NomeEntregadorNullException, IdEntregadorNullException {
		Entregador entregador = em.find(Entregador.class, idEntregador);
		return entregador;
	}
	
	public void atualizarEntregador(int idEntregador, String contato, String nome)
			throws IdEntregadorNullException, ContatoEntregadorNullException, NomeEntregadorNullException {
		em.getTransaction().begin();
		Entregador entregador = em.find(Entregador.class, idEntregador);
		entregador.setContato(contato);
		entregador.setNome(nome);
		em.merge(entregador);
		em.getTransaction().commit();
		
	}

	//-------------------------------------------------------------------------------------------------------------- //
	
	public void addConta(int idConta, String pedido, int valor)
			throws IdContaNullException, ValorContaNullException, PedidoContaNullException, ContaExistenteException {
		Conta conta = em.find(Conta.class, idConta);
		if(conta == null ) {
			conta = new Conta();
			conta.setId_conta(idConta);
			conta.setPedido(pedido);
			conta.setValor(valor);
			em.getTransaction().begin();
			em.persist(conta);
			em.getTransaction().commit();
		} else {
			throw new ContaExistenteException();
		}
		
	}

	
	public void RemoveConta(int idConta) throws IdContaNullException {
		em.getTransaction().begin();
		Conta conta = em.find(Conta.class, idConta);
		em.remove(conta);
		em.getTransaction().commit();
		
	}

	
	public Conta buscarConta(String nome, int idConta) throws IdContaNullException {
		Conta conta = em.find(Conta.class, idConta);
		return conta;
	}
	
	public void atualizarConta(int idConta, String pedido, int valor)
			throws IdContaNullException, ValorContaNullException, PedidoContaNullException {
		em.getTransaction().begin();
		Conta conta = em.find(Conta.class, idConta);
		conta.setPedido(pedido);
		conta.setValor(valor);
		em.merge(conta);
		em.getTransaction().commit();
		
	}

	//-------------------------------------------------------------------------------------------------------------- //
	
	public void addPedido(String formaPag, int idPedido, int quantiPedido, String nomeLanche)
			throws FormaPagNullException, IdPedidoNullException, QuantiPedidoNullException, NomeLancheNullException, PedidoExistenteException {
		Pedido pedido = em.find(Pedido.class, idPedido);
		if(pedido == null ) {
			pedido = new Pedido();
			pedido.setForma_pag(formaPag);
			pedido.setId_pedido(idPedido);
			pedido.setNome_lanche(nomeLanche);
			pedido.setQuanti_pedido(quantiPedido);
			em.getTransaction().begin();
			em.persist(pedido);
			em.getTransaction().commit();
		} else {
			throw new PedidoExistenteException();
		}
		
	}

	
	public void RemovePedido(int idPedido) throws IdPedidoNullException {
		em.getTransaction().begin();
		Pedido pedido = em.find(Pedido.class, idPedido);
		em.remove(pedido);
		em.getTransaction().commit();
		
	}

	
	public Pedido buscarPedido(int idPedido) throws IdPedidoNullException {
		Pedido pedido = em.find(Pedido.class, idPedido);
		return pedido;
	}
	
	public void atualizarPedido(String formaPag, int idPedido, int quantiPedido, String nomeLanche)
			throws FormaPagNullException, IdPedidoNullException, QuantiPedidoNullException, NomeLancheNullException {
		em.getTransaction().begin();
		Pedido pedido = em.find(Pedido.class, idPedido);
		pedido.setForma_pag(formaPag);
		pedido.setNome_lanche(nomeLanche);
		pedido.setQuanti_pedido(quantiPedido);
		em.merge(pedido);
		em.getTransaction().commit();
		
	}
	
	//-------------------------------------------------------------------------------------------------------------- //
	
	public static void main(String[] args) throws IdAlmocoNullException, NomeAlmocoNullException, PrecoAlmocoNullException {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("te");
		
	}

	public void addCliente(int idCliente, String nome, String tel_cliente, String endereco)
			throws IdClienteNullException, NomeClienteNullException, EnderecoNullException, ClienteExistenteException {
		// TODO Auto-generated method stub
		
	}

}
