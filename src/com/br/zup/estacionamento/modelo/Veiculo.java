package com.br.zup.estacionamento.modelo;

import java.util.Scanner;

public class Veiculo {
	private String placa = "";
	private String nomeProprietario = "";
	private String tipo = "";

	public Veiculo() {

	}

	public Veiculo(String placa, String nomeProprietario, String tipo) {
		this.placa = placa;
		this.nomeProprietario = nomeProprietario;
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String modelo) {
		this.nomeProprietario = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		String modelo = "";
		modelo += "Tipo do veiculo : " + this.getTipo()+ "\n";
		modelo += "Nome do proprietário : " + this.getNomeProprietario()+ "\n";
		modelo += "Placa do veiculo : " + this.getPlaca();

		return modelo;
	}

	public Veiculo cadastraVeiculo() {
		Scanner scan = entrada();

		System.out.println("Informe seu nome completo por favor :");
		String nomeProprietario = scan.nextLine();

		System.out.println("Informe o tipo do seu veiculo :");
		String tipo = scan.nextLine();

		System.out.println("Digite sua placa :");
		String placa = scan.nextLine();

		Veiculo veiculo = new Veiculo(placa, nomeProprietario, tipo);

		return veiculo;

	}

	public Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

}
