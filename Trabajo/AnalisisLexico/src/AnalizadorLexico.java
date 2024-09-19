import java.io.*;
import java.util.regex.*;

/**
 * Programa que implementa un analizador lexico para
 * identificadores de solo letras, numeros enteros y
 * reales, espacios en blanco y operadores de asignacion y suma
 * @author Garcia Hernandez Jose Antonio
 * @version 1.0
 */

public class AnalizadorLexico {
    
    // Definimos las expresiones regulares (regex) como patrones
    private static final String REGEX_ID = "[a-zA-Z]+";
    private static final String REGEX_ENTERO = "[0-9]+";
    private static final String REGEX_REAL = "[0-9]+\\.[0-9]+";
    private static final String REGEX_ESPACIO = "[\\s]+";
    private static final String REGEX_OPERADOR = "::=|\\+";

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java AnalizadorLexico <archivo>");
            return;
        }

        try {
            // Abrimos el archivo de entrada
            BufferedReader lector = new BufferedReader(new FileReader(args[0]));
            String linea;

            // Se lee el archivo linea por linea
            while ((linea = lector.readLine()) != null) {
                // Quitamos espacios extra al inicio y final de la línea
                linea = linea.trim();
                
                // Se crea un patron combinando todas las expresiones regulares
                Pattern patron = Pattern.compile(
                    String.format("%s|%s|%s|%s|%s",
                        REGEX_ID, REGEX_REAL, REGEX_ENTERO, REGEX_OPERADOR, REGEX_ESPACIO));
                Matcher matcher = patron.matcher(linea);

                // Procesamos los tokens encontrados en las lineas del archivo
                while (matcher.find()) {
                    String token = matcher.group();
                    
                    if (token.matches(REGEX_ID)) {
                        System.out.println("TOKEN: [ID] " + token);
                    } else if (token.matches(REGEX_REAL)) {
                        System.out.println("TOKEN: [REAL] " + token);
                    } else if (token.matches(REGEX_ENTERO)) {
                        System.out.println("TOKEN: [ENTERO] " + token);
                    } else if (token.matches(REGEX_OPERADOR)) {
                        System.out.println("TOKEN: [OPERADOR] " + token);
                    } else if (token.matches(REGEX_ESPACIO)) {
                        // Los espacios en blanco no se van a imprimir como tokens
                        continue;
                    }
                }
            }

            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
