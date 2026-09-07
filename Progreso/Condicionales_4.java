package Progreso;

import java.util.Scanner;

public class Condicionales_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nota: ");
        int nota = input.nextInt();

        if (nota < 4) {
            System.out.println("Nota insuficiente");
        }
        else if (nota > 5) {
            System.out.println("Muy buena nota");
        }
        else {
            System.out.println("Nota aprobada");
        }
input.close();
    }
}
