package Entendimiento_TodoCode;

public class POO {
    public static void main(String[] args) {

    Alumno a1 = new Alumno();
    Alumno a2 = new Alumno(002, "Eustaquio", "Barrientos", 18);
    System.out.println("La id del alumno 2 es: " + a2.getId());
    System.out.println("El nombre del alumno es: " + a2.getNombre());
    System.out.println("El apellido del alumno es: " + a2.getApellido());
    System.out.println("La edad del alumno es: " + a2.getEdad());
    System.out.println("======================================");

    a1.setId(1);
    a1.setNombre("Pepito");
    a1.setApellido("Gatete");
    a1.setEdad(10);

    System.out.println("La id del alumno 1 es: " + a1.getId());
    System.out.println("El nombre del alumno es: " + a1.getNombre());
    System.out.println("El apellido del alumno es: " + a1.getApellido());
    System.out.println("La edad del alumno es: " + a1.getEdad());
    }
}
