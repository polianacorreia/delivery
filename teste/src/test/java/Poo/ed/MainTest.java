package Poo.ed;

import static org.junit.Assert.*;

import org.junit.Test;

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

public class MainTest {

	@Test
	public void testAddBuscaRemoveAtualizaCliente() {
		Main m = new Main();
		try {
			m.addCliente(12, "cliente1", 456, "rua1");
			Cliente cliente = m.buscarCliente("cliente1", 12);
			assertEquals(cliente.getEndereco(), "rua1");
			m.atualizarCliente("cliente2", 12);
			Cliente cliente2 = m.buscarCliente("cliente2", 12);
			assertEquals(cliente2.getNome(), "cliente2");
			m.removeCliente(12);
			cliente = m.buscarCliente("cliente2", 12);
			assertNull(cliente);
		} catch (IdClienteNullException e) {
			fail();
		} catch (NomeClienteNullException e) {
			fail();
		} catch (EnderecoNullException e) {
			 fail();
		} catch (ClienteExistenteException e) {
			fail();
		}
	}
	
	//--------------------------------------------------------------------------------------------//

	@Test
	public void testAddBuscaRemoveAtualizaRestaurante() {
		Main m = new Main();
		try {
			m.addRestaurante("rua", 2, "9999", "resta1");
			Resta resta = m.buscarRestaurante("resta1", 2);
			assertEquals(resta.getEndereco(), "rua");
			assertEquals(resta.getTel(), "9999");
			m.atualizarRestaurante("rua2", 2, "9998", "resta2");
			Resta resta2 = m.buscarRestaurante("resta2", 2);
			assertEquals(resta2.getNome(), "resta2");
			assertEquals(resta2.getEndereco(), "rua2");
			assertEquals(resta2.getTel(), "9998");
			m.RemoveRestaurante(2);
			resta = m.buscarRestaurante("resta1", 2);
			assertNull(resta);
		}catch (IdRestaNullException e) {
			fail();
		} catch (NomeRestaNullException e) {
			fail();
		} catch (EnderecoNullException e) {
			 fail();
		} catch (RestauranteExistenteException e) {
			fail();
		}
	}

	//--------------------------------------------------------------------------------------------//
	
	@Test
	public void testAddBuscaRemoveAtualizarBebida() {
		Main m = new Main();
		try {
			m.addBebida("bebida1", "Refri", "coca", 23, 5);
			Bebida bebida = m.buscarBebida(23);
			assertEquals(bebida.getTipo(), "Refri");
			assertEquals(bebida.getMarca(), "coca");
			m.atualizarBebida("bebida2", "Refrigerante", "antartica", 23, 5);
			Bebida bebida2 = m.buscarBebida(23);
			assertEquals(bebida2.getNome(), "bebida2");
			assertEquals(bebida2.getTipo(), "Refrigerante");
			assertEquals(bebida2.getMarca(), "antartica");
			m.RemoveBebida(23);
			bebida = m.buscarBebida(23);
			assertNull(bebida);
		} catch (IdBebidaNullException e) {
			fail();
		} catch (NomeBebidaNullException e) {
			fail();
		} catch (TipoBebidaNullException e) {
			 fail();
		} catch (MarcaBebidaNullException e) {
			fail();
		}catch (PrecoBebidaNullException e) {
			fail();
		}catch (BebidaExistenteException e) {
			fail();
		}

	}
	
	//--------------------------------------------------------------------------------------------//

	@Test
	public void testAddBuscaRemoveAtualizaAlmoco() {
		Main m = new Main();
		try {
			m.addAlmoco("almoco1", "suco", 34, 25);
			Almoco almoco = m.buscarAlmoco("almoco1", 34);
			assertEquals(almoco.getAcompanhamentos(), "suco");
			assertEquals(almoco.getNome(), "almoco1");
			m.atualizarAlmoco("almoco2", "refrigerante", 34, 25);
			Almoco almoco2 = m.buscarAlmoco("almoco2", 34);
			assertEquals(almoco2.getNome(), "almoco2");
			assertEquals(almoco2.getAcompanhamentos(), "refrigerante");
			m.RemoveAlmoco(34);
			almoco = m.buscarAlmoco("almoco2", 34);
			assertNull(almoco);
		} catch (IdAlmocoNullException e) {
			fail();
		} catch (NomeAlmocoNullException e) {
			fail();
		} catch (PrecoAlmocoNullException e) {
			 fail();
		} catch (AlmocoExistenteException e) {
			fail();
		}
	}

	
	//--------------------------------------------------------------------------------------------//

	@Test
	public void testAddBuscaRemoveAtualizaLanche() {
		Main m = new Main();
		try {
			m.addLanche("lanche1", "fast", 45, 15);
			Lanche lanche = m.buscarLanche("lanche1", 45);
			assertEquals(lanche.getTipo(), "fast");
			m.atualizarLanche("lanche2", "fast-food", 45, 15);
			Lanche lanche2 = m.buscarLanche("lanche2", 45);
			assertEquals(lanche2.getNome(), "lanche2");
			assertEquals(lanche2.getTipo(), "fast-food");
			m.RemoveLanche(45);
			lanche = m.buscarLanche("lanche2", 45);
			assertNull(lanche);
		} catch (IdLancheNullException e) {
			fail();
		} catch (NomeLancheNullException e) {
			fail();
		} catch (PrecoLancheNullException e) {
			 fail();
		} catch (LancheExistenteException e) {
			fail();
		}
	}

	//--------------------------------------------------------------------------------------------//
	
