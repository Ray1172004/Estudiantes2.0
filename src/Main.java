public class Main {
    public static void main(String[] args) {

        // Creamos un objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante();

        // Ingresamos los datos del estudiante
        estudiante.ingresarDatos();

        // Imprimimos el contenido del estudiante
       // estudiante.imprimirDatos();

        // Imprimimos las materias del estudiante
        estudiante.imprimirMaterias();

        // Imprimimos los nombres de los profesores del estudiante
        estudiante.imprimirTodosProfesores();
    }
}

