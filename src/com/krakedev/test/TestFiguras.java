package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura figura = new Figura("Circulo", "verde" );
		Cuadrado cuadrado = new Cuadrado ("Cuadrado", "rojo",5);
		Triangulo triangulo = new Triangulo ("Triangulo", "azul");
		
		System.out.println(figura);
		System.out.println(cuadrado);
		System.out.println(triangulo);
		
		
		
	}

}
