package com.br.zup.estacionamento.modelo;

import java.util.Calendar;
import java.util.Scanner;

//teste
public class Sistema {

	public static void main(String[] args) {
		
		//Criar carro
		Carro carZup = new Carro();
		
		//Entrar com o carro
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 1);
		calendario.set(Calendar.HOUR_OF_DAY, 10);
		calendario.set(Calendar.MINUTE, 20);
		
		//Registra a hora de entrada
		carZup.setEntrada(calendario.getTime());
		//mostrar o horario de entrado do carro
		System.out.println("O carro entrou as " + carZup.getEntrada());
		
		//Sair com o carro 
		Calendar calendario2 = Calendar.getInstance();
		//Registra a hora de saida
		calendario2.set(Calendar.DAY_OF_MONTH, 1);
		calendario2.set(Calendar.HOUR_OF_DAY, 10);
		calendario2.set(Calendar.MINUTE, 36);
		carZup.setSaida(calendario2.getTime());
		//mostrar o horario de saida 
		System.out.println("O carro saiu as " + carZup.getSaida());
		
		//Mostrar quanto tempo ele ficou estacionado
		//Criar objeto Caixa
		Caixa caixaShopping = new Caixa();
		long tempoNoShopping = (long)caixaShopping.calcularTempoParadoNoEstacionamento(carZup.getEntrada(), carZup.getSaida());
		System.out.println("O carro ficou " + tempoNoShopping + " minutos");
		//Mostrar quanto custou a saida
		double valorPago = caixaShopping.calcularQuantoVouPagarNoEstacionamento(tempoNoShopping);
		System.out.println("Foi pago o valor de " + valorPago);
		
		
		//Fazendo com interacao do user
		//Pegando dados da entrada
		Moto motoZuper = new Moto();
		Scanner sc = new Scanner(System.in);
		System.out.println("Que dia voce entrou? ");
		byte dia = sc.nextByte();
		System.out.println("Que hora voce entrou? ");
		byte hora = sc.nextByte();
		System.out.println("Que min voce entrou? ");
		byte min = sc.nextByte();
		
		Calendar calendarioMoto = Calendar.getInstance();
		calendarioMoto.set(Calendar.DAY_OF_MONTH, dia);
		calendarioMoto.set(Calendar.HOUR_OF_DAY, hora);
		calendarioMoto.set(Calendar.MINUTE, min);
		
		motoZuper.setEntrada(calendarioMoto.getTime());
		System.out.println("A moto entrou as " + motoZuper.getEntrada());
		
		//Pegando dados da saida
		System.out.println("Que dia voce saiu? ");
		dia = sc.nextByte();
		System.out.println("Que hora voce saiu? ");
		hora = sc.nextByte();
		System.out.println("Que min voce saiu? ");
		min = sc.nextByte();
		
		calendarioMoto.set(Calendar.DAY_OF_MONTH, dia);
		calendarioMoto.set(Calendar.HOUR_OF_DAY, hora);
		calendarioMoto.set(Calendar.MINUTE, min);
		
		motoZuper.setSaida(calendarioMoto.getTime());
		System.out.println("A moto saiu as " + motoZuper.getSaida());
		
		tempoNoShopping = (long)caixaShopping.calcularTempoParadoNoEstacionamento(motoZuper.getEntrada(), motoZuper.getSaida());
		System.out.println("A Moto ficou " + tempoNoShopping + " minutos");
		//Mostrar quanto custou a saida
		valorPago = caixaShopping.calcularQuantoVouPagarNoEstacionamento(tempoNoShopping);
		System.out.println("Foi pago o valor de " + valorPago);

		
		
		sc.close();
	}	
}
