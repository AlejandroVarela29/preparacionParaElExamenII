public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 45, 50, 67};
        int target = 23;

        int resultado = busquedaBinaria(array, target);

        if (resultado != -1) {
            System.out.println("El elemento " + target + " se encuentra en la posición " + resultado + ".");
        } else {
            System.out.println("El elemento " + target + " no se encuentra en el array.");
        }
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
