/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.io.*;
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
        File f = new File("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\ProgramacionAvanzada06052015\\datos.txt");
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write(c.strIdentificacion+",");
        bw.write(c.strNombres+",");
        bw.write(c.strApellidos+",");
        bw.write(c.strDireccion+",");
        bw.write(c.strEmail+",");
        bw.write(c.strUserName+",");
        bw.write(c.strPassword);
        bw.close();
        fw.close();
    }
    
    public boolean leerArchivo(String user, String pass) throws FileNotFoundException, IOException{
        File f = new File("C:\\Users\\Fernando\\Documents\\NetBeansProjects\\ProgramacionAvanzada06052015\\datos.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String linea, userName = "", password="";
        while((linea=br.readLine())!=null){
            for(String datos:linea.split(",")){
                if (user.equals(datos))
                    userName = datos;
                if(pass.equals(datos))
                    password = datos;
            }
        }
        if(userName.equals(user) && password.equals(pass)){
            return true;
        }
        
        return false;
    }
}
