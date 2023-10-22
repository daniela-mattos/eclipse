package principal;

import java.util.Date;

public class RegistraLeitura {

	private LivroAdquirido titulo;
	private int paginasLidas;
	private String anotacao;
	private Date dataLeitura;
	
	public RegistraLeitura(LivroAdquirido titulo, int paginasLidas, String anotacao, Date dataLeitura) {
		this.titulo = titulo;
		this.paginasLidas = paginasLidas;
		this.anotacao = anotacao;
		this.dataLeitura = dataLeitura;
	}

	public LivroAdquirido getTitulo() {
		return titulo;
	}

	public void setTitulo(LivroAdquirido titulo) {
		this.titulo = titulo;
	}

	public int getPaginasLidas() {
		return paginasLidas;
	}

	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}

	public String getAnotacao() {
		return anotacao;
	}

	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}

	public Date getDataLeitura() {
		return dataLeitura;
	}

	public void setDataLeitura(Date dataLeitura) {
		this.dataLeitura = dataLeitura;
	}
	
	
	
}
