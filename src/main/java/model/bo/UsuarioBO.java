package model.bo;

import java.util.ArrayList;

import model.dao.UsuarioDAO;
import model.seletor.UsuarioSeletor;
import model.vo.Endereco;
import model.vo.Usuario;
import util.GeradorPlanilha;

public class UsuarioBO {
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	public ArrayList<Usuario> consultarUsuarioPorFiltro(UsuarioSeletor usuarioSeletor) {
		return usuarioDAO.consultarUsuarioPorFiltro(usuarioSeletor);
	}
	public Boolean alterarUsuario(Usuario usuarioAlterado) {
		return usuarioDAO.alterar(usuarioAlterado);
	}
	
	public void gerarRelatorio(ArrayList<Usuario> usuarios, String caminhoEscolhido) {
		 GeradorPlanilha.gerarPlanilhaUsuarios(usuarios, caminhoEscolhido);
	}
	public Usuario cadastrarUsuario(Usuario usuario) {
		return usuarioDAO.salvar(usuario);
		 
	}
	public static boolean existeUsuarioPorCpf(Usuario usuario) {
		return UsuarioDAO.existeUsuarioPorCpf(usuario.getCpf());
	}
	public boolean excluirUsuario(Usuario usuario) {
		return UsuarioDAO.excluir(usuario);
	}
}
