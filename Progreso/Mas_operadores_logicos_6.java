package Progreso;

import java.util.Scanner;

public class Mas_operadores_logicos_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edadUser = input.nextInt();
        System.out.print("Ingrese si posee una entrada (True/False): ");
        boolean entradaUser = input.nextBoolean();

        if (edadUser >= 18 && entradaUser){
            System.out.println("Puedes ingresar.");
        }

        else if (edadUser >= 18 && !entradaUser){
            System.out.println("Necesitas una entrada.");
        }

        else{
            System.out.println("No puedes ingresar.");
        }

        input.close();
    }
}
