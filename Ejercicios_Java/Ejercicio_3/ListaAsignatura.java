package Ejercicio_3;

import java.util.Scanner;

public class ListaAsignatura {
    Nodo cabeza;
    Scanner sc = new Scanner(System.in);

    public void agregar(String valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void pedir_notas(){
        Nodo actual = cabeza;
        while (actual != null){
            System.out.println("¿Que nota has sacado en "+actual.asignatura+"?");
            actual.nota = sc.nextDouble();
            actual = actual.siguiente;
        }

    }
    public void mostrar() {
        Nodo actual = cabeza;
        System.out.println("\nResultados: ");
        while (actual != null) {
            System.out.println("En " + actual.asignatura + "has sacado de nota" + actual.nota);
            actual = actual.siguiente;
        }
    }
}
