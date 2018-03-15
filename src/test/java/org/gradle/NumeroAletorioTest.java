package org.gradle;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;
import static org.junit.Assert.*;


public class NumeroAletorioTest {

	private NumeroAleatorio numeroAleatorio;
	private NumeroAleatorio numeroAleatorioMock;
	
	@Before
	public void setup() {
		numeroAleatorio = new NumeroAleatorio() ;
		numeroAleatorioMock= Mockito.spy(NumeroAleatorio.class);
	}

	@Test
	public void ingresoNumeroAleatorioyObtengoAleatorioTest() {
		// arrange definicion de la variables
		int nro1 = 5;
		int nro2 = 10;
		// act- accion

		int resultado = numeroAleatorio.obtenerNumeroAleatorio(nro1,nro2);
		System.out.println(resultado);
		// assert
		Assert.assertEquals(5, resultado);
	}
	
	@Test
	public void sumaNumeroAleatoriosyObtengoAleatorioTest() {
		// arrange definicion de la variables
		int nro1 = 0;
		int nro2 = 10;
		
		//Mockeo para obligar al metodo obtenerNumeroAleatorio un valor especifico.
		//Corre En tiempo de ejecucion
		Mockito.when(numeroAleatorioMock.obtenerNumeroAleatorio(nro1, nro2)).thenReturn(2);
		
		// act- accion

		int resultado = numeroAleatorioMock.sumaAleatorio(nro1,nro2);
		

		// assert
		Assert.assertEquals(4, resultado);

	}

}
