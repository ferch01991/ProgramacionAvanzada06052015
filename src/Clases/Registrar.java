/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Registrar {
    
    public void LeerObjetos(Cliente [] arrClientes)
    {
        for (int i=0; i<arrClientes.length; i++){
            System.out.println(
            "Identificacion" + arrClientes[i].getStrIdentificacion() +
            "Nombres" + arrClientes[i].getStrNombres() +
            "Apellidos" + arrClientes[i].getStrApellidos() +
            "Direccion" + arrClientes[i].getStrDireccion() +
            "Email" + arrClientes[i].getStrEmail());
        }
    }
    
    public void GuardaArchivo(Cliente [] arrClientes) throws FileNotFoundException, IOException{
        File f = new File("C:/Clase_Java.txt");
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i < arrClientes.length; i++) {
            bw.write(arrClientes[i].getStrNombres()+"\n");
            bw.write(arrClientes[i].getStrApellidos()+"\n");
            bw.write(arrClientes[i].getStrDireccion()+"\n");
            bw.write(arrClientes[i].getStrEmail()+"\n");
        }
        
        bw.close();
        fw.close();
    }
    // Enviar a guardar un objeto
    public void GuardaArchivoObjeto(Cliente c) throws FileNotFoundException, IOException{
        File f = new File("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\datos.txt");
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(c.strIdentificacion);
        bw.write(c.strNombres);
        bw.write(c.strApellidos);
        bw.write(c.strDireccion);
        bw.write(c.strEmail);
        bw.close();
        fw.close();
    }
}
