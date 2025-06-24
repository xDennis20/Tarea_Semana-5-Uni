import java.util.ArrayList;
import java.util.List;

public class Ejercicio_2 {
    public static void main(String[] args) {
        List<String> asignaturas = new ArrayList<>();
        asignaturas.add("Matematicas");
        asignaturas.add("Programacion II");
        asignaturas.add("Desarrollo web");
        asignaturas.add("Seguridad Informatica");
        for(String asginatura: asignaturas){ //For each
            System.out.println("Yo estudio: "+asginatura);
        }
    }
}
