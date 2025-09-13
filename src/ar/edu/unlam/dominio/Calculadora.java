package ar.edu.unlam.dominio;

public class Calculadora {

	public Integer sumar(Integer num1, Integer num2) {
		Integer resultado = num1 + num2;
		return resultado;
	}

	public Integer restar(Integer num1, Integer num2) {
		Integer resultado = num1 - num2;
		return resultado;
	}

	public Integer multiplicar(Integer num1, Integer num2) {
		Integer resultado = num1 * num2;
		return resultado;
	}

	public Integer dividir(Integer num1, Integer num2) {
		Integer resultado = 0;
		
		if (num2 == 0) {
			resultado = 0;
		} else {
			resultado = num1 / num2;
		}
		return resultado;
	}

}
