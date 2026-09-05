package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura{

	private double catetoA;
	private double catetoB;
	private double hipotenusa;

	public TrianguloRectangulo(String nombre, String color, double catetoA, double catetoB) {
		super(nombre, color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		// Teorema de Pitágoras: c = √(a² + b²)
		double aCuadrado = catetoA * catetoA;
		double bCuadrado = catetoB * catetoB;
		double suma = aCuadrado + bCuadrado;
		this.hipotenusa = Math.sqrt(suma);
	}

	@Override
	public int calcularPerimetro() {
		return (int) (catetoA + catetoB + hipotenusa);
	}

	@Override
	public double calcularArea() {
		return (catetoA * catetoB) / 2.0;
	}

	public double getCatetoA() {
		return catetoA;
	}

	public void setCatetoA(double catetoA) {
		this.catetoA = catetoA;
	}

	public double getCatetoB() {
		return catetoB;
	}

	public void setCatetoB(double catetoB) {
		this.catetoB = catetoB;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}
	
}
