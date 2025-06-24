import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia y Lengua)
        // en una lista, pregunte al usuario la nota que ha sacado en cada asignatura, y después las muestre por pantalla con el mensaje En <asignatura>
        // has sacado <nota> donde <asignatura> es cada una des las asignaturas de la lista y <nota> cada una de las correspondientes notas introducidas por el usuario.
        Scanner sc = new Scanner(System.in);
        List<String> asignaturas = new ArrayList<>();
        List<Integer> notas = new ArrayList<>();
        asignaturas.add("Matematicas");
        asignaturas.add("Programacion II");
        asignaturas.add("Desarrollo web");
        asignaturas.add("Seguridad Informatica");
        for(String asignatura: asignaturas){
            System.out.println("Cual es tu nota en "+asignatura +" ?");
            int nota = sc.nextInt();
            notas.add(nota);
        }
        for(int indice=0; indice < asignaturas.size(); indice++){
            System.out.println("En la asignatura "+asignaturas.get(indice) + "Tiene la nota de: "+notas.get(indice));
        }
    }
}
