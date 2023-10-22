package principal;

public class testeUsuario {

	public static void main(String[] args) {
		//declaração de variáveis
		Livro lvr1, lvr2;
		Autor atr1, atr2;
		Editora edtr1, edtr2;
		Genero gnr1, gnr2;
		Pais ps1, ps2;
		Idioma idm1, idm2;
		
		//instanciando variáveis obrigatórias para construir o objeto
		atr1 = new Autor("João Silva");
		edtr1 = new Editora("Aleph");
		gnr1 = new Genero("Romance");
		
		//instanciando Livro
		lvr1 = new Livro(123456, "O grande gatsby", atr1, edtr1, gnr1);
		System.out.println(lvr1);
		
	}

}
