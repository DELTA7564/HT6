/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht6;

import java.util.Comparator;
/**
 *
 * @author Home
 */
import java.util.Comparator;
	public class Comparador implements Comparator<Desarrollador>{
	    //compara los nombres para crear un orden alfabetico
	    public int compare(Desarrollador primero, Desarrollador segundo){
	        return primero.getNombre().compareTo(segundo.getNombre());
	    }
}
