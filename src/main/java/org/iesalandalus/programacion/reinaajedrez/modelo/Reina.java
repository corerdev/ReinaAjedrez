package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

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
			if (posicion.getColumna() >= 'a' && posicion.getColumna() <= 'h') {
				this.posicion = posicion;
			} else {
				throw new IllegalArgumentException("ERROR: Columna no válida.");
			}
		} else {

			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}

	}

	public Reina() {

		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');

	}

	public Reina(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		} else {
		if (color.equals(Color.NEGRO)) {
			this.setColor(Color.NEGRO);
			posicion = new Posicion(8, 'd');
		} else {
			this.setColor(Color.BLANCO);
			posicion = new Posicion(1, 'd');
		}
		}

	}

	public void mover(Direccion direccion, int pasos)
			throws OperationNotSupportedException, IllegalArgumentException, NullPointerException {

		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		if (pasos < 1 || pasos > 7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}

		int filaTemporal = posicion.getFila();
		char columnaTemporal = posicion.getColumna();
		Posicion posicionTemporal = null;
		switch (direccion) {
		case NORTE:
			filaTemporal = filaTemporal + pasos;

			break;
		case NORESTE:
			columnaTemporal += pasos;
			filaTemporal += pasos;

			break;
		case ESTE:
			columnaTemporal += pasos;

			break;
		case SURESTE:
			columnaTemporal += pasos;
			filaTemporal -= pasos;

			break;
		case SUR:
			filaTemporal -= pasos;

			break;
		case SUROESTE:
			columnaTemporal -= pasos;
			filaTemporal -= pasos;

			break;
		case OESTE:
			columnaTemporal -= pasos;

			break;
		case NOROESTE:
			columnaTemporal -= pasos;
			filaTemporal += pasos;

			break;
		}
		if (filaTemporal >= 1 && filaTemporal <= 8 && columnaTemporal >= 'a' && columnaTemporal <= 'h') {
			posicionTemporal = new Posicion(filaTemporal, columnaTemporal);
			this.setPosicion(posicionTemporal);
		} else {
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");

		}

	}
}
