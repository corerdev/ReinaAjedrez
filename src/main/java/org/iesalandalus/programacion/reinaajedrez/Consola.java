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
			seleccion = Entrada.entero();
		} while (seleccion <1 || seleccion > 4 );
		
		if (seleccion == 1) {
			System.out.println("Ha elegido crear la reina por defecto. Esta será blanca, y empezará en 1d.");
		} if (seleccion == 2) {
			System.out.println("Ha elegido crear una reina de color determinado.");
			} if (seleccion == 3) {
				System.out.println("Ha elegido mover a la reina.");
				} if (seleccion == 4) {
					System.out.println("Ha elegido cerrar el programa.");
				}
			
	}
	
public static void elegirOpciom() {
		
		
		int seleccioncolor;
		
		do {
			
			System.out.println("Por favor, elija una de las opciones: 1 para reina blanca, 2 para reina negra.");
			seleccioncolor = Entrada.entero();
		} while (seleccioncolor <1 || seleccioncolor > 2);
		
		if (seleccioncolor == 1) {
			System.out.println("Ha elegido crear la reina blanca. Empieza en 1d.");
		} if (seleccioncolor == 2) {
			System.out.println("Ha elegido crear la reina negra. Empieza en 8d.");
			}
			
	}
	
public static void mostrarMenuDirecciones() {
	
	System.out.println("Elija una dirección para moverse:");
	System.out.println("1 - Norte. 2 - Noreste- 3 - Este.");
	System.out.println("4 - Sureste. 5 - Sur. 6 - Suroeste.");
	System.out.println("7 - Oeste. 8 - Noroeste.");
	
}


}
