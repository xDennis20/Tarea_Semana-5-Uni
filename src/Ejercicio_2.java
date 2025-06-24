import java.util.ArrayList;
import java.util.List;

public class Ejercicio_2 {
    public static void main(String[] args) {
        //Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia y Lengua)
        // en una lista y la muestre por pantalla el mensaje Yo estudio <asignatura>, donde <asignatura> es cada una de las asignaturas de la lista.
        List<String> asignaturas = new ArrayList<>();
        asignaturas.add("Matematicas");
        asignaturas.add("Programacion II");
        asignaturas.add("Desarrollo web");
        asignaturas.add("Seguridad Informatica");
        for(String asignatura: asignaturas){
            System.out.println("Yo estudio: "+asignatura);
        }
    }
}
