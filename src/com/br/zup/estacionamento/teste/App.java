package com.br.zup.estacionamento.teste;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

import com.br.zup.estacionamento.modelo.Caixa;
import com.br.zup.estacionamento.modelo.Carro;

public class App {

	private static final int String = 0;
	private static java.util.Date calendario1;

	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		Caixa caixa = new Caixa();
		Carro carroZup  = new Carro(entrada.next(), entrada.next());
		
		
		Calendar calendario = Calendar.getInstance();
		System.out.println("Insira o dia: ");
		calendario.set(Calendar.DAY_OF_MONTH, entrada.nextInt());
		System.out.println("Insira o mês: ");
		calendario.set(Calendar.MONTH, entrada.nextInt());
		System.out.println("Insira o ano: ");
		calendario.set(Calendar.YEAR, entrada.nextInt());
		System.out.println("Insira a hora : ");
		calendario.set(Calendar.HOUR_OF_DAY, entrada.nextInt());
		System.out.println("insira os minutos: ");
		calendario.set(Calendar.MINUTE, entrada.nextInt());
		
		
		carroZup.setEntrada(calendario.getTime());
		System.out.println("O Carro da Zup entrou: " + carroZup.getEntrada());
		
		Calendar calendarioSaida = Calendar.getInstance();
		carroZup.setSaida(calendarioSaida.getTime());
		
System.out.println("O Carro da Zup saiu: " + carroZup.getSaida());
		
		double quantosMinutosParado = caixa.calcularTempoParadoNoEstacionamento(
				carroZup.getEntrada(), carroZup.getSaida());
		
		double quantasHorasParado = caixa.transformarMinutosEmHora(quantosMinutosParado);
		System.out.println("O carro ficou parado " + quantosMinutosParado + " minutos");
		System.out.println("O carro ficou parado " + quantasHorasParado + " Horas");
		
		
		
	}

}
