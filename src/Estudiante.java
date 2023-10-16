import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Estudiante {
    private int idBanner=0;
    private int cedula=0;
    private String nombre="";
    private Materias materia1;
    private Materias materia2;
    private Materias materia3;

    public Estudiante(){

    }

    public Estudiante(int idBanner, int cedula, String nombre, Materias materia1, Materias materia2, Materias materia3) {
        this.idBanner = idBanner;
        this.cedula = cedula;
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    public void imprimirMaterias(){
        String nomMateria1 =materia1.getNombre();
        int nrc1 = materia1.getNrc();
        System.out.println("La materia 1 es: \n"+nomMateria1+"Y su respectivo NRC: \n"+nrc1);
        String nomMateria2 =materia2.getNombre();
        int nrc2 = materia2.getNrc();
        System.out.println("La materia 2 es: \n"+nomMateria2+"Y su respectivo NRC: \n"+nrc2);
        String nomMateria3 =materia3.getNombre();
        int nrc3 = materia3.getNrc();
        System.out.println("La materia 3 es: \n"+nomMateria2+"Y su respectivo NRC: \n"+nrc3);
    }
    public void imprimirTodosProfesores() {
        String nomMateria1Profesor1 = materia1.getProfesor1().getNombre();
        System.out.println("El nombre del profesor 1 de la materia: " + materia1.getNombre() + " es: " + nomMateria1Profesor1);
        String nomProfesor2Materia2 = materia2.getProfesor2().getNombre();
        System.out.println("El nombre del profesor 2 de la materia: " + materia2.getNombre() + " es: " + nomProfesor2Materia2);
        String nomProfesor3Materia3 = materia3.getProfesor3().getNombre();
        System.out.println("El nombre del profesor 3 de la materia: " + materia3.getNombre() + " es: " + nomProfesor3Materia3);
    }
        public void ingresarDatos(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del estudiante: \n");
            String nombre = sc.next();
            System.out.println("Ingresar la ceulda de Estudiante: \n");
            int cedula = sc.nextInt();
            System.out.println("Ingresar el Id Banner del Estudiante: \n");
            int idBanner = sc.nextInt();
        }
    }
