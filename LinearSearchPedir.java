import java.util.Scanner;

public class LinearSearchPedir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número que desea buscar: ");
        int valorBuscado = scanner.nextInt();

        int indice = busquedaLineal(numeros, valorBuscado);

        if (indice != -1) {
            System.out.println("El número " + valorBuscado + " se encuentra en la posición " + indice + ".");
        } else {
            System.out.println("El número " + valorBuscado + " no se encuentra en la lista.");
        }

        scanner.close();
    }

    public static int busquedaLineal(int[] array, int objetivo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == objetivo) {
                return i; // Se encontró el elemento, devuelve su índice.
            }
        }
        return -1; // El elemento no está presente en el array.
    }
}
