package com.cursoceat.controller;

import static java.lang.Math.abs;

import java.nio.channels.spi.AbstractSelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.cursoceat.modell.Alumno;

public class Controller {

	public static void main(String[] args) {
		ArrayList<Alumno> alumnno= new ArrayList<Alumno>();
Scanner lector = new Scanner(System.in);
boolean programacionActive = true;
do{
	System.out.println("Que operacion quieres hacer :");
	System.out.println("1. Insertar un alumno  :");
	System.out.println("2. Eliminar un alumno  :");
	System.out.println("3. Modificar un alumno  :");
	System.out.println("4. Consultar un alumno  :");
	System.out.println("5. Salir  :");
	
	int opcion = lector.nextInt();

	if (opcion == 1) {
		System.out.println("Introducce el nombre del alumno ");
		String nombre = lector.next();
		System.out.println("Introduce la edad ");
		int edad = lector.nextInt();
		
		Alumno a = new Alumno();
		a.setNombre(nombre);
		a.setEdad(edad);
		alumnno.add(a);
	
	}else if(opcion == 2) {
		System.out.println("Introduce el alumno que quiers elimar;");
		String nombre=lector.next();
		Iterator<Alumno> it= alumnno.iterator();
		while(it.hasNext()) {
			Alumno a= it.next();
			if(a.getNombre().equals(nombre)) {
				it.remove();
			}
		}
		
		
	}else if(opcion == 3) {
		System.out.println("Introduce el nombre");
		String nombre= lector.next();
		System.out.println("Inytrduce el nuevo nommbre");
		String nombre2 = lector.next();
		System.out.println("introduce la nueva edad");
		int edad2 = lector.nextInt();
		Iterator<Alumno> it=alumnno.iterator();
		while(it.hasNext()) {
			Alumno a = it.next();
			if(a.getNombre().equals(nombre)) {
				a.setNombre(nombre2);
				a.setEdad(edad2);
			}
		}
		
		
	}else if (opcion == 4) {
		for(Alumno a : alumnno) {
		System.out.println("Nombre : "+a.getNombre() +"Edad :" + a.getEdad());
		}
		
	}else if(opcion == 5) {
		programacionActive=false;
		
	}else {
		System.out.println("No has escrito correctamente");
		
	} 
	
		
}while(programacionActive);


	



	
}
	}
