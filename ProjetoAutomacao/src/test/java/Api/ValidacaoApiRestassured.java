package Api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidacaoApiRestassured {
	
	
	@Test
	public void statusCode() {
		
		//nesta linha abaixo usamos o restassured para comunicar com api get.
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		//syso para imprimir no console o status code.
		System.out.println("Status Code is " + response.getStatusCode());
		//usamos o restassured para guardar o status code retornado pela api em uma variavel.
	   int code = response.getStatusCode();
	   //usamos o Junit para validar se o retorno do Status da API é igual ao retorno esperado.
	   assertEquals(200, code);
	   
	   }
	
	@Test
	public void validarEmail() {
		
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		String email = response.asPrettyString();
		String emailEsperado = "janet.weaver@reqres.in";
		assertTrue(email.contains(emailEsperado));
		System.out.println(email.contains(emailEsperado));
		
	}	

}
