package br.ufg.pos.fswm.fpb.server;

import br.ufg.pos.fswm.fpb.server.modelo.Pessoa;

public interface PessoaRepositorio {

	void salvar(Pessoa pessoa);

	Pessoa buscarPorCodigo(int codigo);

}
