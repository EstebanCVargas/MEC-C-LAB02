import java.util.HashMap;
import java.util.Scanner;

public class Cadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese una línea de caracteres: ");
        String linea = sc.nextLine();

        
        char[] caracteres = linea.toCharArray();
        HashMap<Character, Integer> frecuencias = new HashMap<>();
        for (char c : caracteres) {
            if (esVocal(c)) {
                continue; 
            }
            if (frecuencias.containsKey(c)) {
                frecuencias.put(c, frecuencias.get(c) + 1);
            } else {
                frecuencias.put(c, 1);
            }
        }
        char caracter_que_mas_se_repite = ' ';
        int maxFrecuencia = 0;
        for (char c : frecuencias.keySet()) {
            if (frecuencias.get(c) > maxFrecuencia) {
                caracter_que_mas_se_repite  = c;
                maxFrecuencia = frecuencias.get(c);
            }
        }
        for (int i = 0; i < caracteres.length; i++) {
            if (esVocal(caracteres[i])) {
                caracteres[i] = caracter_que_mas_se_repite ;
            }
        }
        String sustituida = new String(caracteres);

        
        StringBuilder invertida = new StringBuilder(sustituida);
        invertida.reverse();

        System.out.println("La línea procesada es: " + invertida);
    }

    public static boolean esVocal(char c) {
        return "aeiou_AEIOU".indexOf(c) != -1;
    }
}