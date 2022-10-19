/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import dominio.orden;
import dominio.producto;

/**
 *
 * @author Jon
 */
public class ventasTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	System.out.println("Sistema de ventas");
	
    //Creación orden y productos
    orden orden = new orden();
     producto pr1 = new producto("Choco Krispies", 2.12);
     producto pr2 = new producto("Plátano", 1.45);
     producto pr3 = new producto("Totame Pera", 1.10);
     producto pr4 = new producto("Escarola", 0.96);
     producto pr5 = new producto("Aguacate", 0.87);
     producto pr6 = new producto("Ciruela Roja", 3.11);
     producto pr7 = new producto("Pechuga de pollo", 4.32);
     producto pr8 = new producto("Filete de ternera", 6.67);
     producto pr9 = new producto("Natillas de proteina", 3.49);
     producto pr10 = new producto("Jabón de manos", 1.50);
     
     //Agregando productos
     orden.agregarProducto(pr1);
     orden.agregarProducto(pr2);
     orden.agregarProducto(pr3);
     orden.agregarProducto(pr4);
     orden.agregarProducto(pr5);
     orden.agregarProducto(pr6);
     orden.agregarProducto(pr7);
     orden.agregarProducto(pr8);
     orden.agregarProducto(pr9);
     orden.agregarProducto(pr10);
     
     
     //mostrar la orden de los productos agregados
     orden.mostrarOrden();
    System.out.println("Precio Total: ");
    System.out.println(orden.calcularTotal()+"€");
       
    }
    
}
