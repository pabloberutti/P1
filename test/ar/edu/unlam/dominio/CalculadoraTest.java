package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calculadora;
	
	@Before
	public void inicializacion() {
		this.calculadora = new Calculadora();
	}
	
	@Test
	public void dadoQueExistenDosNumerosEnterosComoElDosYElTresCuandoLosSumoObtengoComoResultadoCinco() {
		// Preparacion
		Integer num1 = 2;
		Integer num2 = 3;
		
		// Ejecucion
		Integer resultadoObtenido = calculadora.sumar(num1, num2);
		
		// Verificacion
		Integer resultadoEsperado = 5;
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void dadoQueExistenDosNumerosEnterosComoElOchoYElSeisCuandoLosRestoObtengoComoResultadoDos() {
		// Preparacion
		Integer num1 = 8;
		Integer num2 = 6;
				
		// Ejecucion
		Integer resultadoObtenido = calculadora.restar(num1, num2);
				
		// Verificacion
		Integer resultadoEsperado = 2;
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void dadoQueExistenDosNumerosEnterosComoElCuatroYElCincoCuandoLosMultiplicoObtengoComoResultadoElVeinte() {
		// Preparacion
		Integer num1 = 4;
		Integer num2 = 5;
						
		// Ejecucion
		Integer resultadoObtenido = calculadora.multiplicar(num1, num2);
						
		// Verificacion
		Integer resultadoEsperado = 20;
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
		
	@Test
	public void dadoQueExistenDosNumerosEnterosComoElDiezYElDosCuandoLosDividoObtengoComoResultadoCinco() {
		// Preparacion
		Integer num1 = 10;
		Integer num2 = 2;
							
		// Ejecucion
		Integer resultadoObtenido = calculadora.dividir(num1, num2);
							
		// Verificacion
		Integer resultadoEsperado = 5;
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void dadoQueEnLaDivisionElDivisorNoPuedeSerCeroCuandoEstoOcurreDaComoResultadoCero() {
		// Preparacion
		Integer num1 = 5;
		Integer num2 = 0;
		
		// Ejecucion
		Integer resultadoObtenido = calculadora.dividir(num1, num2);
		
		// Verificacion
		Integer resultadoEsperado = 0;
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
}
