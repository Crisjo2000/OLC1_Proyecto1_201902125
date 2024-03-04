// ------------  Paquete e importaciones ------------
package Compilador; 

import java_cup.runtime.*;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase

%{ 
%} 

// ------> Expresiones Regulares 

entero = [0-9]+

%%
// ------------  Reglas Lexicas -------------------

{entero}  {func.funciones.lista.add(yytext()); return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }



//------> Ignorados 
[ \t\r\n\f]     {}

//------> Errores Léxicos 
//Agregar en vez de print, la lista de errores y jalar el texto, fila y columna

.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }
