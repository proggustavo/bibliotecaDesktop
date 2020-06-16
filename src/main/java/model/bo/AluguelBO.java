package model.bo;

import java.util.ArrayList;

import model.dao.AluguelDAO;
import model.seletor.AluguelSeletor;
import model.vo.Aluguel;

public class AluguelBO {
	private AluguelDAO aluguelDAO = new AluguelDAO();
	
	public ArrayList<Aluguel> consultarExemplarLivroSeletor(AluguelSeletor aluguelSeletor) {
		return aluguelDAO.consultarExemplarLivroSeletor(aluguelSeletor);
	}

}
