package com.br.zup.estacionamento.teste;

import java.util.Calendar;

import com.br.zup.estacionamento.modelo.Carro;

public class CarroTeste {

	public static void main(String[] args) throws InterruptedException {

		Carro c = new Carro();
		System.out.println("Carro Entrada " + c.getEntrada());
		System.out.println("Carro Saida " + c.getSaida());
		
		c.setEntrada(Calendar.getInstance().getTime());
		Thread.sleep(10000);//Parando o programa por 1 seg
		c.setSaida(Calendar.getInstance().getTime());
		
		System.out.println("Carro Entrada " + c.getEntrada());
		System.out.println("Carro Saida " + c.getSaida());
	}
}
