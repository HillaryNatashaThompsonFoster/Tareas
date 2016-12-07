package com.company;
import java.io.*;
import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java
import java.util.Hashtable;
public class Main {

    public static void main(String[] args) {
	// write your code here

        String Nombre = "";

        int resp = 0;
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("c:/prg/att.txt");
            pw = new PrintWriter(fichero);


            Hashtable<String, Integer> Personasmultas = new Hashtable<String, Integer>();

        while (true) {
            double velocidades =0;
Integer  total = 0;


        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        System.out.println("Introduzca su Nombre\n");
        Nombre = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println("Introduzca su Velocidad\n");
        velocidades = Integer.parseInt( entradaEscaner.nextLine ()); //Invocamos un método sobre un objeto Scanner

        if (velocidades > 60)
        {
            total = total + 20;
        }

        if (velocidades > 120)
        {
            total = total + 50;
        }

        if (velocidades > 160)
        {
            total = total + 120;
        }

            Personasmultas.put(Nombre, total);

                pw.println(" Velocidad : " + velocidades);
            System.out.println("Deseas Contunuar   1/SI 0/NO            ");
            resp = Integer.parseInt( entradaEscaner.nextLine ()); //Invocamos un método sobre un objeto Scanner
            if (resp != 1) { break;}

        }


            pw.println(Personasmultas);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }



    }
}
