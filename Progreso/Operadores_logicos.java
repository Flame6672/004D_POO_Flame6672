package Progreso;

import java.util.Scanner;

public class Operadores_logicos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edadUser = input.nextInt();
        System.out.print("Ingrese su estatura en centimetros: ");
        int estaturaUser = input.nextInt();

        if (edadUser < 18) {
            System.out.println("No puedes ingresar :(");
        }

        else if (edadUser > 18 && estaturaUser <= 160) {
            System.out.println("Puedes ingresar, pero no cumples con el requisito de estatura :|");
        }

        else {
            System.out.println("¡Puedes ingresar! :D");
        }
    input.close();
    }
}
