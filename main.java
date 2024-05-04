import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cola<Integer> cola = null;

        int opcion;
        do {
            System.out.println("\n--- Menú de Cola ---");
            System.out.println("1. Construir o inicializar la COLA");
            System.out.println("2. Insertar elementos a la COLA");
            System.out.println("3. Retiro de un elemento de la COLA");
            System.out.println("4. Consultar la COLA");
            System.out.println("5. Determinar el número de elementos de la COLA");
            System.out.println("6. Determinar si la COLA es vacía");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        cola = new Cola<>();
                        System.out.println("COLA inicializada.");
                        break;
                    case 2:
                        if (cola == null) {
                            System.out.println("Error: La cola no ha sido inicializada.");
                            break;
                        }
                        System.out.print("Ingrese el elemento a insertar (entero): ");
                        if (scanner.hasNextInt()) {
                            int elementoInsertar = scanner.nextInt();
                            cola.insertar(elementoInsertar);
                            System.out.println("Elemento insertado correctamente.");
                        } else {
                            System.out.println("Error: Ingrese un valor entero.");
                            scanner.next(); // Limpiar el buffer del scanner
                        }
                        break;
                    case 3:
                        if (cola == null) {
                            System.out.println("Error: La cola no ha sido inicializada.");
                            break;
                        }
                        Integer elementoRetirado = cola.retirar();
                        if (elementoRetirado != null) {
                            System.out.println("Elemento retirado de la cola: " + elementoRetirado);
                        }
                        break;
                    case 4:
                        if (cola == null) {
                            System.out.println("Error: La cola no ha sido inicializada.");
                            break;
                        }
                        cola.consultar();
                        break;
                    case 5:
                        if (cola == null) {
                            System.out.println("Error: La cola no ha sido inicializada.");
                            break;
                        }
                        System.out.println("Número de elementos en la cola: " + cola.longitud());
                        break;
                    case 6:
                        if (cola == null) {
                            System.out.println("Error: La cola no ha sido inicializada.");
                            break;
                        }
                        System.out.println("La cola está vacía: " + cola.esVacia());
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            } else {
                System.out.println("Error: Ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
                opcion = -1; // Establecer una opción inválida para repetir el bucle
            }
        } while (opcion != 0);

        scanner.close();
    }
}
