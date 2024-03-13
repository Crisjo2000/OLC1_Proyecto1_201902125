
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
                    PROGRAM
                     52.9
                     suma_total
                     "HOLA MUNDO"
                     var:double:: notaAprobar <- 61 end;
                     var:char[]:: labelAprobar <- "Nota Minima" end;
                     arr:double:: @notas <- [notaAprobar, MUL(75, 0.45), DIV(SUM(80,20), RES(75,25))] end;
                    arr:char[]:: @labels <- [labelAprobar, "P1", "P2"] end;
                     console::print = "Media", "Mediana", "Moda", "Varianza", "Max", "Min" end;
                     console::column = "test" -> [10, 15.5, 61.1] end;
                     END PROGRAM;
                    """;
    // Generar Analizadores
    //analizadores("src/Compilador/", "lexer.jflex", "parser.cup");
    //Analizar
    analizar(entrada);
    
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

