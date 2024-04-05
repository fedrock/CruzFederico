package ar.edu.unju.pv.ejemplo;

import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		int anio = 2026;
		String saludo = "Hola PV ";
		System.out.println(saludo+anio);
		
		if (anio <= 2024) {
			System.out.println("Año correcto");
		}else {
			System.out.println("Año es incorrecto");
		}
		int tamanio = saludo.length();
		
		
		for (int i = 0; i < tamanio; i++) {
			System.out.println(saludo.charAt(i));
		}
		int indice = 0;
		
		while (indice < tamanio) {
			System.out.println(saludo.charAt(indice));
			indice++;                                                                                                                                                                                           
		}
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		String nombre = teclado.next();
		System.out.println("Hola "+nombre);
		
		teclado.close();
	}
}
