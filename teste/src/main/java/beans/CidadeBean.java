package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import Poo.ed.Cidade;

@Named
@ViewScoped
public class CidadeBean {
	
	private Cidade cidade = new Cidade(); 
	
	private List <Cidade> cidades = new ArrayList<>();
	
	public Cidade getCidade() {
		return cidade;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public List<Cidade> getCidades() {
		return cidades;
	}
	
	public void addCidade() {
		cidades.add(getCidade());
		cidade = new Cidade();
	}
	
	public void updateCidade() {
		for (Cidade cid : cidades) {
			if(cid.getCep() == cidade.getCep()) {
				cid.setCep(cidade.getCep());
				cid.setNome(cidade.getNome());
			}
		}
	}
	public void removeCidade() {
		for (Cidade cid : cidades) {
			if(cid.getCep() == cidade.getCep()) {
				cidades.remove(cid);
			}
		}
	}
	public void mostrarCidade() {
		for (Cidade cid : cidades) {
			if(cid.getCep() == cidade.getCep()) {
				System.out.println(cid);
			}
		}
	}

}
