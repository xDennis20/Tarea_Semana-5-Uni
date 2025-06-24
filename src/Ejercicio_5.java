import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        //Escribir un programa que pida al usuario una palabra y muestre por pantalla el número de veces que contiene cada vocal.
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine().toLowerCase(Locale.ROOT);
        int contadora = 0;
        int contadore = 0;
        int contadori = 0;
        int contadoro = 0;
        int contadoru = 0;
        for(int i=0; i < palabra.length();i++){
            char letra = palabra.charAt(i);
            switch (letra){
                case 'a':
                    contadora++;
                    break;
                case 'e':
                    contadore++;
                    break;
                case 'i':
                    contadori++;
                    break;
                case 'o':
                    contadoro++;
                    break;
                case 'u':
                    contadoru++;
                    break;

            }
        }
        System.out.println("La palabra "+ palabra + "tiene las siguientes cantidades de vocales repetidas:");
        System.out.println("Contador de la vocal a: "+ contadora);
        System.out.println("Contador de la vocal e: "+ contadore);
        System.out.println("Contador de la vocal i: "+ contadori);
        System.out.println("Contador de la vocal o: "+ contadoro);
        System.out.println("Contador de la vocal u: "+ contadoru);
    }
}
