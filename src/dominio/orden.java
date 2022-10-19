/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Jon
 */
public class orden {
    //datos
    private int idOrden;
    private ArrayList<producto> product = new ArrayList<>();
    private int contadorOrdenes;
    private int maxProductos = 10;
    
    //constructor

    public orden() {
	this.idOrden=contadorOrdenes++;
    }
    
    //Calculo del total de precio de la cesta d compra
   public double calcularTotal(){
       double Resultado=0;
       for (producto produ : product) {
            Resultado+=produ.getPrecio();
        }
       
       
       return Resultado;
   }
   //agregar un nuevo producto a la cesta
    public void agregarProducto(producto producto){
        if (product.size()>=maxProductos){
            System.out.println("No es posible agregar más productos. Elimine productos");
        }else
           
        this.product.add(producto);
    }
   
    //mostrar por pantalla la orden
  public void mostrarOrden(){
        for (producto prod : product) {
            System.out.println(idOrden +" "+prod); ;
        }
    }
    
}
