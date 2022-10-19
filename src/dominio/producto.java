/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Jon
 */
public class producto {
    //datos
    private int idProducto;
    private String nombre;
    private double precio;
    private static  int contadorProductos;
    
    //contadores

    public producto() {
	this.idProducto=contadorProductos++;
    }

    public producto(String nombre, double precio) {
	this.idProducto=contadorProductos++;
	this.nombre = nombre;
	this.precio = precio;
    }
    
    //getter and setter

    public int getIdProducto() {
	return idProducto;
    }

    public String getNombre() {
	return nombre;
    }

    public double getPrecio() {
	return precio;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setPrecio(double precio) {
	this.precio = precio;
    }
    
    //toString

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("idProducto:").append(idProducto);
	sb.append(",nombre:").append(nombre);
	sb.append(" ").append(precio+"€");
	return sb.toString();
    }
    
    
    
    
    
    
}
