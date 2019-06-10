package com.br.zup.estacionamento.teste;

import java.util.Calendar;
import java.util.Scanner;

import com.br.zup.estacionamento.modelo.Carro;

public class VeiculoTeste {

	public static void main(String[] args) throws InterruptedException {
		
		Carro carroZup = new Carro();
		
		//Entrou com o Carro dia 12 de Janeiro de 2018 as 08:12:23
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 12);
		calendario.set(Calendar.MONTH, 0);
		calendario.set(Calendar.YEAR, 2018);
		calendario.set(Calendar.HOUR_OF_DAY, 8);
		calendario.set(Calendar.MINUTE, 12);
		calendario.set(Calendar.SECOND, 23);
		calendario.set(Calendar.MILLISECOND, 0);
		
		
		carroZup.setEntrada(calendario.getTime());
		System.out.println(carroZup.getEntrada());
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o dia");
		String line = sc.nextLine();
		calendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(line));

		System.out.println("Informe o mes");
		line = sc.nextLine();
		calendario.set(Calendar.MONTH, Integer.parseInt(line) - 1);
		
		System.out.println("Informe o ano");
		line = sc.nextLine();
		calendario.set(Calendar.YEAR, Integer.parseInt(line));
		sc.close();
		System.out.println(calendario.getTime());
	}
}
