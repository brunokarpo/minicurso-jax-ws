package br.ufg.pos.fswm.fpb.server;

import br.ufg.pos.fswm.fpb.server.modelo.Pessoa;

public class CadastroPessoaServico {

	private PessoaRepositorio repositorio;

	public CadastroPessoaServico() {
		repositorio = PessoaRepositorioImpl.getInstanceOf();
	}

	public void cadastrar(Pessoa pessoa) {
		repositorio.salvar(pessoa);
	}

	public Pessoa pesquisarPorCodigo(int codigo) {
		return repositorio.buscarPorCodigo(codigo);
	}

}
