package Ejercicio_3;

public class Main_3 {
    public static void main(String[] args) {
        ListaAsignatura curso = new ListaAsignatura();

        // Agregar asignaturas
        curso.agregar("Matemáticas");
        curso.agregar("Física");
        curso.agregar("Química");
        curso.agregar("Historia");
        curso.agregar("Lengua");

        // Pedir notas
        curso.pedir_notas();

        // Mostrar resultados
        curso.mostrar();
    }
}
