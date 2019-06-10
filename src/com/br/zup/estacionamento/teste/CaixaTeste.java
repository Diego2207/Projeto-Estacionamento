package com.br.zup.estacionamento.teste;

import java.util.Calendar;

import com.br.zup.estacionamento.modelo.Caixa;
import com.br.zup.estacionamento.modelo.Carro;

public class CaixaTeste {

	
	public static void main(String[] args) {
		Caixa caixa = new Caixa();
		Carro carroZup  = new Carro("","");
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 9);
		calendario.set(Calendar.MONTH, 5);
		calendario.set(Calendar.YEAR, 2019);
		calendario.set(Calendar.HOUR_OF_DAY, 13);
		calendario.set(Calendar.MINUTE, 22);
		calendario.set(Calendar.SECOND, 10);
		calendario.set(Calendar.MILLISECOND, 0);
		
		carroZup.setEntrada(calendario.getTime());
		System.out.println("O Carro da Zup entrou: " + carroZup.getEntrada());
		
		Calendar calendarioSaida = Calendar.getInstance();
		calendarioSaida.set(Calendar.DAY_OF_MONTH, 9);
		calendarioSaida.set(Calendar.MONTH, 5);
		calendarioSaida.set(Calendar.YEAR, 2019);
		calendarioSaida.set(Calendar.HOUR_OF_DAY, 13);
		calendarioSaida.set(Calendar.MINUTE, 32);
		calendarioSaida.set(Calendar.SECOND, 10);
		calendarioSaida.set(Calendar.MILLISECOND, 0);
		carroZup.setSaida(calendarioSaida.getTime());
		
		System.out.println("O Carro da Zup saiu: " + carroZup.getSaida());
		
		double quantosMinutosParado = caixa.calcularTempoParadoNoEstacionamento(
				carroZup.getEntrada(), carroZup.getSaida());
		
		double quantasHorasParado = caixa.transformarMinutosEmHora(quantosMinutosParado);
		System.out.println("O carro ficou parado " + quantosMinutosParado + " minutos");
		System.out.println("O carro ficou parado " + quantasHorasParado + " Horas");
		
		
		
	}
}
