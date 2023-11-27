import java.util.ArrayList;
import java.util.List;

// Clase para representar a un estudiante
class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase para representar un profesor
class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase que representa un aula que contiene estudiantes y un profesor
class Aula {
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Aula(Profesor profesor) {
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarListaEstudiantes() {
        System.out.println("Lista de estudiantes en el aula:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.getNombre());
        }
    }

    public void mostrarInformacionProfesor() {
        System.out.println("Profesor del aula: " + profesor.getNombre());
    }
}

public class Composicion {
    public static void main(String[] args) {
        // Crear un profesor
        Profesor profesorPrincipal = new Profesor("Profesor Smith");

        // Crear un aula con el profesor
        Aula aula1 = new Aula(profesorPrincipal);

        // Agregar estudiantes al aula
        Estudiante estudiante1 = new Estudiante("Estudiante A");
        Estudiante estudiante2 = new Estudiante("Estudiante B");

        aula1.agregarEstudiante(estudiante1);
        aula1.agregarEstudiante(estudiante2);

        // Mostrar información del aula
        aula1.mostrarInformacionProfesor();
        aula1.mostrarListaEstudiantes();
    }
}
