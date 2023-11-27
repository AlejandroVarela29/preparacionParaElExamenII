import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchPedir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Ingrese los elementos del array (ordenados):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el elemento a buscar: ");
        int target = scanner.nextInt();

        // Ordenar el array (la búsqueda binaria requiere un array ordenado)
        Arrays.sort(array);

        int resultado = busquedaBinaria(array, target);

        if (resultado != -1) {
            System.out.println("El elemento " + target + " se encuentra en la posición " + resultado + ".");
        } else {
            System.out.println("El elemento " + target + " no se encuentra en el array.");
        }

        scanner.close();
    }

    public static int busquedaBinaria(int[] array, int objetivo) {
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (array[medio] == objetivo) {
                return medio; // Se encontró el elemento, devuelve su índice.
            } else if (array[medio] < objetivo) {
                izquierda = medio + 1; // El objetivo está en la mitad derecha.
            } else {
                derecha = medio - 1; // El objetivo está en la mitad izquierda.
            }
        }

        return -1; // El elemento no está presente en el array.
    }
}
