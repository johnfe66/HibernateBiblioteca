package model;
// Generated Apr 24, 2017 6:50:02 AM by Hibernate Tools 5.2.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCategoria;
	private String nombreCategoria;
	private Set<Libro> libros = new HashSet<Libro>(0);

	public Categoria() {
	}

	public Categoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public Categoria(String nombreCategoria, Set<Libro> libros) {
		this.nombreCategoria = nombreCategoria;
		this.libros = libros;
	}

	public Integer getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return this.nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public Set<Libro> getLibros() {
		return this.libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

}
