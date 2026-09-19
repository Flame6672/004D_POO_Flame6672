package Progreso;

import java.util.Scanner;

public class While_y_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroUser = -1;

        while (numeroUser != 0) {
        System.out.print("Ingrese un numero: ");
        int numeroIngresado = input.nextInt();
        numeroUser = numeroIngresado;           
        }
        System.out.println("¡Se ingresó 0! Programa terminado");
        input.close();
    }
}
