package Caso_Negocio;

public class Tienda {
    public static void main(String[] args) {
        Producto mario = new Producto("Mario", 20000, 50);
        System.out.println(mario.getPrecioBase());
    }
}
