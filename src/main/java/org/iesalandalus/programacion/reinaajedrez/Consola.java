package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {

	}

	public static void mostrarMenu() {

		System.out.println("--------------------------------");
		System.out.println("Simulador de reina de ajedrez");
		System.out.println("Las opciones disponibles son:");
		System.out.println("1 - Crear reina por defecto.");
		System.out.println("2 - Crear reina eligiendo el color.");
		System.out.println("3 - Mover la reina.");
		System.out.println("4 - Salir.");

	}

	public static int elegirOpcionMenu() {

		int seleccion;

		do {

			System.out.println("Por favor, elija una de las opciones del menú: ");
			seleccion = Entrada.entero();
		} while (seleccion < 1 || seleccion > 4);

		if (seleccion == 1) {
			System.out.println("Ha elegido crear la reina por defecto. Esta será blanca, y empezará en 1d.");
		}
		if (seleccion == 2) {
			System.out.println("Ha elegido crear una reina de color determinado.");
		}
		if (seleccion == 3) {
			System.out.println("Ha elegido mover a la reina.");
		}
		if (seleccion == 4) {
			System.out.println("Ha elegido cerrar el programa.");
		}

		return seleccion;
	}

	public static Color elegirOpcion() {

		int seleccioncolor;

		do {

			System.out.println("Por favor, elija una de las opciones: 1 para reina blanca, 2 para reina negra.");
			seleccioncolor = Entrada.entero();
		} while (seleccioncolor < 1 || seleccioncolor > 2);

		if (seleccioncolor == 1) {
			System.out.println("Ha elegido crear la reina blanca. Empieza en 1d.");
			return Color.BLANCO;
		} else {
			System.out.println("Ha elegido crear la reina negra. Empieza en 8d.");
			return Color.NEGRO;
		}

	}

	public static void mostrarMenuDirecciones() {

		System.out.println("Elija una dirección para moverse:");
		System.out.println("1 - Norte. 2 - Noreste- 3 - Este.");
		System.out.println("4 - Sureste. 5 - Sur. 6 - Suroeste.");
		System.out.println("7 - Oeste. 8 - Noroeste.");

	}

	public static Direccion elegirDirecciones() {

		int selecciondireccion;

		do {

			System.out.println("Por favor, elija una de las opciones del menú: ");
			selecciondireccion = Entrada.entero();
		} while (selecciondireccion < 1 || selecciondireccion > 8);

		switch (selecciondireccion) {
		case 1:
			return Direccion.NORTE;
		case 2:
			return Direccion.NORESTE;
		case 3:
			return Direccion.ESTE;
		case 4:
			return Direccion.SURESTE;
		case 5:
			return Direccion.SUR;
		case 6:
			return Direccion.SUROESTE;
		case 7:
			return Direccion.OESTE;
		case 8:
			return Direccion.NOROESTE;
		default:
				return Direccion.NORTE;
		}
	}
}
