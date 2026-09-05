package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuadrado cuadrado = new Cuadrado ("Cuadrado", "rojo", 4);
		Rectangulo rectangulo = new Rectangulo ("Rectangulo", "morado", 2, 4);
		
	
		System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
		System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
	}

}
