package com.view;

import java.util.Scanner;

import com.DTO.CalculadoraDto;
import com.service.CalculadoraService;

public class CalculadoraView {
	
	private Scanner scanner = new Scanner(System.in);
	
	public CalculadoraView() {
	}
		
	public int pedirValor1() {
		System.out.println("Insira o primeiro valor: ");
		int valor1 = scanner.nextInt();
		return valor1;
	}
	
	public int pedirValor2() {
		System.out.println("Insira o primeiro valor: ");
		int valor2 = scanner.nextInt();
		return valor2;
	}
	
	public char pedirOperacao() {
		System.out.println("Qual operação deseja realizar?");
		char operacao = scanner.next().charAt(0);
		return operacao;
	}
	
	public void mostrarResultado(int resultado) {
		System.out.println("O resultado da operação é: " + resultado);
		
	}
}
