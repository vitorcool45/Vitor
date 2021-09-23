package br.org.generation.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class Habilidadescontroller {

	@GetMapping
	public String mostrarhabilidades()
	{
		return "Dentro deste código irei realizar as duas perguntas das atividades, onde a primeira"
				+ "eu usei a habilidade de comunicação com meu grupo do Projeto Integrador para fazermos "
				+ "uma live code com todos para tirar as dúvidas e nos auxiliarmos, aassim como na "
				+ "mentalidade eu usei a atenção aos detalhes para ver se consegui aprender e explicar "
				+ "o que eu fiz para o grupo e a de persistecia já que é um assunto novo e tive dificuldade de entendimento."
				+ "E os objetivos utilizados nessa semana foi sempre ficar atento a explicação e focar nos detalhes onde tenho mais "
				+ "dificuldade, e sempre persistindo com os assunto novos mantendo a calma e confiando no processo";
	}
				
	}
