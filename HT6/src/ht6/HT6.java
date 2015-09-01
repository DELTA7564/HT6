/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht6;

import java.util.Scanner;
import java.util.AbstractSet;
import java.util.ArrayList;
/**
 *
 * @author Home
 */
public class HT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractSet developer = null;
        Scanner entrada = new Scanner(System.in);
        SetFactory factory = new SetFactory();
        boolean running = true;
        int set = 0;
        String opcion = "";
        String grupoD = "";
        String nombre = "";
        
        System.out.println("Seleccione el numero del tipo de implementación SET que desea utilizar: \n   1. HashSet \n   2. TreeSet \n   3. LinkedHashSet \n Cualquier otro numero para usar Set predeterminado (HashSet)");
        set = entrada.nextInt();
        developer = factory.getSet(set);
        
        while(running){
            System.out.println("Ingrese el número de la opción que desearealizar: \n   1. Ingresar Desarrolladores \n   2. Mostrar Resultados 3. Salir del programa");
            opcion = entrada.next();
           
            if(opcion.compareTo("1")==0){
                System.out.println("Ingrese el nombre del desarrollador Ejemplo: 'Gabriel'");
                nombre = entrada.next();
                System.out.println("Ingrese el numero de area en la que el desarrollador posee experiencia: \n   1. Java \n   2. Web \n   3. Celulares \nPuede Seleccionar un maximo de 2 separadas por una coma. Ejemplo: '2,3'");
                grupoD = entrada.next();
                if(grupoD.compareTo("1")==0){
                    Desarrollador persona = new Desarrollador(nombre, 1, 0, 0); 
                    developer.add(persona);
                }else if(grupoD.compareTo("2")==0){
                    Desarrollador persona = new Desarrollador(nombre, 0, 1, 0); 
                    developer.add(persona);
                }else if(grupoD.compareTo("3")==0){
                    Desarrollador persona = new Desarrollador(nombre, 0, 0, 1); 
                    developer.add(persona);
                }else if(grupoD.compareTo("1,2")==0){
                    Desarrollador persona = new Desarrollador(nombre, 1, 1, 0); 
                    developer.add(persona);
                }else if(grupoD.compareTo("2,3")==0){
                    Desarrollador persona = new Desarrollador(nombre, 0, 1, 1); 
                    developer.add(persona);
                }else if(grupoD.compareTo("1,3")==0){
                    Desarrollador persona = new Desarrollador(nombre, 1, 0, 1); 
                    developer.add(persona);
                } 
            }
            
            if(opcion.compareTo("2")==0){
                
            }
            
            if(opcion.compareTo("3")==0){
                running = false;
                System.out.println("Finalizado");
            }
        }
    }
    
}
