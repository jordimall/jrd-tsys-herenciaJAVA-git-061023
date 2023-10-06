package main;

import java.util.ArrayList;

public class Cine {
	private ArrayList<Pelicula> pelicula;
	private double precio;

	private final double PRECIO_DEF = 3.5;
	
	public Cine(ArrayList<Pelicula> pelicula) {
		this.pelicula = pelicula;
		this.precio = PRECIO_DEF;
	}
	
	public ArrayList<Pelicula> getPelicula() {
		return pelicula;
	}
	
	public void setPelicula(ArrayList<Pelicula> pelicula) {
		this.pelicula = pelicula;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
