import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Profesor {
    private String nombre="";
    private int cedula=0;
    private int idProfesor=0;

    public Profesor(){

    }

    public Profesor(String nombre, int cedula, int idProfesor) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public void ingresarDatos(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del porfesor: \n"+i);
        String nombre = sc.next();
        System.out.println("Cedula del profesor del profesor: \n"+i);
        int cedula = sc.nextInt();
        System.out.println("ID banner del profesor: \n"+i);
        int idProfesor = sc.nextInt();
    }






}

