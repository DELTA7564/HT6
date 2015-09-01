/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht6;

/**
 *
 * @author Home
 */
class Desarrollador {
    
    private String nombre;
    int[] conjuntos= new int[3];

//constructor
    public Desarrollador(String nombre, int conjunto1, int conjunto2, int conjunto3) {
        this.nombre = nombre;
        conjuntos[0]=conjunto1;
        conjuntos[1]=conjunto2;
        conjuntos[2]=conjunto3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setConjuntos (int[] conjuntos){
        this.conjuntos=conjuntos;
    }

	public int getJava(){
        return conjuntos[0];
    }

    public int getWeb(){
        return conjuntos[1];
    }
    
    public int getCelulares(){
        return conjuntos[2];
    }
}