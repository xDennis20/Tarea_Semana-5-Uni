package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        ListaSimple curso = new ListaSimple();

        curso.agregar("Matemáticas");
        curso.agregar("Física");
        curso.agregar("Química");
        curso.agregar("Historia");
        curso.agregar("Lengua");

        curso.mostrar();
    }
}
