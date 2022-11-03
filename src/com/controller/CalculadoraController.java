package com.controller;

import com.DTO.CalculadoraDto;
import com.service.CalculadoraService;
import com.view.CalculadoraView;

public class CalculadoraController {
	
	public static void main(String[] args) {
		
		CalculadoraDto dto = new CalculadoraDto();
		CalculadoraView view = new CalculadoraView();
		CalculadoraService service = new CalculadoraService();
		
		int valor = view.pedirValor1();
		int valor2 = view.pedirValor2();
		char operacao = view.pedirOperacao();
		
		// Construir o seu dto
		
		dto.setValor1(valor);
		dto.setValor2(valor2);
		dto.setOperacao(operacao);
		
		service.calcular(dto);
		
		int resultado = service.calcular(dto);
		
		view.mostrarResultado(resultado);
		
		
	}
	

}
