package Desafios_55;

public class Problema_1 {
    public static void main(String[] args) {
        int sueldoBase = 500000;
        int bonoColacion = 50000;
        int bonoMovilizacion = 30000;

        double sueldoProcesado = (sueldoBase * 0.83);
        double sueldoLiquido = sueldoProcesado + bonoColacion + bonoMovilizacion;
        
        System.out.println(sueldoLiquido);
    }
}