	@Test
	public void testAddBuscaRemoveAtualizarJanta() {
		Main m = new Main();
		try {
			m.addJanta("janta1", 30, "pao", 56);
			Jantar janta = m.buscarJanta("janta1", 56);
			assertEquals(janta.getAcompanhamentos(), "pao");
			m.atualizarJanta("janta2", 30, "cafe", 56);
			Jantar janta2 = m.buscarJanta("janta2", 56);
			assertEquals(janta2.getNome(), "janta2");
			assertEquals(janta2.getAcompanhamentos(), "cafe");
			m.RemoveJanta(56);
			janta = m.buscarJanta("janta2", 56);
			assertNull(janta);
		} catch (IdJantaNullException e) {
			fail();
		} catch (PrecoJantaNullException e) {
			fail();
		} catch (IdJantarNullException e) {
			 fail();
		} catch (JantaExistenteException e) {
			fail();
		} catch (NomeJantaNullException e) {
			fail();
		}
		
	}

	//--------------------------------------------------------------------------------------------//
	
	@Test
	public void testAddBuscaRemoveAtualizaSobremesa() {
		Main m = new Main();
		try {
			m.addSobremesa("pudim", 3, "tipo1", 78);
			Sobremesa sobremesa = m.buscarSobremesa("pudim", 78);
			assertEquals(sobremesa.getTipo(), "tipo1");
			m.atualizarSobremesa("pudim2", 3, "tipo2", 78);
			Sobremesa sobremesa2 = m.buscarSobremesa("pudim2", 78);
			assertEquals(sobremesa2.getNome(), "pudim2");
			assertEquals(sobremesa2.getTipo(), "tipo2");
			m.RemoveSobremesa(78);
			sobremesa = m.buscarSobremesa("pudim2", 78);
			assertNull(sobremesa);
		} catch (IdSobremesaNullException e) {
			fail();
		} catch (PrecoSobremesaNullException e) {
			fail();
		} catch (NomeSobremesaNullException e) {
			 fail();
		} catch (SobremesaExistenteException e) {
			fail();
		}
	}

	
	//--------------------------------------------------------------------------------------------//

	@Test
	public void testAddBuscaRemoveAtualizaGarcom() {
		Main m = new Main();
		try {
			m.addGarcom("garcom1", 4);
			Garcom garcom = m.buscarGarcom("garcom1", 4);
			assertEquals(garcom.getNome(), "garcom1");
			m.atualizarGarcom("garcom2", 4);
			Garcom garcom2 = m.buscarGarcom("garcom2", 4);
			assertEquals(garcom2.getNome(), "garcom2");
			m.RemoveGarcom(4);
			garcom = m.buscarGarcom("garcom2", 4);
			assertNull(garcom);
		} catch (IdGarcomNullException e) {
			fail();
		} catch (NomeGarcomNullException e) {
			fail();
		} catch (GarcomExistenteException e) {
			 fail();
		} 
	}
	
	//--------------------------------------------------------------------------------------------//

	@Test
	public void testAddRemoveBuscaAtualizaEntregador() {
		Main m = new Main();
		try {
			m.addEntregador(5, "6785", "entregador1");
			Entregador entregador = m.buscarEntregador("entregador1", 5);
			assertEquals(entregador.getContato(), "6785");
			m.atualizarEntregador(5, "6787", "entregador2");
			Entregador entregador2 = m.buscarEntregador("entregador2", 5);
			assertEquals(entregador2.getNome(), "entregador2");
			assertEquals(entregador2.getContato(), "6787");
			m.RemoveEntregador(5);
			entregador = m.buscarEntregador("entregador2", 5);
			assertNull(entregador);
		} catch (IdEntregadorNullException e) {
			fail();
		} catch (ContatoEntregadorNullException e) {
			fail();
		} catch (NomeEntregadorNullException e) {
			 fail();
		} catch (EntregadorExistenteException e) {
			fail();
		}
	}

	
	//--------------------------------------------------------------------------------------------//

	@Test
	public void testAddBuscaRemoveAtualizaConta() {
		Main m = new Main();
		try {
			m.addConta(34, "conta1", 25);
			Conta conta = m.buscarConta("conta1", 34);
			assertEquals(conta.getPedido(), "conta1");
			m.atualizarConta(34, "conta2", 25);
			Conta conta2 = m.buscarConta("conta2", 34);
			assertEquals(conta2.getPedido(), "conta2");
			m.RemoveConta(34);
			conta = m.buscarConta("conta2", 34);
			assertNull(conta);
		} catch (IdContaNullException e) {
			fail();
		} catch (ValorContaNullException e) {
			fail();
		} catch (PedidoContaNullException e) {
			 fail();
		} catch (ContaExistenteException e) {
			fail();
		}
	
	}

	//--------------------------------------------------------------------------------------------//
	
	@Test
	public void testAddBuscaRemoveAtualizarPedido() {
		Main m = new Main();
		try {
			m.addPedido("cartao", 45, 5, "almoco1");
			Pedido pedido = m.buscarPedido(45);
			assertEquals(pedido.getForma_pag(), "cartao");
			m.atualizarPedido("dinheiro", 45, 5, "almoco2");
			Pedido pedido2 = m.buscarPedido(45);
			assertEquals(pedido2.getForma_pag(), "dinheiro");
			assertEquals(pedido2.getNome_lanche(), "almoco2");
			m.RemovePedido(45);
			pedido = m.buscarPedido(45);
			assertNull(pedido);
		} catch (FormaPagNullException e) {
			fail();
		} catch (IdPedidoNullException e) {
			fail();
		} catch (QuantiPedidoNullException e) {
			 fail();
		} catch (NomeLancheNullException e) {
			fail();
		}catch (PedidoExistenteException e) {
			fail();
		}
	}

}
