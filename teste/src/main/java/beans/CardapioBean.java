package beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Poo.ed.Cardapio;
import services.CardapioService;

@Named
@ApplicationScoped
public class CardapioBean implements Serializable{
	
	@Inject
	private CardapioService service;
	
	private Cardapio cardapio; 
	
	private Collection<Cardapio> cardapios;
	
	public Cardapio getCardapio() {
		return cardapio;
	}
	
	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	
	public Collection<Cardapio> getCardapios() {
		return cardapios;
	}
	
	@PostConstruct
	public void init() {
		cardapio = newEntidade();
		cardapios = getService().getAll();
	}

	public void remove(Cardapio entidade) {
		getService().remove(entidade);
		limpar();
	}

	public void save() {
		getService().save(cardapio);
		limpar();
	}

	public void editar(Long id) {
		this.getCardapio().setId(id);
		save();
	}

	public void limpar() {
		cardapios = getService().getAll();
		cardapio = newEntidade();
	}

	protected Cardapio newEntidade() {
		return new Cardapio();
	}

	public CardapioService getService() {
		return service;
	}

}
