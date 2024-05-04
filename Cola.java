public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> finalCola;
    private int longitud;

    public Cola() {
        this.frente = null;
        this.finalCola = null;
        this.longitud = 0;
    }

    public void insertar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (esVacia()) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
        longitud++;
    }

    public T retirar() {
        if (!esVacia()) {
            T elementoRetirado = frente.dato;
            frente = frente.siguiente;
            longitud--;
            return elementoRetirado;
        } else {
            System.err.println("La cola está vacía. No se puede retirar ningún elemento.");
            return null; // Valor de retorno para indicar un error
        }
    }

    public void consultar() {
        Nodo<T> actual = frente;
        System.out.print("Elementos en la cola:");
        while (actual != null) {
            System.out.print(" " + actual.dato);
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public int longitud() {
        return longitud;
    }

    public boolean esVacia() {
        return frente == null;
    }
}
