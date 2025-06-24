import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> loteria = new ArrayList<>();
        for(int i=0; i < 6; i++){
            System.out.println("Introduce un numero ganador: ");
            int numero = sc.nextInt();
            loteria.add(numero);
        }
        Collections.sort(loteria); //Ordena de menor a mayor
        System.out.println(loteria);
    }
}
