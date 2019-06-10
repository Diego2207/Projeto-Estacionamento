package com.br.zup.estacionamento.teste;

import java.util.Calendar;

import com.br.zup.estacionamento.modelo.Moto;

public class MotoTeste {

	public static void main(String[] args) throws InterruptedException {
		Moto m = new Moto();
		System.out.println("Moto Entrada " + m.getEntrada());
		System.out.println("Moto Saida " + m.getSaida());
		
		m.setEntrada(Calendar.getInstance().getTime());
		Thread.sleep(1000);//Parando o programa por 1 seg
		m.setSaida(Calendar.getInstance().getTime());
		
		System.out.println("Moto Entrada " + m.getEntrada());
		System.out.println("Moto Saida " + m.getSaida());
		
	}
}
