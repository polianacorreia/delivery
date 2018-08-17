package Poo.ed;

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

public interface Delivery {

	//Cliente\\
	
	public void addCliente(int idCliente, String nome, String tel_cliente, String endereco)
			throws IdClienteNullException, NomeClienteNullException, EnderecoNullException, ClienteExistenteException;
	
	public void removeCliente(int idCliente)
			throws IdClienteNullException;
	
	public Cliente buscarCliente(String nome, int idCliente)
			throws IdClienteNullException, NomeClienteNullException;
	
	//Restaurante\\
	
	public void addRestaurante (String endereco, int idResta, String tel, String nome)
			throws IdRestaNullException, NomeRestaNullException, EnderecoNullException, RestauranteExistenteException;
	
	public void RemoveRestaurante(int idResta)
			throws IdRestaNullException;
	
	public Resta buscarRestaurante(String nome, int idResta)
			throws IdRestaNullException, NomeRestaNullException;
	
	//Cardapio - Bebida\\
	
	public void addBebida (String nome, String tipo, String marca, int idBebida, float preco)
			throws IdBebidaNullException, NomeBebidaNullException, TipoBebidaNullException, MarcaBebidaNullException, PrecoBebidaNullException, BebidaExistenteException;
	
	public void RemoveBebida(int idBebida)
			throws IdBebidaNullException;
	
	public Bebida buscarBebida(int idBebida)
			throws IdBebidaNullException, NomeBebidaNullException;
	
	//Cardapio - Almoco\\
	
	public void addAlmoco (String nome, String acompanhamento, int idAlmoco, float preco)
			throws IdAlmocoNullException, NomeAlmocoNullException, PrecoAlmocoNullException, AlmocoExistenteException; 
	
	public void RemoveAlmoco(int idAlmoco)
			throws IdAlmocoNullException;
	
	public Almoco buscarAlmoco(String nome, int idAlmoco)
			throws IdAlmocoNullException, NomeAlmocoNullException;
	
	//Cardapio - Lanche\\
	
		public void addLanche (String nome, String tipo, int idLanche, float preco)
				throws IdLancheNullException, NomeLancheNullException, PrecoLancheNullException, LancheExistenteException; 
		
		public void RemoveLanche(int idLanche)
				throws IdLancheNullException;
		
		public Lanche buscarLanche(String nome, int idLanche)
				throws IdLancheNullException, NomeLancheNullException;
		
		
	//Cardapio - Janta//
		
		public void addJanta (String nome, float preco, String acompanhamentos, int idJantar)
				throws IdJantaNullException, PrecoJantaNullException, IdJantarNullException, JantaExistenteException; 
		
		public void RemoveJanta(int idJanta)
				throws IdJantaNullException;
		
		public Jantar buscarJanta(String nome, int idJanta)
				throws IdJantaNullException, NomeJantaNullException;
		
	//Cardapio - Sobremesa//
		
		public void addSobremesa (String nome, float preco, String tipo, int idSobremesa)
				throws IdSobremesaNullException, PrecoSobremesaNullException, NomeSobremesaNullException, SobremesaExistenteException; 
				
		public void RemoveSobremesa(int idSobremesa)
				throws IdSobremesaNullException;
				
		public Sobremesa buscarSobremesa(String nome, int idSobremesa)
				throws IdSobremesaNullException, NomeSobremesaNullException;
		
	//Garcom\\
	
	public void addGarcom (String nome, int idGarcom)
			throws IdGarcomNullException, NomeGarcomNullException, GarcomExistenteException; 
	
	public void RemoveGarcom(int idGarcom)
			throws IdGarcomNullException;
	
	public Garcom buscarGarcom(String nome, int idGarcom)
			throws IdGarcomNullException, NomeGarcomNullException; 
	
	//Entregador\\
	
		public void addEntregador (int idEntregador, String contato, String nome)
				throws IdEntregadorNullException, ContatoEntregadorNullException, NomeEntregadorNullException, EntregadorExistenteException; 
		
		public void RemoveEntregador(int idEntregador)
				throws IdEntregadorNullException;
		
		public Entregador buscarEntregador(String nome, int idEntregador)
				throws NomeEntregadorNullException,IdEntregadorNullException;
		
	//Conta\\
		
		public void addConta (int idConta, String pedido, int valor)
				throws IdContaNullException, ValorContaNullException, PedidoContaNullException, ContaExistenteException; 
			
		public void RemoveConta(int idEntregador)
				throws IdContaNullException;
			
		public Conta buscarConta(String nome, int idEntregador)
				throws IdContaNullException;
		
	//Pedido\\
		
		public void addPedido (String formaPag, int idPedido, int quantiPedido, String nomeLanche)
				throws FormaPagNullException, IdPedidoNullException, QuantiPedidoNullException, NomeLancheNullException, PedidoExistenteException; 
					
		public void RemovePedido(int idPedido)
				throws IdPedidoNullException;
					
		public Pedido buscarPedido(int idPedido)
				throws IdPedidoNullException;
	
		
}