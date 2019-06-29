package com.br.zup.estacionamento.modelo;

import java.util.List;
import java.util.Scanner;

public class Vaga {
	private String tipoVaga = "";
	private int numeroVaga = 0;
	private Veiculo veiculos = null;
	private Sistema sistema = null;

	public Vaga() {
		super();
	}

	public Vaga(String tipoVaga, int numeroVaga, Veiculo veiculos, Sistema sistema) {
		this.numeroVaga = numeroVaga;
		this.tipoVaga = tipoVaga;
		this.veiculos = veiculos;
		this.sistema = sistema;
	}

	public String getTipoVaga() {
		return tipoVaga;
	}

	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}

	public Veiculo getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculo veiculos) {
		this.veiculos = veiculos;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setCatraca(Sistema sistema) {
		this.sistema = sistema;
	}

	public int getNumeroVaga() {
		return numeroVaga;
	}

	public void setNumeroVaga(int numeroVaga) {
		this.numeroVaga = numeroVaga;
	}

	public int quantidadeVagaIdoso(int vagasCarros) {

		int vagas = (int) (vagasCarros * 0.05);
		return vagas;

	}

	public int quantidadeVagaDeficiente(int vagasCarros) {

		int vagas = (int) (vagasCarros * 0.02);
		return vagas;

	}

	public List<Vaga> nomearVagas(List<Vaga> vagas, int vagasIdoso, int vagasDeficiente, int vagasComum,
			int vagasMotos) {

		for (int i = 1; i <= vagasDeficiente; i++) {
			String tipo = "D";
			int numero = i;
			Vaga vagaD = new Vaga(tipo, numero, null, null);

			vagas.add(vagaD);

		}
		for (int i = 1; i <= vagasIdoso; i++) {
			String tipo = "I";
			int numero = i;
			Vaga vagaI = new Vaga(tipo, numero, null, null);

			vagas.add(vagaI);
		}

		for (int i = 1; i <= vagasComum; i++) {
			String tipo = "C";
			int numero = i;
			Vaga vagasC = new Vaga(tipo, numero, null, null);

			vagas.add(vagasC);
		}
		for (int i = 1; i <= vagasMotos; i++) {
			String tipo = "M";
			int numero = i;
			Vaga vagasM = new Vaga(tipo, numero, null, null);

			vagas.add(vagasM);
		}

		return vagas;
	}

	public void exibirVagas(List<Vaga> listaVagas) {

		for (Vaga vagas : listaVagas) {
			System.out.println(vagas);
		}
	}

	public List<Vaga> entradaVeiculos(List<Vaga> listaVagas) {
		Scanner scan = entrada();
		Veiculo veiculo = new Veiculo();
		Sistema entrada = new Sistema();

		System.out.println("Identificação das vagas\n" 
				+ "\n(C) Vagas para carros comuns\n" 
				+ "(I) Vagas para idosos\n"
				+ "(D) Vagas para Deficientes\n" 
				+ "(M) Vagas para motos\n");

		System.out.println("Digite em qual vaga deseja estacionar o seu veiculo \n" + "Primeiro o tipo da vaga : ");
		String tipoVaga = scan.nextLine();

		System.out.println("Agora nos informe o numero da vaga");
		int numero = scan.nextInt();

		for (int i = 0; i < listaVagas.size(); i++) {
			Vaga vaga = listaVagas.get(i);

			if (tipoVaga.equalsIgnoreCase(vaga.getTipoVaga()) && numero == vaga.getNumeroVaga()
					&& vaga.getVeiculos() == null) {

				veiculo = veiculo.cadastraVeiculo();
				entrada = entrada.inserirHoraEntrada();

				vaga.setVeiculos(veiculo);
				vaga.setCatraca(entrada);

			} else if (tipoVaga.equalsIgnoreCase(vaga.getTipoVaga()) && vaga.getVeiculos() != null) {
				System.out.println("Vaga não disponivel");
			}
		}

		return listaVagas;
	}

	public List<Vaga
	> retiraVeiculo(List<Vaga> vagas) {
		Scanner scan = entrada();
		Veiculo veiculo = new Veiculo();
		Sistema sistema = new Sistema();
		System.out
				.println("Para retirada do veiculo \n" + "Digite o tipo da vaga : ");
		String tipo = scan.nextLine();

		System.out.println("Agora digite o numero da vaga");
		int numero = scan.nextInt();
		int i = 0;

		for (i = 0; i < vagas.size(); i++) {
			Vaga vagas2 = vagas.get(i);

			if (vagas2.getTipoVaga().equalsIgnoreCase(tipo) && vagas2.getNumeroVaga() == numero) {
				veiculo = vagas2.getVeiculos();
				sistema = vagas2.getSistema();

				System.out.println(veiculo);

				sistema.caculaValor(sistema);
			}

		}

		for (

		Vaga vagas3 : vagas) {
			if (vagas3.getTipoVaga().equalsIgnoreCase(tipo) && vagas3.getNumeroVaga() == numero) {
				vagas3.setVeiculos(null);
				vagas3.setCatraca(null);

			}
		}
		return vagas;

	}

	public Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

	public String toString() {
		String modelo = "____________________\n\n";
		modelo += this.getTipoVaga() + this.getNumeroVaga() + "\n";
		modelo += this.getVeiculos() + "\n";
		modelo += this.getSistema() + "\n____________________";

		return modelo;

}

}
