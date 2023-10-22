package principal;

import java.util.ArrayList;
import java.util.List;

public class Estante {
	
	private String nomeEstante;
	private String local;
	private int capacidade;
	private List<LivroAdquirido> livrosEstante = new ArrayList<LivroAdquirido>();
	
	public Estante(String nomeEstante, String local) {
		this.nomeEstante = nomeEstante;
		this.local = local;
	}
	
	public String getNomeEstante() {
		return nomeEstante;
	}

	public void setNomeEstante(String nomeEstante) {
		this.nomeEstante = nomeEstante;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade (int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void adicionaLivroEstante(LivroAdquirido livroAdq) {
		this.livrosEstante.add(livroAdq);
	}
	
	public List<LivroAdquirido> getLivrosEstante() {
		return livrosEstante;
	}
	
}
