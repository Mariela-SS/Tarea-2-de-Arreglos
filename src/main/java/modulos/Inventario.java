/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulos;

import javax.swing.JOptionPane;

/**
 *
 * @author marsa
 */
public class Inventario {
    
    private Producto[] productos = new Producto[10];
    private int cantidad;
    
    //Metodo de registrar un producto
    public void RegistrarProductos() {
        
    if (cantidad >= productos.length) {
        JOptionPane.showMessageDialog(null, "Lo sentimos pero ya no tiene espacio en su inventario..");
        return; // Regresa al menú principal
    }

    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto: "));
    if (codigo <= 0) {
        JOptionPane.showMessageDialog(null, "El código debe ser un número entero positivo.");
        return;
    }
    
    // Validar código repetido
    for (int i = 0; i < cantidad; i++) {
        if (productos[i].getCodigo() == codigo) {
            JOptionPane.showMessageDialog(null, "Ya existe un producto con ese codigo");
            return;
        }
    }

    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
    
    if (precio <= 0) { 
        JOptionPane.showMessageDialog(null, "El precio debe ser mayor que cero.");
        return;
    }

    int cantDisponible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad disponible: "));
    if (cantDisponible < 0) { 
        JOptionPane.showMessageDialog(null, "La cantidad disponible debe ser un entero positivo.");
        return;
    }

    // Guardar el nuevo objeto en la posición disponible
    productos[cantidad] = new Producto(codigo, nombre, precio, cantDisponible);
    cantidad++; // Suma 1 a la variable que controla las posiciones ocupadas
    
    JOptionPane.showMessageDialog(null, "El producto ha sido registrado con exito!");
    }//Fin de RegistrarProducto

    //Metodo para mostrar los productos registrados
    public void MostrarProductos(){
        if (cantidad == 0) {
            JOptionPane.showMessageDialog(null, "No se encuentran productos registrados..");
            return;
        }

        String texto = "=== LISTA DE PRODUCTOS ===\n";
        for (int i = 0; i < cantidad; i++) {
            texto += productos[i].toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    //Metodo para buscar el codigo
    public int BuscarProducto(){
        
        int codigoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código a buscar:"));
        int posicion = -1;
        
        for (int i = 0; i < cantidad; i++){
            if (productos[i].getCodigo() == codigoBuscar){
            posicion = i;
            break;
            }//Fin de if
        }//Fin de for

        if (posicion != -1) {
            JOptionPane.showMessageDialog(null, "==Producto Encontrado==\n" + productos[posicion].toString());
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado..");
        }
        return -1;
        
    }//Fin de BuscarCodigo
    
    

    //Metodo para vender el producto por unidades
    public void VenderUnidades(){
        
        /*int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto a vender: "));
        int posicion = BuscarProducto();

        if (posicion == -1) {
            JOptionPane.showMessageDialog(null, "Lo sentimos este producto no esta disponible..");
            return;
        }

        int unidades = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a vender: "));
        
        if (unidades <= 0) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero");
            return;
        }

        if (productos[posicion].getCantidadDisponible() < unidades) {
            JOptionPane.showMessageDialog(null, "Las cantidades a vender son menores a lo recomendado..");
            return;
        }

        int nuevoStock = productos[posicion].getCantidadDisponible() - unidades;
        productos[posicion].setCantidadDisponible(nuevoStock);
        JOptionPane.showMessageDialog(null, "La venta fue realizada con exito" +
                                            "La cantidad del producto ahora es de: "+ nuevoStock);*/
        
       //----///
       
        if (cantidad == 0){
            JOptionPane.showMessageDialog(null, "No hay productos registrados en el inventario..");
            return;
        }

        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto a vender: "));
        int posicion = -1;

        for (int i = 0; i < cantidad; i++) {
            if (productos[i].getCodigo() == codigo) {
                posicion = i;
                break;
            }
        }

        if (posicion == -1) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
            return;
        }

        int unidades = Integer.parseInt(JOptionPane.showInputDialog("Producto: " + productos[posicion].getNombre() 
                + "\nStock disponible: " + productos[posicion].getCantidadDisponible() 
                + "\nIngrese la cantidad a vender: "));

        if (unidades <= 0) {
            JOptionPane.showMessageDialog(null, "La cantidad a vender debe ser mayor que cero.");
            return;
        } else if (unidades > productos[posicion].getCantidadDisponible()) {
            JOptionPane.showMessageDialog(null, "Error: Cantidad insuficiente en inventario.");
            return;
        }

        int nuevoStock = productos[posicion].getCantidadDisponible() - unidades;
        productos[posicion].setCantidadDisponible(nuevoStock);

        JOptionPane.showMessageDialog(null, "¡Venta realizada con éxito!");
    }//Fin de VenderUnidades

    //Metodo para reabastecer un producto
    public void ReabastecerProducto(){
        
        if (cantidad == 0) {
            JOptionPane.showMessageDialog(null, "No hay productos registrados en el inventario.");
            return;
        }//Fin de if

        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto a reabastecer:"));
        int posicion = -1;

        for (int i = 0; i < cantidad; i++) {
            if (productos[i].getCodigo() == codigo) {
                posicion = i;
                break;
            }//fin de if
        }//fin de for
        
        if (posicion == -1) {
            JOptionPane.showMessageDialog(null, "Error: Producto no encontrado.");
        return;
        }//Fin de if
        
        int unidades = Integer.parseInt(JOptionPane.showInputDialog(
        "Producto: " + productos[posicion].getNombre() + 
        "\nStock actual: " + productos[posicion].getCantidadDisponible() + 
        "\n\nIngrese la cantidad de unidades a añadir: "));
        
        if (unidades <= 0) {
            JOptionPane.showMessageDialog(null, "La cantidad a reabastecer debe ser un número entero positivo.");
        return;
        }//fin de if

        int nuevoStock = productos[posicion].getCantidadDisponible() + unidades;
        productos[posicion].setCantidadDisponible(nuevoStock);

        JOptionPane.showMessageDialog(null, "¡Reabastecimiento exitoso!\n" 
                + "Producto: " + productos[posicion].getNombre() 
                + "\nUnidades agregadas: " + unidades 
                + "\nNuevo stock disponible: " + productos[posicion].getCantidadDisponible());
        
    }//Fin de ReabastecerProducto

    //Metodo para calcular el valor total
    public void CalcularTotal(){
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += productos[i].getPrecio() * productos[i].getCantidadDisponible();
        }
        JOptionPane.showMessageDialog(null, String.format("El valor total del inventario es: ₡%.2f", total));
    }//Fin de CalcularTotal

    
}//Fin de clase Inventario
