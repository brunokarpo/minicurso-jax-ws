package br.ufg.pos.fswm.fpb.server;

import java.util.ArrayList;
import java.util.List;

import br.ufg.pos.fswm.fpb.server.modelo.Pessoa;

public class PessoaRepositorioImpl implements PessoaRepositorio {

	private static PessoaRepositorioImpl instance;
	private List<Pessoa> pessoas;

	private PessoaRepositorioImpl() {
		// Classe singleton
		pessoas = new ArrayList<Pessoa>();
	}

	public static PessoaRepositorioImpl getInstanceOf() {
		if (instance == null) {
			instance = new PessoaRepositorioImpl();
		}
		return instance;
	}

	public void salvar(Pessoa pessoa) {
		// Coloco o código de acordo com o tamanho da lista
		pessoa.setCodigo(pessoas.size() + 1);

		pessoas.add(pessoa);

	}

	public Pessoa buscarPorCodigo(int codigo) {
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getCodigo() == codigo) {
				return pessoa;
			}
		}
		return null;
	}

}
