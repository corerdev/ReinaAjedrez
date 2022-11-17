package org.iesalandalus.programacion.reinaajedrez;

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
	
	
	public static void elegirOpcionMenu() {
		
		
		int seleccion;
		
		do {
			
			System.out.println("Por favor, elija una de las opciones del menú: ");
			Entrada.entero(seleccion);
		} while (seleccion <1 || seleccion > 4);
		
		if (seleccion == 1) {
			System.out.println("Ha elegido crear la reina por defecto. Esta será blanca, y empezará en 1d.");
		} if (selección == 2) {
			System.out.println("Ha elegido crear una reina de color determinado.");
			} if (seleccion == 3) {
				System.out.println("Ha elegido mover a la reina.");
				} if (seleccion == 4) {
					System.out.println("Ha elegido cerrar el programa.");
				}
			
	}
	
}
