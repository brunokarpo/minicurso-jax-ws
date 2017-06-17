package br.ufg.pos.fswm.fpb.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.ufg.pos.fswm.fpb.server.modelo.Pessoa;

@WebService
public class CadastroPessoaEndPoint {

	private CadastroPessoaServico cadastroPessoaServico;

	public CadastroPessoaEndPoint() {
		cadastroPessoaServico = new CadastroPessoaServico();
	}

	@WebMethod
	public void cadastrarPessoa(Pessoa pessoa) {
		cadastroPessoaServico.cadastrar(pessoa);
	}

	@WebMethod
	public Pessoa buscarPorCodigo(int codigo) {
		return cadastroPessoaServico.pesquisarPorCodigo(codigo);
	}

}
