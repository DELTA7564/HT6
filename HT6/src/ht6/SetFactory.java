/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht6;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.AbstractSet;
/**
 *
 * @author Home
 */
class SetFactory {
    public AbstractSet getSet(int opcion){
        AbstractSet objeto = null;
        if (opcion == 1){
            objeto = new HashSet<Desarrollador>();
        }else if (opcion == 2){
            objeto = new TreeSet<Desarrollador>(new Comparador());
        }else if (opcion == 3){
            objeto = new LinkedHashSet<Desarrollador>();
        }else{
            objeto = new HashSet<Desarrollador>();
        }
        return objeto;
    }
}
