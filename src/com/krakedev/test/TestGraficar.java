package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;


public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	Graficador graficador = new Graficador ();
//	Figura figura = new Figura("Circulo", "verde" );
	Cuadrado cuadrado = new Cuadrado ("Cuadrado", "rojo", 5);
	Rectangulo rectangulo = new Rectangulo ("Rectangulo", "morado", 2,3);
		
//	graficador.graficar(figura);
	graficador.graficar(cuadrado);
	graficador.graficar(rectangulo);

	
	Figura f1 = new Cuadrado("Cuadrado", "Rojo", 5);
	Figura f2 = new Rectangulo("Rectangulo", "Azul", 4, 6);
	graficador.graficar(f1);
	graficador.graficar(f2);
	
	TrianguloRectangulo triRect = new TrianguloRectangulo("Triángulo Rectángulo", "verde", 3, 4);
	graficador.graficar(triRect);
	
	Hexagono hex = new Hexagono("Hexágono", "amarillo", 4);
	graficador.graficar(hex);
	
	}

}
