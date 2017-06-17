package br.ufg.pos.fswm.fpb.client;

import br.ufg.pos.fswm.fpb.generated.CadastroPessoaEndPoint;
import br.ufg.pos.fswm.fpb.generated.CadastroPessoaEndPointService;
import br.ufg.pos.fswm.fpb.generated.Pessoa;
import br.ufg.pos.fswm.fpb.generated.Sexo;

public class Application {

	public static void main(String[] args) {
		System.out.println("Criando servico de conexão: ");
		CadastroPessoaEndPointService service = new CadastroPessoaEndPointService();
		CadastroPessoaEndPoint endPoint = service.getCadastroPessoaEndPointPort();

/*		System.out.println("Criando pessoa para ser persistida");
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Luan Oliveira");
		pessoa1.setSexo(Sexo.MASCULINO);

		System.out.println("Persistindo pessoa");
		endPoint.cadastrarPessoa(pessoa1);
*/
		System.out.println("Buscando pessoa com o código 2");
		Pessoa outra = endPoint.buscarPorCodigo(2);

		System.out.println("Codigo: " + outra.getCodigo());
		System.out.println("Nome: " + outra.getNome());
		System.out.println("Sexo: " + outra.getSexo().name());
	}

}
