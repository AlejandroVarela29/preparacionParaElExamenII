public class QuickSortAscendeteaDecente {

    public static void main(String[] args) {
        int[] numeros = {45, 12, 67, 23, 9, 56, 31};

        System.out.println("Números sin ordenar:");
        imprimirNumeros(numeros);

        // Llamada al algoritmo de QuickSort
        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("\nNúmeros ordenados de manera descendente a ascendente:");
        imprimirNumeros(numeros);
    }

    public static void quickSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            // Encuentra el índice del pivote
            int indicePivote = particion(arr, izquierda, derecha);

            // Ordena recursivamente los elementos a la izquierda y derecha del pivote
            quickSort(arr, izquierda, indicePivote - 1);
            quickSort(arr, indicePivote + 1, derecha);
        }
    }

    public static int particion(int[] arr, int izquierda, int derecha) {
        int pivote = arr[derecha];
        int i = izquierda - 1;

        for (int j = izquierda; j < derecha; j++) {
            if (arr[j] >= pivote) {
                i++;

                // Intercambia arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambia arr[i+1] y arr[derecha] (pivote)
        int temp = arr[i + 1];
        arr[i + 1] = arr[derecha];
        arr[derecha] = temp;

        return i + 1;
    }

    public static void imprimirNumeros(int[] arr) {
        for (int numero : arr) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
