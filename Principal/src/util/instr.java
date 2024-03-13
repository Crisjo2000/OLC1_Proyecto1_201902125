/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.HashMap;

/**
 *
 * @author Christian
 */
public class instr {
    public static HashMap<String, String> TablaSimbolos = new HashMap<>();
    
    public static void print(Object exp){
        System.out.print(String.valueOf(exp) + ",");
    }
    public static void put(String x, String y){
        TablaSimbolos.put(x, y);
    }
    public static void get(Object y){
        TablaSimbolos.get(y);
    }
}
