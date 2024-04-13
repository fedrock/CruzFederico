package ar.edu.unju.fi.Ejercicio12.Main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.Ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (formato dd/MM/yyyy):");
        String fechaString = scanner.nextLine();
        Calendar fechaNacimiento = Calendar.getInstance();
        String[] partesFecha = fechaString.split("/");
        fechaNacimiento.set(Integer.parseInt(partesFecha[2]), Integer.parseInt(partesFecha[1]) - 1, Integer.parseInt(partesFecha[0]));
        Persona persona = new Persona(nombre, fechaNacimiento);
        persona.imprimirDatos();

	}
}