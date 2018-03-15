package org.gradle;

public class NumeroAleatorio {

	public int obtenerNumeroAleatorio(int nro1, int nro2) {
		//return 0 + (int) (Math.random() * ((1-0)+1));
		return (int) (Math.random()*(nro2-(nro1-1))+nro1);  // Valor entre nro1 y nro2+, ambos incluidos.
	}
	
	public int sumaAleatorio(int nro1, int nro2) {
		//return (obtenerNumeroAleatorio() + obtenerNumeroAleatorio());
		return (obtenerNumeroAleatorio(nro1,nro2) + obtenerNumeroAleatorio(nro1,nro2));
	}

}
