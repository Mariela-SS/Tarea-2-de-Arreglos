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
    
    private Inventario inventario;
    private int opcion;

    public Menu() {
        this.inventario = inventario;
    }
    
    public void MenuPrincipal(){
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              ===Bienvenido a MaxiPali Online===
                                                              ----------------------------------
                                                              1. Registrar producto
                                                              2. Mostrar producto
                                                              3. Buscar producto por codigo
                                                              4. Vender unidades
                                                              5. Reabastecer producto
                                                              6. Calcular valor total del inventario
                                                              7. Salir
                                                              ------------------------------------
                                                              """));
        
        do{
            
            switch(opcion){
                
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                case 6:
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
