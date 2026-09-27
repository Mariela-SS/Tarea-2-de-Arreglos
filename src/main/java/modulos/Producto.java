/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulos;

/**
 *
 * @author marsa
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadDisponible;
    

    //Constructor sin parametros
    public Producto() {
    }
    
    //Constructor con parametros
    public Producto(int codigo, String nombre, double precio, int cantidadDisponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    //Setters y Getters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    //ToString
    @Override
    public String toString() {
        return "--Informacion del producto\n--" 
                + "\nCodigo: " + codigo 
                + "\nNombre del producto: " + nombre 
                + "\nPrecio: $" + precio 
                + "\nCantidad Disponible: " + cantidadDisponible;
    }//Fin de ToString
      
}//Fin de Clase Producto
