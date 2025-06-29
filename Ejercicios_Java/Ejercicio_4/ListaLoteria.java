package Ejercicio_4;

import java.util.Scanner;

public class ListaLoteria {
    Nodo cabeza;
    Scanner scanner = new Scanner(System.in);

    // Método para insertar números manteniendo el orden
    public void insertarOrdenado(int numero) {
        Nodo nuevo = new Nodo(numero);

        //Lista vacía o nuevo número es menor que la cabeza
        if (cabeza == null || numero < cabeza.numero) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            //Buscar la posición correcta
            Nodo actual = cabeza;
            while (actual.siguiente != null && actual.siguiente.numero < numero) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

    // Método para pedir los números al usuario
    public void pedirNumeros() {
        System.out.println("Introduce los 6 números ganadores (entre 1 y 49):");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = scanner.nextInt();

            // Validar rango
            while (num < 1 || num > 49) {
                System.out.println("Número no válido. Debe estar entre 1 y 49.");
                System.out.print("Número " + (i + 1) + ": ");
                num = scanner.nextInt();
            }

            insertarOrdenado(num);
        }
    }
    public void mostrarNumeros() {
        System.out.println("\nNúmeros ganadores ordenados:");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.numero + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
