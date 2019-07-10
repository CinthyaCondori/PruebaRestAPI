#Author: c.condori.chavarria@accenture.com


@Feature1
Feature: Validar_usuario

COMO usuario automatizacion.accenture@gmail.com
QUIERO automartizar pruebas Rest API
PARA presentar una demo


@tag1
Scenario: Usuario_Contrasena_Correcta
Given que el tester quiere automatizar en api
When se ingresa el usuario automatizacion.accenture@gmail.com y contrasena automatizacion12
Then la respuesta es igual a 200 y el parametro Key Token tenga un valor

@tag2
Scenario: Usuario_Valido_Contrasena_Incorrecta
Given que el tester quiere automatizar en api
When se ingresa el usuario automatizacion.accenture@gmail.com y contrasena automatizacion1
Then la respuesta es igual a 404 y el parametro Key Token tenga un valor