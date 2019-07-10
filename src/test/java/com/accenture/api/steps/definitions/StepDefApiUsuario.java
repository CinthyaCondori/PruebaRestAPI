package com.accenture.api.steps.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured; // Permite la automatizacion de APIS, ENDPOINT o METODOS.
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

public class StepDefApiUsuario {

	String url;

	Response response;

    @Given("^que el tester quiere automatizar en api$")
    public void que_el_tester_quiere_automatizar_en_api() throws Throwable {
		url = "https://api.octoperf.com/public/users/login";
	}

	@When("^se ingresa el usuario (.*) y contrasena (.*)$")
	public void se_ingresa_el_usuario_automatizacionaccenturegmailcom_y_contrasena_automatizacion12(String user, String pass) throws Throwable {
		url += "?password=" + pass + "&username=" + user;
		RestAssured.defaultParser = Parser.JSON; // Lo que hace "defaultParser" es transformar la respuesta en formato JSON
		response = RestAssured.when().post(url); // Usa el "when" de la libreria "RestAssured y ejecuta el metodo API
		System.out.println(response);
	}

	@Then("^la respuesta es igual a (.*) y el parametro Key Token tenga un valor$")
	public void la_respuesta_es_igual_a_y_el_parametro_key_token_tenga_un_valor(int code) throws Throwable {
		response.then().assertThat().statusCode(code);
	}

}