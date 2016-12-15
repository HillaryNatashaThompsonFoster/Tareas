/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controldemascotas;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class ControlDeMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Procesos Perro = new Procesos ();
        Procesos Gato = new Procesos ();
       String ln = System.getProperty ( "line.separator");
       int AnimalE = 0;
       String NombreA;
       int VidaI;
       //Declaracion de variables
       
       //Escoger animal 
       
       while (AnimalE == 0 ){  String A = JOptionPane.showInputDialog(null, "Escoja el número del animal con el cual desea interactuar"+ln
               +"1. Perro (50pts de vida)"+ln
                +"2. Gato (30pts de vida)", "Bienvenido/a", JOptionPane.PLAIN_MESSAGE);
       try {AnimalE = Integer.parseInt (A);
           switch (AnimalE) {
               case 1:
                 
                
                  Perro.ProcesoPerro();
            
                   break;
               case 2:
                    Gato.ProcesoGato();
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "No ha escogido una opción correcta, vuelva a intentarlo", "  Error",  JOptionPane.ERROR_MESSAGE);
                   break;
           }
       }
       catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "No ha escogido el número del animal, vuelva a intentarlo", "  Error",  JOptionPane.ERROR_MESSAGE);
       }
      if (AnimalE == 1 || AnimalE == 2 ) break;
       } 
       
    }
    
}
