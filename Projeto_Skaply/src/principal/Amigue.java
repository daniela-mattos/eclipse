package principal;

public class Amigue {

	private String nomeAmigue;
	private int telefone;
	private String email;
		
	public String getNomeAmigue() {
		return nomeAmigue;
	}
	public void setNomeAmigue(String nomeAmigue) {
		this.nomeAmigue = nomeAmigue;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Amigue [Nome: " + nomeAmigue + " Telefone: " + telefone + " E-mail: " + email + "] ";
	}
	
}
