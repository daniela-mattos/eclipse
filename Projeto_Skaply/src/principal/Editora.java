package principal;

public class Editora {

	private String nomeEditora;

	public Editora(String editora) {
		this.setNomeEditora(editora);
	}

	public String getNomeEditora() {
		return nomeEditora;
	}

	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	
	public String toString() {
		return "Editora [Nome da Editora: " + nomeEditora + "] ";
	}
}
