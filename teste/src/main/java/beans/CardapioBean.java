package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

import Poo.ed.Cardapio;

@Named
@ApplicationScoped
public class CardapioBean {
	
	private Cardapio cardapio = new Cardapio(); 
	
	private List <Cardapio> cardapios = new ArrayList<>();
	
	public Cardapio getCardapio() {
		return cardapio;
	}
	
	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	
	public List<Cardapio> getCardapios() {
		return cardapios;
	}
	
	public void addCardapio() {
		cardapios.add(getCardapio());
		cardapio = new Cardapio();
	}
	
	public void updateCardapio() {
		for (Cardapio car : cardapios) {
			if(car.getId_cardapio() == cardapio.getId_cardapio()) {
				car.setAlmocos(cardapio.getAlmocos());
				car.setBebidas(cardapio.getBebidas());
				car.setId_cardapio(cardapio.getId_cardapio());
				car.setJantas(cardapio.getJantas());
				car.setLanches(cardapio.getLanches());
				car.setSobremesas(cardapio.getSobremesas());
			}
		}
	}
	public void removeCardapio() {
		for (Cardapio car : cardapios) {
			if(car.getId_cardapio() == cardapio.getId_cardapio()) {
				cardapios.remove(car);
			}
		}
	}
	public void mostrarCardapio() {
		for (Cardapio car : cardapios) {
			if(car.getId_cardapio() == cardapio.getId_cardapio()) {
				System.out.println(car);
			}
		}
	}

}
