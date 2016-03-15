package br.com.teste;

import javax.xml.ws.Endpoint;

import br.com.ws.WbResource;

public class TesteWb {
	
	public static void main(String[] args) {
		WbResource wbResource = new WbResource();
		String url = "http://localhost:8080/WbResource";
		
		System.out.println("EstoqueWS rodando: " + url);

        //associando URL com implementacao
        Endpoint.publish(url, wbResource);
	}

}
