package com.krakedev.figuras;

public abstract class Figura {
	
	

	private String nombre;
	private String color;
	
	
	@Override
	public String toString() {
		return "El nombre de la figura es:" + nombre + ", y su color es: " + color;
	}
	
	
	public Figura (String nombre, String color) {
		
		this.nombre = nombre;
		this.color = color;
	}
	
	public abstract int calcularArea();
	
	public abstract int calcularPerimetro();
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
