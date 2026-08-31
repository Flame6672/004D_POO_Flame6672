package Entendimiento_TodoCode;

public class Alumno {
    
    int id;
    String nombre;
    String apellido;
    int edad;

    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y sé decir mi nombre");
    }
    
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }



    public void saberAprobado(double calificacion){
        if (calificacion >= 4) {
            System.out.println("Aprobe la unidad :]");
        }
        else {
            System.out.println("No aprobé la unidad :/");
        }
    }
}
