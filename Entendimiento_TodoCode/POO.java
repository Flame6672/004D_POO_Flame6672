package Entendimiento_TodoCode;

public class POO {
    public static void main(String[] args) {

    Alumno a1 = new Alumno();
    Alumno a2 = new Alumno(001, "Juan", "Barrientos", 18);

    System.out.println("La id de el alumno 1 es: " + a1.getId());
    System.out.println("La id de el alumno 2 es: " + a2.getId());
    }
}
