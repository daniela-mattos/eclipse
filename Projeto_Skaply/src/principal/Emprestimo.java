package principal;

import java.util.Date;

public class Emprestimo {
	
	private Date dataEmp;
	private Amigue nomeAmigue;
	private LivroAdquirido tituloEmp;
	
	
	public Emprestimo(Amigue nomeAmigue, LivroAdquirido tituloEmp, Date dataEmp) {
		this.nomeAmigue = nomeAmigue;
		this.tituloEmp = tituloEmp;
		this.dataEmp = dataEmp;
	}


	public Date getDataEmp() {
		return dataEmp;
	}


	public void setDataEmp(Date dataEmp) {
		this.dataEmp = dataEmp;
	}


	public Amigue getNomeAmigue() {
		return nomeAmigue;
	}


	public void setNomeAmigue(Amigue nomeAmigue) {
		this.nomeAmigue = nomeAmigue;
	}


	public LivroAdquirido getTituloEmp() {
		return tituloEmp;
	}


	public void setTituloEmp(LivroAdquirido tituloEmp) {
		this.tituloEmp = tituloEmp;
	}
		
	
}
