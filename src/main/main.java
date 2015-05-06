/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Clases.*;
import GUI.JFIngreso;
import GUI.JFRegistro;
import Validaciones.Validar;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class main {

    public static void main(String[] args) throws IOException {
        //Objeto que instancia a clase
//        Cliente c = new Cliente();
//        //Arreglo de Objetos
//        Cliente c1[] = new Cliente[1];
//        Registrar r = new Registrar();
//        Validar v = new Validar();
//        for (int i = 0; i < c1.length; i++) {
//            //Scanner
//            Scanner sc = new Scanner(System.in);
//            //Inicializar 
//            c1[i] = new Cliente();
//            System.out.println("Ingrese Identificacion");
//            //Asignacion de valor a método de clase
//            c1[i].setStrIdentificacion(sc.nextLine());
//            System.out.println("Ingrese Nombres");
//            c1[i].setStrNombres(sc.nextLine());
//            System.out.println("Ingrese Apellidos");
//            c1[i].setStrApellidos(sc.nextLine());
//            System.out.println("Ingrese Email");
//            String strEmail = sc.nextLine();
//            boolean res = v.ValidaEmail(strEmail);
//            if (res == true) {
//                c1[i].setStrEmail(strEmail);
//            } else {
//                c1[i].setStrEmail("demo@utpl.edu.ec");
//            }
//            System.out.println("Ingrese Dirección");
//            c1[i].setStrDireccion(sc.nextLine());
//            System.out.println("ingresar fecha de nacimiento 'añomesdia': ");
//            String strFechaN = sc.next();
//            int anio = Integer.parseInt(strFechaN.substring(0, 4));
//            int mes = Integer.parseInt(strFechaN.substring(4, 6));
//            int dia = Integer.parseInt(strFechaN.substring(6, 8));
//            int edad = v.ValidarEdad(anio, mes, dia);
//            System.out.println("edad "+ edad);
//            c1[i].setStrFechaNace(Integer.toString(edad));
//            
//            r.GuardaArchivo(c1);
//        }
//        JFIngreso ingreso = new JFIngreso();
//        ingreso.show();
        
        JFRegistro registro = new JFRegistro();
        registro.show();
    }

}
