package Ejercicio_1;

public class ListaSimple {
    Nodo cabeza;

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

    public void mostrar(){
        Nodo actual = cabeza;
        System.out.println("Asignatura");
        while(actual!=null){
            System.out.println("- "+actual.asignatura);
            actual = actual.siguiente;
        }
    }
}
