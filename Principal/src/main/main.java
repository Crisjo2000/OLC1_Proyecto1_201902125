
package main;

import Compilador.Parser;
import java.io.StringReader;

/**
 *
 * @author Christian
 */
public class main {
    public static void main(String[] args) {
    //Principal principal = new Principal();
    //principal.setVisible(true);
    String entrada = """
                    10
                     15
                     25
                    """;
    // Generar Analizadores
    //analizadores("src/Compilador/", "lexer.jflex", "parser.cup");
    // Analizar
    analizar(entrada);
    
        for (int i = 0; i < func.funciones.lista.size(); i++) {
            System.out.println(func.funciones.lista.get(i));
        }
    
    
    }
    public static void analizadores(String ruta, String jflexFile, String cupFile){
        try {
            String opcionesJflex[] =  {ruta+jflexFile,"-d",ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] =  {"-destdir", ruta,"-parser","Parser",ruta+cupFile};
            java_cup.Main.main(opcionesCup);
            
        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }
        // Realizar Analisis
    public static void analizar (String entrada){
        try {
            Compilador.Lexer lexer = new Compilador.Lexer(new StringReader(entrada)); 
            Compilador.Parser parser = new Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    } 
}

