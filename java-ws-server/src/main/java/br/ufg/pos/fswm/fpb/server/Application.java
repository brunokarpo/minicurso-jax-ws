package br.ufg.pos.fswm.fpb.server;

import javax.xml.ws.Endpoint;

public class Application {

	 public static void main(String[] args) {
		System.out.println("Aplicação iniciada no servidor local respondendo na porta 9999");
		Endpoint.publish("http://localhost:9999/pessoa", new CadastroPessoaEndPoint());
	}

}
