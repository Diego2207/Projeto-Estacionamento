package com.br.zup.estacionamento.modelo;

import java.util.Scanner;

public class Sistema {
	
	private double horaEntrada = 0;
	private double horaSaida = 0;
	private double precoPeriodo = 10;
	private double precoAdicional = 5;

	public Sistema(double horaEntrada, double horaSaida, double precoPeriodo, double precoAdicional) {
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.precoPeriodo = precoPeriodo;
		this.precoAdicional = precoAdicional;
	}

	public Sistema() {

	}

	public double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public double getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}

	public double getPrecoPeriodo() {
		return precoPeriodo;
	}

	public void setPrecoPeríodo(double precoPeriodo) {
		this.precoPeriodo = precoPeriodo;
	}

	public double getPrecoAdicional() {
		return precoAdicional;
	}

	public void setPrecoAdicional(double precoAdicional) {
		this.precoAdicional = precoAdicional;
	}

	public String toString() {
		String modelo = "";

		modelo += "Hora de entrada : " + this.getHoraEntrada()+ "\n";
		modelo += "Hora de saida : " + this.getHoraSaida()+ "\n";

		return modelo;
	}

	public Sistema inserirHoraEntrada() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Sistema novaEntrada = new Sistema();

		System.out.println("Digite a hora da entrada :");
		double hora = scan.nextDouble();
		novaEntrada.setHoraEntrada(hora);

		return novaEntrada;

	}

	public void caculaValor(Sistema primeiraEntrada) {
		Scanner scan = entrada();
		Sistema sistema = primeiraEntrada;
		double valor = 0;

		System.out.println(sistema);

		System.out.println("\nDigite a hora da saida :\n");
		double saida = scan.nextDouble();
		sistema.setHoraSaida(saida);

		System.out.println(sistema);

		double estadia = (sistema.getHoraSaida() - sistema.getHoraEntrada());

		if (estadia <= 0.15) {
			valor = 0;
		} else if (estadia > 0.15 && estadia <= 1) {
			valor = sistema.getPrecoPeriodo();
		} else if (estadia > 1) {

			double hora = Math.ceil(estadia - 1);
			int horaAdicional = (int) hora;

			valor = sistema.getPrecoPeriodo() + (horaAdicional * sistema.getPrecoAdicional());

		}

		System.out.println("Total de estadia :\n" + estadia);

		System.out.println("\nTotal a pagar :\n" + valor);

	}

	public Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
}

}
