/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package func;


/**
 *
 * @author Christian
 */
public class Reportes {

    public static void Reporte_tokens(){
        StringBuilder html = new StringBuilder();
        html.append("<html><body><table border=\"1\">");
        for (int i = 0; i <= func.funciones.lista_tokens.size(); i++){
            html.append("<tr>");
            html.append(func.funciones.lista_tokens.get(i));
        }
}
}
