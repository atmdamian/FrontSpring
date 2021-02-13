package com.softtek.web.app.model;

public class Producto {

	private Integer id;
	private String nombre;
	private String precio;
	private String descripcion;
	private String nombreImagen;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombreImagen() {
		return nombreImagen;
	}
	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", nombreImagen=" + nombreImagen + "]";
	}

	

}
