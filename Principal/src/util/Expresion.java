/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
/**
 *
 * @author Christian
 */
public class Expresion {
    public static String suma(String izquierdo, String derecho){
        String result = "";
        try {
            double valizq = Double.parseDouble(izquierdo);
            double valder = Double.parseDouble(derecho);
            double resultado = valizq + valder;
            result = String.valueOf(resultado);
            System.out.println(result);
        } catch (NumberFormatException e) {
            result = "Error";
        }
        return result;
    }
    public static String resta(String izquierdo, String derecho){
        String result = "";
        try {
            double valizq = Double.parseDouble(izquierdo);
            double valder = Double.parseDouble(derecho);
            double resultado = valizq - valder;
            result = String.valueOf(resultado);
            System.out.println(result);
        } catch (NumberFormatException e) {
            result = "Error";
        }
        return  result;
    }
    public static String multiplicacion(String izquierdo, String derecho){
        String result = "";
        try {
            double valizq = Double.parseDouble(izquierdo);
            double valder = Double.parseDouble(derecho);
            double resultado = valizq * valder;
            result = String.valueOf(resultado);
            System.out.println(result);
        } catch (NumberFormatException e) {
            result = "Error";
        }
        return  result;
    }
    public static String division(String izquierdo, String derecho){
        String result = "";
        try {
            double valizq = Double.parseDouble(izquierdo);
            double valder = Double.parseDouble(derecho);
            double resultado = valizq / valder;
            result = String.valueOf(resultado);
            System.out.println(result);
        } catch (NumberFormatException e){
            result = "Error";
        }
        return  result;
    }
    public static String modulo(String izquierdo, String derecho){
        String result = "";
        try {
            double valizq = Double.parseDouble(izquierdo);
            double valder = Double.parseDouble(derecho);
            double resultado = valizq % valder;
            result = String.valueOf(resultado);
            System.out.println(result);
        } catch (NumberFormatException e) {
            result = "Error";
        }
        return  result;
    }
}
