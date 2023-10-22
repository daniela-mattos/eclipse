package principal;

public class Pais {

	private String nomePais;
	private Idioma idiomaPais;


public Pais(String nome, Idioma idiomaPais) {
	setNomePais(nome);
	this.setIdiomaPais(idiomaPais);
}


public String getNomePais() {
	return nomePais;
}


public void setNomePais(String nomePais) {
	this.nomePais = nomePais;
}


public Idioma getIdiomaPais() {
	return idiomaPais;
}


public void setIdiomaPais(Idioma idiomaPais) {
	this.idiomaPais = idiomaPais;
}

public String toString() {
    return "País [País: " + nomePais + ", Idioma: " + idiomaPais + "] ";
}

}