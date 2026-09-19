package Progreso;

import java.util.Scanner;

public class Refuerzo_Operadores_Logicos_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edadUser = input.nextInt();
        System.out.print("¿Tiene permiso especial? (True/False): ");
        boolean permisoUser = input.nextBoolean();
        System.out.print("¿Esta baneado? (True/False): ");
        boolean estadobanUser = input.nextBoolean();

        if (edadUser >= 18 && !estadobanUser){
            System.out.println("Puede entrar");
            System.out.println("Razón: Edad suficiente y no está registrado en la lista de clientes no permitidos");

        }

        else if (edadUser < 18 && permisoUser && !estadobanUser) {
            System.out.println("Puede entrar");
            System.out.println("Razón: Posee autorización y no está registrado en la lista de clientes no permitidos");
        }

        else if (estadobanUser){
            System.out.println("Entrada no admitida");
            System.out.println("Razón: El cliente está registrado en la lista de clientes no permitidos");
        }

        else {
            System.out.println("Entrada no admitida");
            System.out.println("Razón: Edad insuficiente y no posee autorización");
        }

    input.close();
    }
}
