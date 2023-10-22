package principal;

import java.util.ArrayList;
import java.util.List;

public class Colecao {
	
	private String nomeColecao;
	private String tema;
	private List<LivroAdquirido> livrosColecao = new ArrayList<LivroAdquirido>();
	
	
	public Colecao(String nomeColecao) {
		this.nomeColecao = nomeColecao;
	}
	
	public Colecao(String nomeColecao, String tema, LivroAdquirido livroColecao) {
		this.nomeColecao = nomeColecao;
		this.tema = tema;
		this.adicionaLivroColecao(livroColecao);
	}

	public String getNomeColecao() {
		return nomeColecao;
	}

	public void setNomeColecao(String nomeColecao) {
		this.nomeColecao = nomeColecao;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public void adicionaLivroColecao(LivroAdquirido livroColecao) {
		this.livrosColecao.add(livroColecao);
	}
	
	public List<LivroAdquirido> getLivrosColecao() {
		return livrosColecao;
	}
}
