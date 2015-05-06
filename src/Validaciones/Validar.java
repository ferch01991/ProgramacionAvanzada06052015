/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Fernando
 */
public class Validar {

    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String USER_NAME = "faherrera2";
    private static final String USER_PASS = "1234";

    public Validar() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean ValidaEmail(String strEmail) {
        matcher = pattern.matcher(strEmail);
        return matcher.matches();
    }

    public int ValidarEdad(int a, int m, int d) {

        GregorianCalendar fechaActual = new GregorianCalendar();
        int a2 = fechaActual.get(GregorianCalendar.YEAR);
        int m2 = fechaActual.get(GregorianCalendar.MONTH);
        int d2 = fechaActual.get(GregorianCalendar.DAY_OF_MONTH);
        int edad = (a2 - a - 1) + (m2 == m ? (d2 >= d ? 1 : 0) : m2 >= m ? 1 : 0);
        return edad;
    }
    
    public boolean ValidarIngreso(String strUser, String strPass){
        boolean resultado = false;
        if(USER_NAME.equals(strUser) && USER_PASS.equals(strPass)){
            return true;
        }
    return resultado;
    }

}
