package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	private int fila;

	private char columna;

	public Posicion(int numFila, char charColumna) {

		setFila(numFila);
		setColumna(charColumna);
	}
		
	public Posicion(Posicion p) {	
			fila = p.getFila();
			columna = p.getColumna();			

	}

	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("El valor de la fila es incorrecto.");

		} else {
			this.fila = fila;
		}
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("El valor de la columna es incorrecto.");

		} else {
			this.columna = columna;
		}
	}

}
