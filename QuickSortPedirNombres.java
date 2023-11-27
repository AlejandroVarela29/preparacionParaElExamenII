import java.util.Scanner;

public class QuickSortPedirNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de nombres: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea después del entero

        String[] nombres = new String[n];

        System.out.println("Ingrese los nombres:");
        for (int i = 0; i < n; i++) {
            nombres[i] = scanner.nextLine();
        }

        System.out.println("\nNombres sin ordenar:");
        imprimirNombres(nombres);

        // Llamada al algoritmo de QuickSort
        quickSort(nombres, 0, nombres.length - 1);

        System.out.println("\nNombres ordenados:");
        imprimirNombres(nombres);

        scanner.close();
    }

    // (resto del código sigue igual)
    public static void quickSort(String[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            // Encuentra el índice del pivote
            int indicePivote = particion(arr, izquierda, derecha);

            // Ordena recursivamente los elementos a la izquierda y derecha del pivote
            quickSort(arr, izquierda, indicePivote - 1);
            quickSort(arr, indicePivote + 1, derecha);
        }
    }

    public static int particion(String[] arr, int izquierda, int derecha) {
        String pivote = arr[derecha];
        int i = izquierda - 1;

        for (int j = izquierda; j < derecha; j++) {
            if (arr[j].compareToIgnoreCase(pivote) <= 0) {
                i++;

                // Intercambia arr[i] y arr[j]
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambia arr[i+1] y arr[derecha] (pivote)
        String temp = arr[i + 1];
        arr[i + 1] = arr[derecha];
        arr[derecha] = temp;

        return i + 1;
    }

    public static void imprimirNombres(String[] arr) {
        for (String nombre : arr) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }
}
