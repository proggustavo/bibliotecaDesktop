package model.bo;

import java.util.ArrayList;

import model.dao.AluguelDAO;
import model.seletor.AluguelSeletor;
import model.vo.Aluguel;

public class AluguelBO {
	private AluguelDAO aluguelDAO = new AluguelDAO();
	
	public ArrayList<Aluguel> consultarAluguelPorSeletor(AluguelSeletor aluguelSeletor) {
		return aluguelDAO.consultarAluguelPorSeletor(aluguelSeletor);
	}

}
