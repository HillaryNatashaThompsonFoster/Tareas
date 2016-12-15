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
public class Procesos{
    
     void ProcesoPerro (){
         String ln = System.getProperty ( "line.separator");
       int AnimalE = 0, i =0;
       String NombreA;
       int VidaI = 50, Accion, VidaF, Ciclo = 0;
        String B = JOptionPane.showInputDialog(null, "Muy bien, has escogido al perro"+ln
               +"Ponle algún nombre", "Perro", JOptionPane.INFORMATION_MESSAGE);
                    NombreA = B;
      while (Ciclo == 0)    { 
                       
                      i++;
                      String C = JOptionPane.showInputDialog(null, "Escoja cual acción desea que realice su perro"+ln
               +"1. Ladrar (-2pts de vida)"+ln
                +"2. Comer (10pts de vida)"+ln
                +"3. Correr (-15pts de vida)", "Perro: "+ NombreA, JOptionPane.INFORMATION_MESSAGE);
                try {  Accion = Integer.parseInt (C); 
                  if (Accion == 1){
                  VidaI = VidaI - 2;
                  JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                  }
                      if (Accion == 2){
                          VidaI = VidaI + 10;
                      JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                 
                      }
                      if (Accion == 3){
                          VidaI = VidaI - 15;
                      JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                 }} catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(null, "No ha escogido el número de alguna acción, vuelva a intentarlo", "  Error",  JOptionPane.ERROR_MESSAGE);
                 }
                  if (VidaI==0){
        JOptionPane.showMessageDialog(null, "Tu animal ha muerto", "Poechito :(",  JOptionPane.CLOSED_OPTION);
        break;
        }
            if ((i%2) ==0 ) { int Codigo = JOptionPane.showConfirmDialog(null, "¿Desea seguir introduciéndoles acciones a " +NombreA, "Información ", JOptionPane.YES_NO_OPTION );
        if (Codigo == JOptionPane.YES_OPTION)
        {do   { 
                       
                      i++;
                       C = JOptionPane.showInputDialog(null, "Escoja cual acción desea que realice su perro"+ln
               +"1. Ladrar (-2pts de vida)"+ln
                +"2. Comer (10pts de vida)"+ln
                +"3. Correr (-15pts de vida)", "Perro: "+ NombreA, JOptionPane.INFORMATION_MESSAGE);
                try {  Accion = Integer.parseInt (C); 
                  if (Accion == 1){
                  VidaI = VidaI - 2;
                  JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                  }
                      if (Accion == 2){
                          VidaI = VidaI + 10;
                      JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                 
                      }
                      if (Accion == 3){
                          VidaI = VidaI - 15;
                      JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                 }} catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(null, "No ha escogido el número de alguna acción, vuelva a intentarlo", "  Error",  JOptionPane.ERROR_MESSAGE);
                
                 }
          if (VidaI==0){
        JOptionPane.showMessageDialog(null, "Tu animal ha muerto", "Poechito :(",  JOptionPane.CLOSED_OPTION);
        break;
        }
       if  ((i%2)== 1)break;}
        
        while (Codigo == JOptionPane.YES_OPTION);}
        else 
        { JOptionPane.showMessageDialog(null, "Gracias por elegirnos", " Despedida :(",  JOptionPane.CLOSED_OPTION);
        break;
        }  
                }
           }
     }
    
     
     
     void ProcesoGato (){
         String ln = System.getProperty ( "line.separator");
       int AnimalE = 0, i =0;
       String NombreA;
       int VidaI = 30, Accion, VidaF, Ciclo = 0;
        String B = JOptionPane.showInputDialog(null, "Muy bien, has escogido al gato"+ln
               +"Ponle algún nombre, uno cualquiera", "gato", JOptionPane.INFORMATION_MESSAGE);
                    NombreA = B;
      while (Ciclo == 0)    { 
                       
                      i++;
                      String C = JOptionPane.showInputDialog(null, "Escoja cual acción desea que realice su gato"+ln
               +"1. Dormir (+2pts de vida)"+ln
                +"2. Comer (+5pts de vida)"+ln
                +"3. Caminar (-5pts de vida)", "Gato: "+ NombreA, JOptionPane.INFORMATION_MESSAGE);
                try {  Accion = Integer.parseInt (C); 
                  if (Accion == 1){
                  VidaI = VidaI + 2;
                  JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                  }
                      if (Accion == 2){
                          VidaI = VidaI + 5;
                      JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                 
                      }
                      if (Accion == 3){
                          VidaI = VidaI - 5;
                      JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                 }} catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(null, "No ha escogido el número de alguna acción, vuelva a intentarlo", "  Error",  JOptionPane.ERROR_MESSAGE);
                 }
                
                  if (VidaI==0){
        JOptionPane.showMessageDialog(null, "Tu animal ha muerto", "Poechito :(",  JOptionPane.CLOSED_OPTION);
        break;
        }
            if ((i%2) ==0 ) { int Codigo = JOptionPane.showConfirmDialog(null, "¿Desea seguir introduciéndoles acciones a " +NombreA, "Información ", JOptionPane.YES_NO_OPTION );
        if (Codigo == JOptionPane.YES_OPTION)
        {do   { 
                       
                       i++;
                      String c = JOptionPane.showInputDialog(null, "Escoja cual acción desea que realice su gato"+ln
               +"1. Dormir (+2pts de vida)"+ln
                +"2. Comer (+5pts de vida)"+ln
                +"3. Caminar (-5pts de vida)", "Gato: "+ NombreA, JOptionPane.INFORMATION_MESSAGE);
                try {  Accion = Integer.parseInt (c); 
                  if (Accion == 1){
                  VidaI = VidaI + 2;
                  JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                  }
                      if (Accion == 2){
                          VidaI = VidaI + 5;
                      JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                 
                      }
                      if (Accion == 3){
                          VidaI = VidaI - 5;
                      JOptionPane.showMessageDialog(null, "Cantidad de vida de "+ NombreA+ " es de "+VidaI, "Cantidad de vida ",  JOptionPane.INFORMATION_MESSAGE);
                 }} catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(null, "No ha escogido el número de alguna acción, vuelva a intentarlo", "  Error",  JOptionPane.ERROR_MESSAGE);
                 }
         if (VidaI==0){
        JOptionPane.showMessageDialog(null, "Tu animal ha muerto", "Poechito :(",  JOptionPane.CLOSED_OPTION);
        break;
        } 
       if  ((i%2)== 1)break;}
        
        while (Codigo == JOptionPane.YES_OPTION);}
        else 
        { JOptionPane.showMessageDialog(null, "Gracias por elegirnos", " Despedida :(",  JOptionPane.CLOSED_OPTION);
        break;
        }  
                }
            }
     }
}
