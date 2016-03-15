package br.com.ws;
import javax.jws.WebService;

@WebService
public class WbResource {
	
	
	public String hello() {
		return "Hello World WS!";
	}

}
