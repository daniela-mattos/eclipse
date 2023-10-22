package principal;

import java.util.Date;

public class LivroAdquirido {

	private Livro livroAdq;
	private String formato;
	private boolean disponivel;
	private Date dataAdq;
	private String aquisicao;
	private Estante estante;
	private Idioma idioma;
	
	public LivroAdquirido(Livro livroAdq, Estante estante, String formato, String aquisicao, Idioma idioma, Date dataAdq) {
		this.livroAdq = livroAdq;
		this.estante = estante;
		this.formato = formato;
		this.aquisicao = aquisicao;
		this.idioma = idioma;
		this.dataAdq = dataAdq;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void registraFicha() {
		
	}

	public Livro getLivroAdq() {
		return livroAdq;
	}

	public void setLivroAdq(Livro livroAdq) {
		this.livroAdq = livroAdq;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public Date getDataAdq() {
		return dataAdq;
	}

	public void setDataAdq(Date dataAdq) {
		this.dataAdq = dataAdq;
	}

	public String getAquisicao() {
		return aquisicao;
	}

	public void setAquisicao(String aquisicao) {
		this.aquisicao = aquisicao;
	}

	public Estante getEstante() {
		return estante;
	}

	public void setEstante(Estante estante) {
		this.estante = estante;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	
	
	
}
