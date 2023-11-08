package principal;

public class Pais {

	private String nomePais;
	private Idioma idioma;


public Pais(String nome, Idioma idioma) {
	setNomePais(nome);
	this.setIdiomaPais(idioma);
}


public String getNomePais() {
	return nomePais;
}


public void setNomePais(String nomePais) {
	this.nomePais = nomePais;
}


public Idioma getIdiomaPais() {
	return idioma;
}


public void setIdiomaPais(Idioma idioma) {
	this.idioma = idioma;
}

public String toString() {
    return "País [País: " + nomePais + ", Idioma: " + idioma + "] ";
}

}