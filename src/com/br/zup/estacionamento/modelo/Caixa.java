package com.br.zup.estacionamento.modelo;

import java.util.Date;

public class Caixa {
	
	public double calcularTempoParadoNoEstacionamento(Date entrada, Date saida) {
		double minutos = 0;
		//logica para subtrair datas e devolver quantos minutos ficamos no estacionamento
		long milseg = saida.getTime() - entrada.getTime();
		double seg   = milseg/1000.0;
		minutos = seg/60.0;
		return minutos;
	}
	
	public double calcularQuantoVouPagarNoEstacionamento(double minutos) {
		double valorAPagar = 0;
		//logica para saber quanto temos que pagar
		//15 minutos de tolerancia sem pagar
		//primeira hora tem o valor de 10 reais
		//+ 5 reais por hora
		
		if(minutos <= 15) {//Menos de 15 mins
			valorAPagar = 0;
		}else if(minutos > 15 && minutos <= 60) {//Entre 15 e 60
			valorAPagar = 10;
		}else { //Mais de 60 mins
			//61, 62, 63 ... 110, 111.. 120 .... 180
			valorAPagar = 10;
			double horas = transformarMinutosEmHora(minutos);
			horas = horas - 1;
			valorAPagar = valorAPagar + horas * 5;
		}
		return valorAPagar;
	}
	
	public long transformarMinutosEmHora(double minutos) {
		//56.89(double, float) => 56(Inteiro[byte, short, int, long])
		double horas = minutos/60;
		return (long) horas;
	}
	
	
	
}
