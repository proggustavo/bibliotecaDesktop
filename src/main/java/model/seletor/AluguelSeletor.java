package model.seletor;

import util.Constants;

public class AluguelSeletor {
	
	private String termoPesquisa;
	private String buscarPor;
	

	public boolean temFiltro() {
		boolean temFiltroPreenchido = false;
		//TODO melhorar essas verificacoes
		temFiltroPreenchido = (termoPesquisa != null && !termoPesquisa.isBlank())
				|| !buscarPor.isBlank();
		return temFiltroPreenchido;
	}
	
	public AluguelSeletor validarFitros(AluguelSeletor seletor){
		//TODO melhorar essas verificacoes
		seletor.setTermoPesquisa(
				termoPesquisa = seletor.getTermoPesquisa().equals(Constants.PLACECHOLDEDRPESQUISA) ? "" : seletor.getTermoPesquisa());
		return seletor;
	}	
	
	public String getTermoPesquisa() {
		return termoPesquisa;
	}
	public void setTermoPesquisa(String termoPesquisa) {
		this.termoPesquisa = termoPesquisa;
	}
	public String getBuscarPor() {
		return buscarPor;
	}
	public void setBuscarPor(String buscarPor) {
		this.buscarPor = buscarPor;
	}

}
