package com.service;

import com.DTO.CalculadoraDto;

public class CalculadoraService {
	
	public int calcular(CalculadoraDto dto) {
		if(dto.getOperacao() == '+') {
			return dto.getValor1() + dto.getValor2();
			
		}else if(dto.getOperacao() == '-') {
			return dto.getValor1() - dto.getValor2();
			
		}else if(dto.getOperacao() == 'x') {
			return dto.getValor1() * dto.getValor2();
			
		}else if(dto.getOperacao() == '/') {
			return dto.getValor1() / dto.getValor2();
		}
		
		return 0;
	}

}
