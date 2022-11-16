package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {

	private Color color;
	private Posicion posicion;

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (color.equals(Color.NEGRO) || color.equals(Color.BLANCO)) {

			this.color = color;

		} else {

			throw new IllegalArgumentException("ERROR: Color no válido.");
		}
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {

		if (posicion.getFila() >= 1 && posicion.getFila() <= 8) {
			if (posicion.getColumna() >= 'a' && posicion.getColumna() <= 'H') {
				this.posicion = posicion;
			} else {
				throw new IllegalArgumentException("ERROR: Columna no válida.");
			}
		} else {

			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}

	}

}
