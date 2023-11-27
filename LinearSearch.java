public class LinearSearch {

    public static void main(String[] args) {
        int[] numeros = {10, 25, 7, 42, 15, 30, 18};
        int valorBuscado = 15;

        int indice = busquedaLineal(numeros, valorBuscado);

        if (indice != -1) {
            System.out.println("El número " + valorBuscado + " se encuentra en la posición " + indice + ".");
        } else {
            System.out.println("El número " + valorBuscado + " no se encuentra en la lista.");
        }
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
