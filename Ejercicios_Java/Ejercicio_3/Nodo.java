package Ejercicio_3;

public class Nodo {
    String asignatura;
    double nota;
    Nodo siguiente;

    public Nodo(String dato){
        this.asignatura = dato;
        this.nota = 0.0;
        this.siguiente = null;
    }
}
