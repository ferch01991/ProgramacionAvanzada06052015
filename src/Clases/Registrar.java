/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Registrar {
    
    public void GuardarDatos(Cliente [] cliente){
        ArrayList<Cliente> datos =  new ArrayList<Cliente>();
        for (int i = 0; i < cliente.length; i++) {
            datos.add(cliente[i]);
        }
    }
    
    public void LeerDatos(ArrayList datos){
        
        
        
    }
}
