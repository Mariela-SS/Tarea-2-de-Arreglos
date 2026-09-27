/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import modulos.Inventario;

/**
 *
 * @author marsa
 */
public class Menu {
    
    private Inventario invent = new Inventario();
    

    public Menu() {
        this.invent = invent; 
    }
    
    public void MenuPrincipal(){
        
        int opcion = 0;
        
        do{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              ===Bienvenido a MaxiPali Online===
                                                              ----------------------------------
                                                              1. Registrar producto
                                                              2. Mostrar producto
                                                              3. Buscar producto por codigo
                                                              4. Vender por unidades
                                                              5. Reabastecer producto
                                                              6. Calcular valor total del inventario
                                                              7. Salir
                                                              ------------------------------------
                                                              """));
            
            
            switch(opcion){
                
                case 1:
                    invent.RegistrarProductos();
                    break;
                    
                case 2:
                    invent.MostrarProductos();
                    break;
                    
                case 3:
                    invent.BuscarProducto();
                    break;
                    
                case 4:
                    invent.VenderUnidades();
                    break;
                    
                case 5:
                    invent.ReabastecerProducto();
                    break;
                    
                case 6:
                    invent.CalcularTotal();
                    break;
                    
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo de el sistema. Gracias por comprar en Maxi Pali Online!");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida..");
                    break;
                
            }//Fin de Switch
              
        }while(opcion != 7);//Fin de do-while
            
    }//Fin de Menu principal
    
}//Fin de clase Menu
