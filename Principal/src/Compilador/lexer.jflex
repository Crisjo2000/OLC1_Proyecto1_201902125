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

double = [0-9]+([.][0-9]+)?
cadena = [\"][^\n\"]*[\"]
id = [a-zA-Z][a-zA-Z0-9_]*

%%
// ------------  Reglas Lexicas -------------------

//Palabras reservadas
"var"       {return new Symbol(sym.VAR, yycolumn, yyline, yytext());}
"PROGRAM"   {return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext());}
"end"       {return new Symbol(sym.END, yycolumn, yyline, yytext());}
"arr"       {return new Symbol(sym.ARR, yycolumn, yyline, yytext());}
"SUM"       {return new Symbol(sym.SUM, yycolumn, yyline, yytext());}
"RES"       {return new Symbol(sym.RES, yycolumn, yyline, yytext());}
"MUL"       {return new Symbol(sym.MUL, yycolumn, yyline, yytext());}
"DIV"       {return new Symbol(sym.DIV, yycolumn, yyline, yytext());}
"MOD"       {return new Symbol(sym.MOD, yycolumn, yyline, yytext());}
"Media"     {return new Symbol(sym.MEDIA, yycolumn, yyline, yytext());}
"Mediana"   {return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext());}
"Moda"      {return new Symbol(sym.MODA, yycolumn, yyline, yytext());}
"Varianza"  {return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext());}
"Max"       {return new Symbol(sym.MAX, yycolumn, yyline, yytext());}
"Min"       {return new Symbol(sym.MIN, yycolumn, yyline, yytext());}
"console"   {return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext());}
"char[]"    {return new Symbol(sym.CHAR, yycolumn, yyline, yytext());}
"double"    {return new Symbol(sym.DOUB, yycolumn, yyline, yytext());}
"print"     {return new Symbol(sym.PRINT, yycolumn, yyline, yytext());}
"column"     {return new Symbol(sym.COLUMN, yycolumn, yyline, yytext());}

//Simbolos
"("         {return new Symbol(sym.PARIZQ, yycolumn, yyline, yytext());}
")"         {return new Symbol(sym.PARDER, yycolumn, yyline, yytext());}
"["         {return new Symbol(sym.CORIZQ, yycolumn, yyline, yytext());}
"]"         {return new Symbol(sym.CORDER, yycolumn, yyline, yytext());}
":"         {return new Symbol(sym.DOSP, yycolumn, yyline, yytext());}
"::"        {return new Symbol(sym.DOSPD, yycolumn, yyline, yytext());}
","         {return new Symbol(sym.COMA, yycolumn, yyline, yytext());}
";"         {return new Symbol(sym.PYC, yycolumn, yyline, yytext());}
"<-"        {return new Symbol(sym.FLECHA, yycolumn, yyline, yytext());}
"->"        {return new Symbol(sym.FLECHAD, yycolumn, yyline, yytext());}
"@"         {return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());}
"="         {return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());}
"<"         {return new Symbol(sym.MENORQUE, yycolumn, yyline, yytext());}
">"         {return new Symbol(sym.MAYORQUE, yycolumn, yyline, yytext());}
"!"         {return new Symbol(sym.EXCL, yycolumn, yyline, yytext());}

{double}    {func.funciones.lista_tokens.add(yytext()); return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext()); }
{cadena}    {func.funciones.lista_tokens.add(yytext()); return new Symbol(sym.CADENA, yycolumn, yyline, yytext()); }
{id}        {func.funciones.lista_tokens.add(yytext()); return new Symbol(sym.ID, yycolumn, yyline, yytext()); }


//------> Ignorados 
[ \t\r\n\f]     {}

//------> Errores Léxicos 
//Agregar en vez de print, la lista de errores y jalar el texto, fila y columna

.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }
