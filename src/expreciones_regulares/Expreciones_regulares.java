/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expreciones_regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juano
 */
public class Expreciones_regulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 
        
        String texto = "la placa es: RZW456 y el codigo postal es 050001 mi numero de telefono es: 2124012 y lo llamada al celular: (313)6243833 yo vivo en "
                + "en la carrera 44 # calle 80-31 mi correo electronico es camilo@elpoli.com.co naci el 13/03/1986 a las 01:34:56 y ha muerto a las 23:59:59"
                + "mi cedula de ciudadania es 1036600142 y mi cedula de ciudadania es 1036600134 int camilo; double pepito; String gonorrea; mi paguina es https://www.example.com "
                + "mi nombre es Juan Camilo Muñoz Ospina y como es el Tuyo mi contraseña es: Micontrasena123$ mi temperatura es de 78456.78";
          
        String contraseña = "MiContrasena123$";
       
                                        
        String placa = "[A-Z]{3}[0-9]{3}";
        String CodigoPostal = "05\\d{4}";
        String TelMed = "\\d{7}";
        String NumCel = "\\(3\\d{2}\\)\\d{7}\\b";
        String DirMede = "(calle|carrera|circular|diagonal)\\s+\\d+\\s+#(\\s*(calle|carrera|circular|diagonal)\\s+\\d+)?(-\\s*\\d+)?";
        String CorrElc = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";        
        String FromFecha = "(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4}";
        String Hora = "(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])";
        String Cedula = "(cedula de ciudadania es|CC)\\s*\\d{7,11}";
        String DecJava = "(int|double|String)\\s+[a-zA-Z_$][a-zA-Z_$0-9]*\\s*;?";
        String Url = "(https?|ftp)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(?:/[^\\s]*)?";
        String Nombre = "(?:[A-ZÁÉÍÓÚÑ][a-záéíóúñ]+\\s?){2,}";
        String Contraseña = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=])(?!\\s).{8,}";
        String NumDou = "[+-]?\\d{1,100}\\.\\d+";
  
        String resultado =" "+ encontrarCoincidencias(texto, placa)+ "\n";        
        resultado = resultado + " " + encontrarCoincidencias(texto, CodigoPostal)+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, TelMed)+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, NumCel)+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, DirMede)+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, CorrElc)+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, FromFecha)+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, Hora )+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, Cedula )+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, DecJava )+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, Url )+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, Nombre )+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(contraseña, Contraseña )+ "\n";
        resultado = resultado + " " + encontrarCoincidencias(texto, NumDou )+ "\n";
         
        System.out.println(resultado);
    }
    
/*    
public static String encontrarCoincidencias(String texto, String expresionRegular) {
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher matcher = patron.matcher(texto);
        StringBuilder resultado = new StringBuilder( );
        resultado.append("no se ha encontrado nada con el patron: " + expresionRegular) ;
        
        while (matcher.find()) {
            resultado.setLength(0);
            resultado.append(matcher.group()).append("\n");
        }
        
        return resultado.toString();
    }   
*/

public static String encontrarCoincidencias(String texto, String expresionRegular) {
    Pattern patron = Pattern.compile(expresionRegular);
    Matcher matcher = patron.matcher(texto);
    String resultado = "";
    boolean coincidenciaEncontrada = false;

    while (matcher.find()) {
        if (!coincidenciaEncontrada) {
            coincidenciaEncontrada = true;
            resultado = "se ha encontrado la expresión " +expresionRegular + " : ";
            
        }
        resultado += " "+ matcher.group() + " , ";
    }

    if (!coincidenciaEncontrada) {
        resultado += "No se ha encontrado la expresión regular: " + expresionRegular;
    }

    return resultado;
}

    
    
    
    
    
    
}
