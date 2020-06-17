package controller;

import java.util.ArrayList;

import model.bo.AluguelBO;
import model.seletor.AluguelSeletor;
import model.vo.Aluguel;

public class AluguelController {
	
	private AluguelBO aluguelBO = new AluguelBO();
	public ArrayList<Aluguel> consultarAluguelPorSeletor(AluguelSeletor aluguelSeletor) {
		return aluguelBO.consultarAluguelPorSeletor(aluguelSeletor);
	}
	
	

}
