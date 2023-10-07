package main;

/**
 * Clase Pelicula, lleva todo lo relacionado con la pelicula
 *
 * @author David Maza
 */
public class Pelicula {

	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;

	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getEdad_minima() {
		return edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setEdad_minima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return  titulo + " del director " + director + ", la duración " + duracion
				+ " minutos y la edad minima es de " + edadMinima + " años";
	}
}
