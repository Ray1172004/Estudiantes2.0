import java.awt.*;
import java.util.Scanner;

public class Materias{
    //atributos
    private String nombre="";
    private int nrc=0;
    private String numHoras="";

    //Objetos
    private Profesor profesor1;
    private Profesor profesor2;
    private Profesor profesor3;


    public Materias(){

    }

    public Materias(String nombre, int nrc, String numHoras, Profesor profesor1, Profesor profesor2, Profesor profesor3, Profesor profesor) {
        this.nombre = nombre;
        this.nrc = nrc;
        this.numHoras = numHoras;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.profesor3 = profesor3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public String getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(String numHoras) {
        this.numHoras = numHoras;
    }

    public Profesor getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public Profesor getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesor profesor2) {
        this.profesor2 = profesor2;
    }

    public Profesor getProfesor3() {
        return profesor3;
    }

    public void setProfesor3(Profesor profesor3) {
        this.profesor3 = profesor3;
    }


    public void ingresarDatos(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos de la materia: \n"+i);
        String nombre = sc.next();
        System.out.println("Ingresar el NRC de las materias: \n"+i);
        int nrc = sc.nextInt();
        System.out.println("Ingresar el numero de horas: \n"+i);
        String numHoras = sc.next();
    }
    //NULL POINT EXEPCTION ews que no hay una instancia del objeto
    public void imprimirprofesor(int i){
        if (i==1){
            profesor1=new Profesor();
            profesor1.ingresarDatos(i);
        }else if(i==2){
            profesor2=new Profesor();
            profesor2.ingresarDatos(i);
        }else if(i==3){
            profesor3=new Profesor();
            profesor3.ingresarDatos(i);
        }
    }
}

