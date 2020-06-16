package controller;

import java.util.ArrayList;

import model.bo.AluguelBO;
import model.seletor.AluguelSeletor;
import model.vo.Aluguel;

public class AluguelController {
	
	private AluguelBO aluguelBO = new AluguelBO();
	public ArrayList<Aluguel> consultarExemplarLivroSeletor(AluguelSeletor aluguelSeletor) {
		return aluguelBO.consultarExemplarLivroSeletor(aluguelSeletor);
	}
	
	

}
