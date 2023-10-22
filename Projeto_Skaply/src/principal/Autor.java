package principal;

public class Autor {

	private String nomeAutor;
	private String corAutor;
	private String generoAutor;
	private Pais paisAutor;
	
	
	public Autor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	public Autor(String nomeAutor, String corAutor, String generoAutor) {
		this.nomeAutor = nomeAutor;
		this.corAutor = corAutor;
		this.generoAutor = generoAutor;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getCorAutor() {
		return corAutor;
	}

	public void setCorAutor(String corAutor) {
		this.corAutor = corAutor;
	}

	public String getGeneroAutor() {
		return generoAutor;
	}

	public void setGeneroAutor(String generoAutor) {
		this.generoAutor = generoAutor;
	}

	public Pais getPaisAutor() {
		return paisAutor;
	}

	public void setPaisAutor(Pais paisAutor) {
		this.paisAutor = paisAutor;
	}
	
	public String toString() {
		return "Autor [Nome do Autor: " + nomeAutor + ", Cor do autor: " + corAutor + ", Gênero do autor: " 
	+ generoAutor + ", País do Autor: " + paisAutor + "]";
	}

	
}
